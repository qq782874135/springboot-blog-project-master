package org.springboot.blog.project.blogs.controller.basecontroller;

import org.springboot.blog.project.blogs.result.APIResult;
import org.springboot.blog.project.blogs.result.ResultCode;

public class BaseController {

	public APIResult toResult(ResultCode resultCode,String message,Object data) {
		APIResult result=new APIResult(resultCode, message, data);
		return result;
	} 
	
	public APIResult toResult(ResultCode resultCode,Object data) {
		APIResult result=new APIResult(resultCode, data);
		return result;
	} 
}
