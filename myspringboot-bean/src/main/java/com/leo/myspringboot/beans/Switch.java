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
 *   @description : Switch 实体类
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-16
 */
@TableName("t_switch")
public class Switch extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 开关ID
     */
	@ApiModelProperty("开关ID")
	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 业务系统编码
     */
	@ApiModelProperty("业务系统编码")
	@TableField("biz_sys_code")
	private String bizSysCode;
    /**
     * 开关描述
     */
	@ApiModelProperty("开关描述")
	@TableField("swtch_desc")
	private String swtchDesc;
    /**
     * 开关键
     */
	@ApiModelProperty("开关键")
	@TableField("swtch_key")
	private String swtchKey;
    /**
     * 开关值
     */
	@ApiModelProperty("开关值")
	@TableField("swtch_val")
	private String swtchVal;
    /**
     * 创建用户ID
     */
	@ApiModelProperty("创建用户ID")
	@TableField("crt_user_id")
	private String crtUserId;
    /**
     * 创建时间
     */
	@ApiModelProperty("创建时间")
	@TableField("crt_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date crtTime;
    /**
     * 创建应用系统ID
     */
	@ApiModelProperty("创建应用系统ID")
	@TableField("crt_app_sys_id")
	private String crtAppSysId;
    /**
     * 修改用户ID
     */
	@ApiModelProperty("修改用户ID")
	@TableField("modf_user_id")
	private String modfUserId;
    /**
     * 修改时间
     */
	@ApiModelProperty("修改时间")
	@TableField("modf_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date modfTime;
    /**
     * 修改应用系统ID
     */
	@ApiModelProperty("修改应用系统ID")
	@TableField("modf_app_sys_id")
	private String modfAppSysId;
    /**
     * 缓存类型代码
     */
	@ApiModelProperty("缓存类型代码")
	@TableField("cache_type_cd")
	private String cacheTypeCd;
    /**
     * 有效标志
     */
	@ApiModelProperty("有效标志")
	@TableField("valid_flag")
	private String validFlag;
    /**
     * 缓存数据类型代码
     */
	@ApiModelProperty("缓存数据类型代码")
	@TableField("cache_data_type_cd")
	private String cacheDataTypeCd;
    /**
     * 推送提醒标志
     */
	@ApiModelProperty("推送提醒标志")
	@TableField("push_alert_flag")
	private String pushAlertFlag;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBizSysCode() {
		return bizSysCode;
	}

	public void setBizSysCode(String bizSysCode) {
		this.bizSysCode = bizSysCode;
	}

	public String getSwtchDesc() {
		return swtchDesc;
	}

	public void setSwtchDesc(String swtchDesc) {
		this.swtchDesc = swtchDesc;
	}

	public String getSwtchKey() {
		return swtchKey;
	}

	public void setSwtchKey(String swtchKey) {
		this.swtchKey = swtchKey;
	}

	public String getSwtchVal() {
		return swtchVal;
	}

	public void setSwtchVal(String swtchVal) {
		this.swtchVal = swtchVal;
	}

	public String getCrtUserId() {
		return crtUserId;
	}

	public void setCrtUserId(String crtUserId) {
		this.crtUserId = crtUserId;
	}

	public Date getCrtTime() {
		return crtTime;
	}

	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}

	public String getCrtAppSysId() {
		return crtAppSysId;
	}

	public void setCrtAppSysId(String crtAppSysId) {
		this.crtAppSysId = crtAppSysId;
	}

	public String getModfUserId() {
		return modfUserId;
	}

	public void setModfUserId(String modfUserId) {
		this.modfUserId = modfUserId;
	}

	public Date getModfTime() {
		return modfTime;
	}

	public void setModfTime(Date modfTime) {
		this.modfTime = modfTime;
	}

	public String getModfAppSysId() {
		return modfAppSysId;
	}

	public void setModfAppSysId(String modfAppSysId) {
		this.modfAppSysId = modfAppSysId;
	}

	public String getCacheTypeCd() {
		return cacheTypeCd;
	}

	public void setCacheTypeCd(String cacheTypeCd) {
		this.cacheTypeCd = cacheTypeCd;
	}

	public String getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}

	public String getCacheDataTypeCd() {
		return cacheDataTypeCd;
	}

	public void setCacheDataTypeCd(String cacheDataTypeCd) {
		this.cacheDataTypeCd = cacheDataTypeCd;
	}

	public String getPushAlertFlag() {
		return pushAlertFlag;
	}

	public void setPushAlertFlag(String pushAlertFlag) {
		this.pushAlertFlag = pushAlertFlag;
	}


	@Override
	public String toString() {
		return "Switch{" +
			", id=" + id +
			", bizSysCode=" + bizSysCode +
			", swtchDesc=" + swtchDesc +
			", swtchKey=" + swtchKey +
			", swtchVal=" + swtchVal +
			", crtUserId=" + crtUserId +
			", crtTime=" + crtTime +
			", crtAppSysId=" + crtAppSysId +
			", modfUserId=" + modfUserId +
			", modfTime=" + modfTime +
			", modfAppSysId=" + modfAppSysId +
			", cacheTypeCd=" + cacheTypeCd +
			", validFlag=" + validFlag +
			", cacheDataTypeCd=" + cacheDataTypeCd +
			", pushAlertFlag=" + pushAlertFlag +
			"}";
	}
}
