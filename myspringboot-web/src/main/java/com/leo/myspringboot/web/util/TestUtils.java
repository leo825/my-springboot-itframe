package com.leo.myspringboot.web.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Random;

/**
 * Created by A
 * dministrator on 2019/1/30.
 */
public class TestUtils {

    private static final Log logger = LogFactory.getLog(TestUtils.class);

    /**
     * 姓氏数组
     */
    private static String surnames[] = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王", "刘", "孟"};

    /**
     * 名字1数组
     */
    private static String names1[] = {"源", "前", "车", "实", "", "师", "", "蒙", "萌", "梦"};

    /**
     * 名字2数组
     */
    private static String names2[] = {"丽", "辉", "源", "彤", "舟", "军", "亮", "灿", "羽", "博"};

    /**
     * 创建人id
     */
    private static String createUserIds[] = {"OP001", "OP002", "OP003"};

    /**
     * 获取[min,max]的随机数  (1,2)
     *
     * @return
     */
    public static Integer getRandomNum(int min, int max) {
        Random random = new Random();
        Integer result;
        if (min == 0) {
            result = random.nextInt(max + 1);
        } else {
            result = random.nextInt(max) % (max - min + 1) + min;//通过取余达到区间值
        }
        return result;
    }

    /**
     * 获取随机姓名
     *
     * @return
     */
    public static String getName() {
        String surname = surnames[getRandomNum(0, 9)];
        String name1 = names1[getRandomNum(0, 9)];
        String name2 = names2[getRandomNum(0, 9)];
        StringBuilder sb = new StringBuilder();
        sb.append(surname).append(name1).append(name2);
        String name = sb.toString();
        logger.info("获取的姓名为：" + name);
        return name;
    }

    /**
     * 获取随机的年龄
     *
     * @return
     */
    public static Integer getAge() {
        return getRandomNum(16, 24);
    }

    /**
     * 获取随机性别
     *
     * @return
     */
    public static Integer getGender() {
        Random random = new Random();
        return getRandomNum(0, 1);
    }

    /**
     * 获取创建人id
     *
     * @return
     */
    public static String getCreateUserId() {
        return createUserIds[getRandomNum(0, 2)];
    }

}
