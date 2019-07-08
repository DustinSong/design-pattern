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
class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Null Customer";
    }
}
