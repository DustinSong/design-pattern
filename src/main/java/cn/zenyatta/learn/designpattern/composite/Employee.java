package cn.zenyatta.learn.designpattern.composite;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingming.song
 */
@Getter
@Setter
@ToString
class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subOrdinateList;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subOrdinateList = new ArrayList<>();
    }

    public void add(Employee e) {
        this.subOrdinateList.add(e);
    }

    public void remove(Employee e) {
        this.subOrdinateList.remove(e);
    }
}
