package cn.zenyatta.learn.designpattern.filter;

import java.util.List;

/**
 * @author mingming.song
 */
interface Criteria {
    List<Person> meetCriteria(List<Person> personList);
}
