package cn.zenyatta.learn.designpattern.filter;

import java.util.List;

/**
 * @author mingming.song
 */
class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPersonList = criteria.meetCriteria(personList);
        return otherCriteria.meetCriteria(firstCriteriaPersonList);
    }
}
