package com.leo.myspringboot.beans.common;

import java.util.HashMap;
import java.util.Map;

/**
 *code is far away from bug with the animal protecting
 *　　
 *   @description : ErrorResult : 用于响应错误的请求的对象
 *   ---------------------------------
 *   @since : Create in 2017/9/19 20:57　
 */
public class ErrorResult extends Result {
	private static final long serialVersionUID = 8567221653356186674L;

	/**
	 * 封装多个 错误信息
	 */
	private Map<String, Object> errors = new HashMap<String, Object>();

	public Map<String, Object> getErrors() {
		return errors;
	}

	public void setErrors(Map<String, Object> errors) {
		this.errors = errors;
	}

	public ErrorResult() {

	}
}
