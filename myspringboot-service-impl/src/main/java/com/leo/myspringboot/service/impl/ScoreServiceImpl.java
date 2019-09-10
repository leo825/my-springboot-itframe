package com.leo.myspringboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.leo.myspringboot.beans.Score;
import com.leo.myspringboot.dao.ScoreMapper;
import com.leo.myspringboot.iservice.IScoreSV;


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
 *   @description : Score 服务实现类
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-16
 */
@Service(group = "myspringboot")
public class ScoreServiceImpl extends BaseServiceImpl<ScoreMapper, Score> implements IScoreSV {
	
}
