package com.leo.myspringboot.iservice;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.leo.myspringboot.beans.Student;

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
 *   @description : Student 服务接口
 *   ---------------------------------
 * 	 @author leo825
 *   @since 2019-02-16
 */
public interface IStudentSV extends IBaseSV<Student> {
    boolean insert(Student student);

    boolean deleteById(Serializable serializable);

    boolean update(Student student, Wrapper<Student> wrapper);

    List<Student> selectByMap(Map<String, Object> map);
}
