package com.leo.myspringboot.beans.common;

import java.util.List;

/**
 * jquery datatables插件返回JSON格式化实体类
 * 
 * @author chenzg
 */
public class DatatablesJSON<T> {
	/** 请求次数 */
	private Integer draw;
	/** 总记录数 */
	private Integer recordsTotal;
	/** 过滤后的总记录数 */
	private Integer recordsFiltered;
	/** 服务器出了问题后的友好提示 */
	private String error;
	/** 具体的数据对象数组 */
	private List<T> data;
	/** 返回成功信息 */
	private Boolean success;

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public Boolean isSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getRecordsTotal() {
		return recordsTotal;
	}

	public void setRecordsTotal(Integer recordsTotal) {
		this.recordsTotal = recordsTotal;
	}

	public Integer getRecordsFiltered() {
		return recordsFiltered;
	}

	public void setRecordsFiltered(Integer recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}
