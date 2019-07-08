package cn.zenyatta.learn.designpattern.nullobject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mingming.song
 */
@Getter
@Setter
@ToString
class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
