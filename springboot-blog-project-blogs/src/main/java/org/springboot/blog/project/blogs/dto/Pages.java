package org.springboot.blog.project.blogs.dto;

/**
 * @author 杨文永
 *
 */
public class Pages {
	
    int pageNum;    //页
    int pageSize;   //行
    
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public Pages(int pageNum, int pageSize) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
	}
	
}
