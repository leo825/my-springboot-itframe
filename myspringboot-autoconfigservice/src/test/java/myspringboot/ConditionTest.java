package myspringboot;


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
public class ConditionTest extends BaseTest implements ApplicationContextAware {

    @Test
    public void test1() {
        Map<String, Person> beansOfType = ApplicationContext.getBeansOfType(Person.class);

        String property = ApplicationContext.getEnvironment().getProperty("os.name");
        System.out.println("当前系统为:" + property);

    }

    public org.springframework.context.ApplicationContext ApplicationContext;

    @Override
    public void setApplicationContext(org.springframework.context.ApplicationContext applicationContext) {
        this.ApplicationContext = applicationContext;
    }
}
