package com.exercise.spring_design_pattern_creational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = PrototypeApplication.class)
public class PrototypeApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype() {
        Employee budi = applicationContext.getBean("employeeStaff", Employee.class);
        budi.setName("Budi");
        budi.setId("12345678");
        System.out.println(budi);
    }

}
