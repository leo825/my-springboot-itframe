//package com.leo.myspringboot.web.util.cache;
//
//import com.light.springboot.entity.Switch;
//import com.light.springboot.service.SwitchService;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
///**
//* 缓存初始化
//* 向初始化的方法里面提供数据
//*
//* @author renld
//*/
//@Component
//public class CacheInit implements ICacheInit,CommandLineRunner {
//    private static final Log logger = LogFactory.getLog(CacheInit.class);
//
//    @Autowired
//    private CacheFatctoryUtil cacheFatctoryUtil;
//
//    @Autowired
//    private SwitchService switchService;
//
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        logger.info("缓存数据初始化start。。。");
//        Map<String, String> jvmStringData = new HashMap<String, String>();
//        Map<String, Map<String, String>> jvmMapData = new HashMap<String, Map<String, String>>();
//        Map<String, List> jvmListData = new HashMap<String, List>();
//
//        try {
//            //获取需要在JVM中初始化的String类型数据
//            jvmStringData = getJvmStringCacheData();
//            cacheFatctoryUtil.putJVMStringData(jvmStringData);
//            logger.info("String类型缓存:" + jvmStringData.toString() + "Map类型缓存:" + jvmMapData.toString() + "List类型缓存" + jvmListData.toString());
//        } catch (Exception e) {
//            logger.error("initJvmCacheDataFailed缓存初始化失败", e);
//        }
//        logger.info("缓存数据初始化over");
//    }
//
//    @Override
//    public Map<String, String> getJvmStringCacheData() {
//        Map all = new HashMap();
//        all.put("cache_type_cd", "1");
//        Map<String, String> StringData = new HashMap<String, String>();
//
//        //获取t_switch表的初始化数据
//        List<Switch> switchList = switchService.selectByMap(all);
//        for (int i = 0; i < switchList.size(); i++) {
//            if (switchList.get(i).getCacheTypeCd() != null) {
//                String value = switchList.get(i).getSwtchVal();
//                String key = switchList.get(i).getSwtchKey();
//                StringData.put(key, value);
//            }
//        }
//        return StringData;
//    }
//
//    @Override
//    public Map<String, String> getRedisStringCacheData() {
//        return null;
//    }
//
//    @Override
//    public Map<String, Map<String, String>> getJvmMapCacheData() {
//        return null;
//    }
//
//    @Override
//    public Map<String, Map<String, String>> getRedisMapCacheData() {
//        return null;
//    }
//
//    @Override
//    public Map<String, List> getJvmListCacheData() {
//        return null;
//    }
//
//    @Override
//    public Map<String, List> getRedisListCacheData() {
//        return null;
//    }
//
//
//}