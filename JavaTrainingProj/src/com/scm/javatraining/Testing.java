package com.scm.javatraining;

public class Testing {
    static int i = 10;
    int j = 10;
    public static void main(String[] args) {
        String s1 = "Hello";
        Testing tst = new Testing();
        tst.display(s1);
    }
    public void display(String str) {
        System.out.println("String is " + str);
        System.out.println(i);
        System.out.println(j);
    }
}
