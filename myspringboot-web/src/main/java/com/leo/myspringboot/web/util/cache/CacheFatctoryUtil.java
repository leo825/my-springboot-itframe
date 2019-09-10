//package com.leo.myspringboot.web.util.cache;
//
//import com.leo.springboot.entity.Switch;
//import com.light.springboot.service.SwitchService;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
///**
//* 缓存工具类
//*
//* @author renld
//*/
//@Component
//@SuppressWarnings("rawtypes")
//public class CacheFatctoryUtil {
//    private static final Log logger = LogFactory.getLog(CacheFatctoryUtil.class);
//
//    @Autowired
//    private SwitchService switchService;
//
//    /**
//     * @param key ，type 解析key值，并根据key值从数据库中捞取数据（type是数据类型，acms，开关表是String类型的，rnsf表有Map，和List类型）
//     * @return String 表名字
//     */
//    @SuppressWarnings("unchecked")
//    public String getStringFromDB(String key) {
//        String result = "";
//        if (StringUtils.isEmpty(key)) {
//            logger.error("传入key值不能为空");
//            return result;
//        }
//        int start = key.indexOf("_") + 1;//取出首个下划线位置
//        int end = key.indexOf(":");//取出首个冒号为止
//        String table = key.substring(start, end);//取出表的名字
//        try {
//            switch (table) {
//                case "SWITCH":
//                    Switch swtichDo = switchService.getServiceSwitchByKey(key);
//                    if (null != swtichDo) {
//                        Map dataMap = new HashMap();
//                        result = swtichDo.getSwtchVal();
//                        dataMap.put(key, result);
//                        JVMCacheDataUtil.putStringCache(dataMap);//将从DB中查询出的值加载到缓存中
//                    }
//                    return result;
//                default:
//                    logger.error("传入key不符合规范");
//                    return result;
//            }
//        } catch (Exception e) {
//            logger.error("从DB中取值异常", e);
//            return result;
//        }
//    }
//
//    /**
//     * @param cacheKey 从JVM缓存中获取数据
//     * @return String 缓存数据
//     * @throws
//     */
//    public String getJVMString(String cacheKey) {
//        String resultString = "";
//        if (StringUtils.isEmpty(cacheKey)) {
//            logger.error("传入key不符合规范");
//            return resultString;
//        }
//
//        try {
//            resultString = JVMCacheDataUtil.getStringCache(cacheKey);
//        } catch (Exception e) {
//            logger.error("获取缓存异常", e);
//        }
//
//        if (StringUtils.isEmpty(resultString)) {//取值为空的时候从DB中获取数据
//            resultString = getStringFromDB(cacheKey);
//        }
//        return resultString;
//    }
//
//    /**
//     * @param inMap 将string对象存入JVM缓存,数据格式为{key ,value}
//     * @return boolean  缓存数据
//     * @throws
//     */
//    public boolean putJVMStringData(Map<String, String> inMap) {
//        try {
//            return JVMCacheDataUtil.putStringCache(inMap);
//        } catch (Exception e) {
//            logger.error("initJvmCacheDataFailed存入缓存异常", e);
//            return false;
//        }
//    }
//
//
//    /**
//     * @param inMap 将map 存入JVM缓存 数据格式为{key ,value}
//     * @return boolean
//     * @throws
//     */
//    public boolean putJVMMapData(Map<String, Map<String, String>> inMap) {
//        try {
//            return JVMCacheDataUtil.putMapCache(inMap);
//        } catch (Exception e) {
//            logger.error("initJvmCacheDataFailed存入缓存异常", e);
//            return false;
//        }
//    }
//
//
//    /**
//     * @param inMap 将List存入JVM缓存 数据格式为{key ,value}
//     * @return boolean
//     * @throws
//     */
//    public boolean putJVMListData(Map<String, List> inMap) {
//        try {
//            return JVMCacheDataUtil.putListCache(inMap);
//        } catch (Exception e) {
//            logger.error("initJvmCacheDataFailed存入缓存异常", e);
//            return false;
//        }
//    }
//}
