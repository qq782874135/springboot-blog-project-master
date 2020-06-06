package org.springboot.blog.project.blogs.result;

public enum ResultCode {
 
	SUCCESS("200","成功"),
	
	/** 未登录 */
	NOT_LOGIN("401", "没有登录"),

	/** 系统错误 */
	SYS_ERROR("402", "系统错误"),
	
	/** 错误 */
	ERROR("403", "错误");
	
	
	private String code;
	private String msg;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	private ResultCode(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	
	
}
