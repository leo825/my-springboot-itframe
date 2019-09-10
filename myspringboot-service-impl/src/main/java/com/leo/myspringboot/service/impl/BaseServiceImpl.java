package com.leo.myspringboot.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.leo.myspringboot.dao.MyBaseMapper;
import com.leo.myspringboot.iservice.IBaseSV;
import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

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
 * @Description :
 * ---------------------------------
 * @Author : Liang.Guangqing
 * @Date : Create in 2017/11/2 22:23
 */
public class BaseServiceImpl<M extends MyBaseMapper<T>, T> extends ServiceImpl<M, T> implements IBaseSV<T> {

    private static final Log logger = LogFactory.getLog(BaseServiceImpl.class);

    @Autowired
    private M baseDao;

    public Page<T> selectPageWithParam (Page<T> page, T param) {
        page.setRecords(this.baseDao.selectPageWithParam(page,param));
        return page;
    }

    public Page<T> selectPageWithMap (Page<T> page, Map<String,Object> map) {
        page.setRecords(this.baseDao.selectPageWithMap(page,map));
        return page;
    }

    public List<T> selectListWithParam (T param) {
        return this.baseDao.selectListWithParam(param);
    }

    public List<T> selectListWithMap (Map<String,Object> map) {
        return this.baseDao.selectListWithMap(map);
    }

    public List<Map<String,Object>> selectListMapWithParam(T param) {
        return this.baseDao.selectListMapWithParam(param);
    }

    public List<Map<String,Object>> selectListMapWithMap(Map<String,Object> map) {
        return this.baseDao.selectListMapWithMap(map);
    }

    public List<Object> selectListObjWithParam(T param) {
        return this.baseDao.selectListObjWithParam(param);
    }

    public List<Object> selectListObjWithMap(Map<String,Object> map) {
        return this.baseDao.selectListObjWithMap(map);
    }

    public Map<String, Object> selectMapWithParam(T param) {
        return this.baseDao.selectMapWithParam(param);
    }

    public Map<String, Object> selectMapWithMap(Map<String,Object> map) {
        return this.baseDao.selectMapWithMap(map);
    }

    public Object selectObjWithParam(T param) {
        return this.baseDao.selectObjWithParam(param);
    }

    public Object selectObjWithMap(Map<String,Object> map) {
        return this.baseDao.selectObjWithMap(map);
    }

    public T selectOneWithParam (T param) {
        return this.baseDao.selectOneWithParam(param);
    }

    public T selectOneWithMap(Map<String,Object> map) {
        return this.baseDao.selectOneWithMap(map);
    }

    public T selectOneByObj(Serializable var1){
        return this.baseDao.selectOneByObj(var1);
    }

}
