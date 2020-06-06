package org.springboot.blog.project.blogs.bean;

import java.io.Serializable;

import org.springboot.blog.project.blogs.dto.BlogDto;


public class BlogBean  extends BlogDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String userName;       //博主 
	private String userPhoto;      //头像
	private String blogText;       //博客内容
	private String sumComment;     //评论总数
	
	
	public String getSumComment() {
		return sumComment;
	}
	public void setSumComment(String sumComment) {
		this.sumComment = sumComment;
	}
	public String getUserPhoto() {
		return userPhoto;
	}
	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}
	public String getBlogText() {
		return blogText;
	}
	public void setBlogText(String blogText) {
		this.blogText = blogText;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
