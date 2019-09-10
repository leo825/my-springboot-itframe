package com.leo.myspringboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.leo.myspringboot.beans.Teacher;
import com.leo.myspringboot.dao.TeacherMapper;

import com.leo.myspringboot.iservice.ITeacherSV;

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
 *   @description : Teacher 服务实现类
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-16
 */
@Service(group = "myspringboot")
public class TeacherServiceImpl extends BaseServiceImpl<TeacherMapper, Teacher> implements ITeacherSV {

}
