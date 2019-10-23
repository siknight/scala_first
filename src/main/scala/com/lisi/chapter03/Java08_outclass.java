package com.lisi.chapter03;

public class Java08_outclass {
    class  InnerClass{}
    static class  InnerClass2{}

    public static void main(String[] args) {
        InnerClass innerClass = new Java08_outclass().new InnerClass();
        InnerClass2 innerClass2 = new InnerClass2();
    }
}
