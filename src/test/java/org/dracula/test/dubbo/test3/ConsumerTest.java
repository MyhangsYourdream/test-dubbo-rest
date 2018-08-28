package org.dracula.test.dubbo.test3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/META-INF/spring/consumer.xml")
public class ConsumerTest {

    @Autowired
    TestInterface testInterface;

    @Test
    public void test(){
        SomeParam someParam = testInterface.sayHello3();
        System.out.println(someParam.getId());
    }

}