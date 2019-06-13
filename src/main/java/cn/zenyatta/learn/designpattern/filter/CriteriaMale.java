package cn.zenyatta.learn.designpattern.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mingming.song
 */
class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> malePersonList = new ArrayList<>();

        for (Person person : personList) {
            if ("MALE".equalsIgnoreCase(person.getGender())) {
                malePersonList.add(person);
            }
        }
        return malePersonList;
    }
}
