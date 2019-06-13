package cn.zenyatta.learn.designpattern.filter;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingming.song
 */
public class CriteriaTest {

    @Test
    public void testCriteria() {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Robert", "Male", "Single"));
        personList.add(new Person("John", "Male", "Married"));
        personList.add(new Person("Laura", "Female", "Married"));
        personList.add(new Person("Diana", "Female", "Single"));
        personList.add(new Person("Mike", "Male", "Single"));
        personList.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Male:" + JSON.toJSONString(male.meetCriteria(personList)));
        System.out.println("Female:" + JSON.toJSONString(female.meetCriteria(personList)));
        System.out.println("Single:" + JSON.toJSONString(single.meetCriteria(personList)));
        System.out.println("Single Male:" + JSON.toJSONString(singleMale.meetCriteria(personList)));
        System.out.println("Single or Female:" + JSON.toJSONString(male.meetCriteria(personList)));
    }

}