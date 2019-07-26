package com.hand.exam1.test;

import com.hand.exam1.Exam1Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Exam1Application.class)
public class MyTest {
    @Test
    public void test(){
        System.out.println("test");
    }
}
