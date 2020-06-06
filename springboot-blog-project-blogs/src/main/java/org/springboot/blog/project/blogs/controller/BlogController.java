package org.springboot.blog.project.blogs.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springboot.blog.project.blogs.bean.BlogBean;
import org.springboot.blog.project.blogs.controller.basecontroller.BaseController;
import org.springboot.blog.project.blogs.dto.Pages;
import org.springboot.blog.project.blogs.entity.Blog;
import org.springboot.blog.project.blogs.entity.Userinfo;
import org.springboot.blog.project.blogs.result.APIResult;
import org.springboot.blog.project.blogs.result.ResultCode;
import org.springboot.blog.project.blogs.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageInfo;

@RequestMapping("/blog/")
@RestController
public class BlogController extends BaseController{
	
	@Autowired
	private BlogService blogServiceImpl;

	private static Logger logger=LoggerFactory.getLogger(BlogController.class);
	
	@RequestMapping(value="qryBlogBaseInfo",method = RequestMethod.POST)
	public APIResult qryBlogBaseInfo(Pages page) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			if(page==null||page.getPageNum()==0||page.getPageSize()==0) {
				page=new Pages(1, 10);
			}
			List<BlogBean> blogBaseInfo = blogServiceImpl.qryBlogBaseInfo(page);
			PageInfo info = new PageInfo(blogBaseInfo);
			result.put("total", info.getTotal());
			result.put("list", info.getList());
			return super.toResult(ResultCode.SUCCESS,result);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return super.toResult(ResultCode.ERROR, e.getMessage());
		}

	}
	
	@RequestMapping(value="qryBlogDetail",method = RequestMethod.POST)
	public APIResult qryBlogDetail(Long blogId) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
		    Map detail = blogServiceImpl.qryBlogDetail(blogId);
			result.put("result", detail);
			return super.toResult(ResultCode.SUCCESS,result);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return super.toResult(ResultCode.ERROR, e.getMessage());
		}
	}
	
	
	public APIResult publicBlog(Blog blog) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
		    Map detail = blogServiceImpl.publicBlog(blog);
			result.put("result", detail);
			return super.toResult(ResultCode.SUCCESS,result);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return super.toResult(ResultCode.ERROR, e.getMessage());
		}
	}
	
	
}
