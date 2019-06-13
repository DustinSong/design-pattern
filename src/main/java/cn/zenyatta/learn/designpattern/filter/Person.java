package cn.zenyatta.learn.designpattern.filter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mingming.song
 */
@Getter
@Setter
@ToString
class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }
}
