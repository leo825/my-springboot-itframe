package com.leo.myspringboot.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.leo.myspringboot.beans.Course;
import com.leo.myspringboot.dao.CourseMapper;
import com.leo.myspringboot.iservice.ICourseSV;

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
 *   @description : Course 服务实现类
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-16
 */
@Service(group = "myspringboot")
public class CourseServiceImpl extends BaseServiceImpl<CourseMapper, Course> implements ICourseSV {
	
}
