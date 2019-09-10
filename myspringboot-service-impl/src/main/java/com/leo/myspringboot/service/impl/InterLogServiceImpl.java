package com.leo.myspringboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.leo.myspringboot.beans.InterLog;
import com.leo.myspringboot.dao.InterLogMapper;

import com.leo.myspringboot.iservice.IInterLogSV;

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
 *   @description : InterLog 服务实现类
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-17
 */
@Service(group = "myspringboot")
public class InterLogServiceImpl extends BaseServiceImpl<InterLogMapper, InterLog> implements IInterLogSV {
	
}
