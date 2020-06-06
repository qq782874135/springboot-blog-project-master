package org.springboot.blog.project.blogs.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springboot.blog.project.blogs.bean.BlogBean;
import org.springboot.blog.project.blogs.bean.BlogCommentBean;
import org.springboot.blog.project.blogs.constant.MqConstants;
import org.springboot.blog.project.blogs.dto.Pages;
import org.springboot.blog.project.blogs.entity.Blog;
import org.springboot.blog.project.blogs.mapper.BlogCommentMapper;
import org.springboot.blog.project.blogs.mapper.BlogMapper;
import org.springboot.blog.project.blogs.service.BlogService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogMapper blogMapper;
	
	@Autowired
	private BlogCommentMapper blogCommentMapper;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public List<BlogBean> qryBlogBaseInfo(Pages page) {
		PageHelper.startPage(page);
		List<BlogBean> qryBlogBaseInfo = blogMapper.qryBlogBaseInfo();
		for (BlogBean bean : qryBlogBaseInfo) {
			BlogBean qryBlogCommentSum = blogMapper.qryBlogCommentSum(bean.getBlogId());
			bean.setSumComment(qryBlogCommentSum.getSumComment());
		}
		return qryBlogBaseInfo;
	}

	@Override
	public Map qryBlogDetail(Long blogId) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			BlogBean blog = blogMapper.qryBlogDetail(blogId);
			map.put("blog", blog);
		    List<BlogCommentBean> blogComment = blogCommentMapper.qryBlogComment(blogId);
			map.put("comment", blogComment);
		} catch (Exception e) {
			throw e;
		}
		return map;
	}

	@Override
	public Map publicBlog(Blog blog) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			int insert = blogMapper.insert(blog);
			/**
			 * 发送消息队列通知用户
			 */
			if(insert==1) {
	            rabbitTemplate.convertAndSend(MqConstants.MAIL_EXCHANGE_NAME, MqConstants.MAIL_ROUTING_KEY_NAME, blog);
			}
		} catch (Exception e) {
			throw e;
		}
		return map;
	}
}
