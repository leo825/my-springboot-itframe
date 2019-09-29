package myspringboot;

import com.alibaba.fastjson.JSON;
import com.leo.myspirngboot.autoconfigservice.beans.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContextAware;

import java.util.Map;

/**
 * @ClassName ConditionTest
 * @Description ConditionTest
 * @Author stack
 * @Version 1.0
 * @since 2019/6/27 17:35
 */
public class ConditionOnBeanTest extends BaseTest implements ApplicationContextAware {

    @Test
    public void test1() {
        Map<String, Person> beansOfType = ApplicationContext.getBeansOfType(Person.class);
        System.out.println(JSON.toJSONString(beansOfType));
    }

    public org.springframework.context.ApplicationContext ApplicationContext;

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) {
        this.ApplicationContext = applicationContext;
    }
}
