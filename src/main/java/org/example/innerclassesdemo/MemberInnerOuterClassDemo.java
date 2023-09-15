package org.example.innerclassesdemo;

class OuterClass{
    private int data=30;
    OuterClass(){
        System.out.println("Outer class");
    }
    class InnerClass{
        InnerClass(){
            System.out.println("inner class");
        }
        void msg(){System.out.println("data is "+data);}
    }
}
public class MemberInnerOuterClassDemo {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass oi = o.new InnerClass();
        oi.msg();
    }
}
