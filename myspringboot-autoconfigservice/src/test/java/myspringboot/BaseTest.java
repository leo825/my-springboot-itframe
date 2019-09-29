package myspringboot;

import com.leo.myspirngboot.autoconfigservice.AutoConfigServiceApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AutoConfigServiceApplication.class)
public class BaseTest {
}
