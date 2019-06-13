package cn.zenyatta.learn.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingming.song
 */
class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersonList = new ArrayList<>();

        for (Person person : personList) {
            if ("SINGLE".equalsIgnoreCase(person.getMaritalStatus())) {
                singlePersonList.add(person);
            }
        }
        return singlePersonList;
    }
}
