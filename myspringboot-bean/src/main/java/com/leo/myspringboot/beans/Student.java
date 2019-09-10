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
 *   @description : Student 实体类
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-16
 */
@TableName("t_student")
public class Student extends BaseEntity {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
	private String name;
	@TableField("stu_number")
	private String stuNumber;
	private Integer gender;
	private Integer age;
	private String password;
	@TableField("stu_mobile")
	private String stuMobile;
	@TableField("stu_email")
	private String stuEmail;
	@TableField("role_id")
	private Integer roleId;
	@TableField("stu_profile")
	private String stuProfile;
	@TableField("par_name")
	private String parName;
	@TableField("par_mobile")
	private String parMobile;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuNumber() {
		return stuNumber;
	}

	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStuMobile() {
		return stuMobile;
	}

	public void setStuMobile(String stuMobile) {
		this.stuMobile = stuMobile;
	}

	public String getStuEmail() {
		return stuEmail;
	}

	public void setStuEmail(String stuEmail) {
		this.stuEmail = stuEmail;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getStuProfile() {
		return stuProfile;
	}

	public void setStuProfile(String stuProfile) {
		this.stuProfile = stuProfile;
	}

	public String getParName() {
		return parName;
	}

	public void setParName(String parName) {
		this.parName = parName;
	}

	public String getParMobile() {
		return parMobile;
	}

	public void setParMobile(String parMobile) {
		this.parMobile = parMobile;
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
		return "Student{" +
			", id=" + id +
			", name=" + name +
			", stuNumber=" + stuNumber +
			", gender=" + gender +
			", age=" + age +
			", password=" + password +
			", stuMobile=" + stuMobile +
			", stuEmail=" + stuEmail +
			", roleId=" + roleId +
			", stuProfile=" + stuProfile +
			", parName=" + parName +
			", parMobile=" + parMobile +
			", createTime=" + createTime +
			", createUserId=" + createUserId +
			", updateTime=" + updateTime +
			", updateUserId=" + updateUserId +
			", state=" + state +
			", remark=" + remark +
			"}";
	}
}
