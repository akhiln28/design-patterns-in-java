package com.designpatterns.singleton;

class SingletonStaticField {
    private SingletonStaticField() {}

    public static final SingletonStaticField INSTANCE = new SingletonStaticField();
    public static Integer f1;
}

/**
 * InnerSingletonStaticField
 */
class MainMethod {
    public static void main(String[] args) {
        SingletonStaticField s1 = SingletonStaticField.INSTANCE;
        SingletonStaticField s2 = SingletonStaticField.INSTANCE;
        System.out.println(s1);
        s1.f1 = 10;
        System.out.println(s2);
        System.out.println(s2.f1);
    }
}

