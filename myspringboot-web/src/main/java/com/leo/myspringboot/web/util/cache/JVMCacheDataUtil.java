package com.leo.myspringboot.web.util.cache;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存工具类
 *
 * @author renld
 */
@Component
public class JVMCacheDataUtil {
    private static final Log logger = LogFactory.getLog(JVMCacheDataUtil.class);

    public static final Map map = new ConcurrentHashMap();

    /**
     * @param key
     * @return
     */
    public static String getStringCache(String key) {
        String value = (String) map.get(key);
        return value;
    }

    /**
     * @param key
     * @return
     */
    public static Map getMapCache(String key) {
        Map value = (Map) map.get(key);
        return value;
    }

    /**
     * @param key
     * @return
     */
    public static List getListCache(String key) {
        List value = (List) map.get(key);
        return value;
    }

    /**
     * @param key
     * @return
     */
    public static Object getObjectCache(String key) {
        return map.get(key);
    }

    /**
     * @param key
     * @return
     */
    public static boolean delCache(String key) {
        boolean result = false;
        try {
            map.remove(key);
            result = true;
        } catch (Exception e) {
            logger.error("删除缓存异常", e);
            result = false;
        }
        return result;
    }

    /**
     * @param dataMap
     * @return
     */
    @SuppressWarnings("unchecked")
    public static boolean putStringCache(Map<String, String> dataMap) {
        boolean result = false;
        for (Iterator iterator = dataMap.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry entry = (Map.Entry) iterator.next();
            try {
                map.put(entry.getKey(), entry.getValue());
                result = true;
            } catch (Exception e) {
                logger.error("加载缓存异常", e);
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * @param dataMap
     * @return
     */
    @SuppressWarnings("unchecked")
    public static boolean putMapCache(Map<String, Map<String, String>> dataMap) {
        boolean result = false;
        for (Iterator iterator = dataMap.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry entry = (Map.Entry) iterator.next();
            try {
                map.put(entry.getKey(), entry.getValue());
                result = true;
            } catch (Exception e) {
                logger.error("加载缓存异常", e);
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * @param dataMap
     * @return
     */
    @SuppressWarnings("unchecked")
    public static boolean putListCache(Map<String, List> dataMap) {
        boolean result = false;
        for (Iterator iterator = dataMap.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry entry = (Map.Entry) iterator.next();
            try {
                map.put(entry.getKey(), entry.getValue());
                result = true;
            } catch (Exception e) {
                logger.error("加载缓存异常", e);
                result = false;
                break;
            }
        }
        return result;
    }
}
