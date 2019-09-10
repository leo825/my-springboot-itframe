package com.leo.myspringboot.beans;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 *code is far away from bug with the animal protecting
 *  ┏┓　　　┏┓
 *┏┛┻━━━┛┻┓
 *┃　　　　　　　┃ 　
 *┃　　　━　　　┃
 *┃　┳┛　┗┳　┃
 *┃　　　　　　　┃
 *┃　　　┻　　　┃
 *┃　　　　　　　┃
 *┗━┓　　　┏━┛
 *　　┃　　　┃神兽保佑
 *　　┃　　　┃代码无BUG！
 *　　┃　　　┗━━━┓
 *　　┃　　　　　　　┣┓
 *　　┃　　　　　　　┏┛
 *　　┗┓┓┏━┳┓┏┛
 *　　　┃┫┫　┃┫┫
 *　　　┗┻┛　┗┻┛
 *　　
 *   @description : InterLog 实体类
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-17
 */
@TableName("t_inter_log")
public class InterLog extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 日志id
     */
	@ApiModelProperty("日志id")
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 请求的url
     */
	@ApiModelProperty("请求的url")
	@TableField("request_url")
	private String requestUrl;
    /**
     * 请求路径
     */
	@ApiModelProperty("请求路径")
	@TableField("request_uri")
	private String requestUri;
    /**
     * 客户端ip
     */
	@ApiModelProperty("客户端ip")
	@TableField("remote_addr")
	private String remoteAddr;
    /**
     * 客户端请求方式
     */
	@ApiModelProperty("客户端请求方式")
	@TableField("request_method")
	private String requestMethod;
    /**
     * 请求参数
     */
	@ApiModelProperty("请求参数")
	@TableField("request_params")
	private String requestParams;
    /**
     * 返回参数
     */
	@ApiModelProperty("返回参数")
	@TableField("response_result")
	private String responseResult;
    /**
     * 接口处理耗时单位(ms)
     */
	@ApiModelProperty("接口处理耗时单位(ms)")
	@TableField("done_time")
	private Long doneTime;
    /**
     * 创建时间
     */
	@ApiModelProperty("创建时间")
	@TableField("create_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
    /**
     * 备注
     */
	@ApiModelProperty("备注")
	private String remark;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getRequestUri() {
		return requestUri;
	}

	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}

	public String getRemoteAddr() {
		return remoteAddr;
	}

	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public String getRequestParams() {
		return requestParams;
	}

	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
	}

	public String getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(String responseResult) {
		this.responseResult = responseResult;
	}

	public Long getDoneTime() {
		return doneTime;
	}

	public void setDoneTime(Long doneTime) {
		this.doneTime = doneTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


	@Override
	public String toString() {
		return "InterLog{" +
			", id=" + id +
			", requestUrl=" + requestUrl +
			", requestUri=" + requestUri +
			", remoteAddr=" + remoteAddr +
			", requestMethod=" + requestMethod +
			", requestParams=" + requestParams +
			", responseResult=" + responseResult +
			", doneTime=" + doneTime +
			", createTime=" + createTime +
			", remark=" + remark +
			"}";
	}
}
