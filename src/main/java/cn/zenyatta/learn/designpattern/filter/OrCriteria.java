package cn.zenyatta.learn.designpattern.filter;

import java.util.List;

/**
 * @author mingming.song
 */
class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersonList = criteria.meetCriteria(personList);
        List<Person> otherCriteriaPersonList = otherCriteria.meetCriteria(personList);

        for (Person person : otherCriteriaPersonList) {
            if (!firstCriteriaPersonList.contains(person)) {
                firstCriteriaPersonList.add(person);
            }
        }

        return firstCriteriaPersonList;
    }
}
