package com.janwarlen.modular.common;

public interface PrivateFunc {

    void func1();

    default void func2() {
        func3();
        // JDK8+
        System.out.println("默认实现");
    }

    private void func3() {
        func4();
        System.out.println("私有默认实现");
    }

    private static void func4() {
        System.out.println("静态私有实现");
    }
}
