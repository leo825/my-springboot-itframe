package com.leo.myspringboot.beans;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;
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
 *   @description : Teacher 实体类
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-16
 */
@TableName("t_teacher")
public class Teacher extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	@TableField("tea_number")
	private String teaNumber;
	private String name;
	private Integer sex;
	private String depe;
	private String professional;
	@TableField("tea_mobile")
	private String teaMobile;
	@TableField("tea_Email")
	private String teaEmail;
	@TableField("tea_address")
	private String teaAddress;
	@TableField("tea_profile")
	private String teaProfile;
	@TableField("role_id")
	private Integer roleId;
	@TableField("create_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;
	@TableField("create_user_id")
	private String createUserId;
	@TableField("update_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;
	@TableField("update_user_id")
	private String updateUserId;
	private Integer state;
	private String remark;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeaNumber() {
		return teaNumber;
	}

	public void setTeaNumber(String teaNumber) {
		this.teaNumber = teaNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getDepe() {
		return depe;
	}

	public void setDepe(String depe) {
		this.depe = depe;
	}

	public String getProfessional() {
		return professional;
	}

	public void setProfessional(String professional) {
		this.professional = professional;
	}

	public String getTeaMobile() {
		return teaMobile;
	}

	public void setTeaMobile(String teaMobile) {
		this.teaMobile = teaMobile;
	}

	public String getTeaEmail() {
		return teaEmail;
	}

	public void setTeaEmail(String teaEmail) {
		this.teaEmail = teaEmail;
	}

	public String getTeaAddress() {
		return teaAddress;
	}

	public void setTeaAddress(String teaAddress) {
		this.teaAddress = teaAddress;
	}

	public String getTeaProfile() {
		return teaProfile;
	}

	public void setTeaProfile(String teaProfile) {
		this.teaProfile = teaProfile;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}


	@Override
	public String toString() {
		return "Teacher{" +
			", id=" + id +
			", teaNumber=" + teaNumber +
			", name=" + name +
			", sex=" + sex +
			", depe=" + depe +
			", professional=" + professional +
			", teaMobile=" + teaMobile +
			", teaEmail=" + teaEmail +
			", teaAddress=" + teaAddress +
			", teaProfile=" + teaProfile +
			", roleId=" + roleId +
			", createTime=" + createTime +
			", createUserId=" + createUserId +
			", updateTime=" + updateTime +
			", updateUserId=" + updateUserId +
			", state=" + state +
			", remark=" + remark +
			"}";
	}
}
