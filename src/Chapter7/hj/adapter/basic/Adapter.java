package Chapter7.hj.adapter.basic;

import Chapter4.hj.Factory.FactoryMethodPattern.Pizza;

public class Adapter implements Target {
    Service adaptee;

    Adapter(Service service) {
        adaptee = service;
    }

    @Override
    public void method(int data) {
        adaptee.specificMethod(data);
    }
}
