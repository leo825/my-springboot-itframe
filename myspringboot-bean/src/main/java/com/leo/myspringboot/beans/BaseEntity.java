package com.leo.myspringboot.beans;

import com.baomidou.mybatisplus.annotations.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * code is far away from bug with the animal protecting
 * ┏┓　　　┏┓
 * ┏┛┻━━━┛┻┓
 * ┃　　　　　　　┃
 * ┃　　　━　　　┃
 * ┃　┳┛　┗┳　┃
 * ┃　　　　　　　┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　　┃
 * ┗━┓　　　┏━┛
 * 　　┃　　　┃神兽保佑
 * 　　┃　　　┃代码无BUG！
 * 　　┃　　　┗━━━┓
 * 　　┃　　　　　　　┣┓
 * 　　┃　　　　　　　┏┛
 * 　　┗┓┓┏━┳┓┏┛
 * 　　　┃┫┫　┃┫┫
 * 　　　┗┻┛　┗┻┛
 *
 * @Description : 实体类 基类
 *
 * ---------------------------------
 * @Author : Liang.Guangqing
 * @Date : Create in 2017/11/12 15:09
 */
public abstract class BaseEntity implements Serializable  {

    /** id */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @TableField(exist = false)
    protected Long id;

    /** 开始日期 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @ApiModelProperty("开始时间")
    @TableField(exist = false)//代表不是数据库字段，但是必须使用
    protected Date beginDate;

    /** 结束日期 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @ApiModelProperty("结束时间")
    @TableField(exist = false)
    protected Date endDate;

    /** 收费任务状态 */
    @ApiModelProperty("收费任务状态")
    @TableField(exist = false)
    protected Integer taskStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public String toString() {
        return "Base{" +
                ", id=" + id +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", taskStatus=" + taskStatus +
                "}";
    }

}
