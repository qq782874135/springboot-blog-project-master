package org.springboot.blog.project.blogs.bean;

import java.io.Serializable;
import java.util.Date;

import org.springboot.blog.project.blogs.dto.BlogCommentDto;

public class BlogCommentBean extends BlogCommentDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Long replyId;
	private String replyText;
	private Long parentId;
	private Long replyUserId;
	private Date replyCreateDate;
	private Long replyState;
	public Long getReplyId() {
		return replyId;
	}
	public void setReplyId(Long replyId) {
		this.replyId = replyId;
	}
	public String getReplyText() {
		return replyText;
	}
	public void setReplyText(String replyText) {
		this.replyText = replyText;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Long getReplyUserId() {
		return replyUserId;
	}
	public void setReplyUserId(Long replyUserId) {
		this.replyUserId = replyUserId;
	}
	public Date getReplyCreateDate() {
		return replyCreateDate;
	}
	public void setReplyCreateDate(Date replyCreateDate) {
		this.replyCreateDate = replyCreateDate;
	}
	public Long getReplyState() {
		return replyState;
	}
	public void setReplyState(Long replyState) {
		this.replyState = replyState;
	}

}
