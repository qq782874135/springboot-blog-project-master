package org.springboot.blog.project.blogs.result;


/**
 * @author 杨文永
 *
 */
public class APIResult {

	private String code;
	private String message;
	private Object data;

	public APIResult() {
		this.setCode(ResultCode.SUCCESS);
		this.setMessage("成功！");

	}

	public APIResult(ResultCode code) {
		this.setCode(code);
		this.setMessage(code.getMsg());
	}

	public APIResult(ResultCode code, Object data) {
		this.setCode(code);
		this.setData(data);
	}

	public APIResult(ResultCode code, String message, Object data) {
		this.setCode(code);
		this.setMessage(message);
		this.setData(data);
	}

	public String getCode() {
		return code;
	}

	public void setCode(ResultCode code) {
		this.code = code.getCode();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
