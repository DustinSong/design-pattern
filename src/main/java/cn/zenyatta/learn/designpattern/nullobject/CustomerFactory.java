package cn.zenyatta.learn.designpattern.nullobject;

/**
 * @author mingming.song
 */
class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : names) {
            if (s.equals(name)){
                return new RealCustomer(name);
            }
        }

        return new NullCustomer();
    }
}
