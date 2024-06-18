package com.exercise.spring_design_pattern_creational.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeApplication {

    @Bean
    @Scope("prototype")
    public Employee employeeStaff() {
        Employee employee = new Employee();
        employee.setPosition(Position.STAFF);
        employee.setSalary(10_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager() {
        Employee employee = new Employee();
        employee.setPosition(Position.MANAGER);
        employee.setSalary(20_000_000L);
        return employee;
    }

}
