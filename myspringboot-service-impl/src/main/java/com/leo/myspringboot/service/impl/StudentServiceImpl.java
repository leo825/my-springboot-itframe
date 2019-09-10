package com.leo.myspringboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.leo.myspringboot.beans.Student;
import com.leo.myspringboot.dao.StudentMapper;
import com.leo.myspringboot.iservice.IStudentSV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
 *   @description : Student 服务实现类
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-16
 */
@Service(group = "myspringboot")
@CacheConfig(cacheNames = "defaultConfig")
public class StudentServiceImpl extends BaseServiceImpl<StudentMapper, Student> implements IStudentSV {

    private final Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
    @Cacheable
    @Override
    public boolean insert(Student student) {
        logger.info("save()执行了=============");
        return super.insert(student);
    }

    @CacheEvict
    @Override
    public boolean deleteById(Serializable serializable) {
        return super.deleteById(serializable);
    }

    @CachePut
    @Override
    public boolean update(Student student, Wrapper<Student> wrapper) {
        return super.update(student, wrapper);
    }

    @Cacheable
    @Override
    public List<Student> selectByMap(Map<String, Object> map) {
        logger.info("selectByMap()执行了=============");
        return super.selectByMap(map);
    }
}
