package com.exercise.spring_design_pattern_creational.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Employee {

    private String id;
    private String name;
    private Position position;
    private Long salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
