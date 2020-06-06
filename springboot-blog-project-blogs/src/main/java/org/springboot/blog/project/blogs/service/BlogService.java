package org.springboot.blog.project.blogs.service;

import java.util.List;
import java.util.Map;

import org.springboot.blog.project.blogs.bean.BlogBean;
import org.springboot.blog.project.blogs.dto.Pages;
import org.springboot.blog.project.blogs.entity.Blog;


public interface BlogService {

	public List<BlogBean> qryBlogBaseInfo(Pages page);
	
	public Map qryBlogDetail(Long blogId);

	public Map publicBlog(Blog blog);
	
}
