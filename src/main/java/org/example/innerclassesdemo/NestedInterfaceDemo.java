package org.example.innerclassesdemo;

interface OuterInterface{
    public void outerMethod();
    interface InnerInterface{
        public void innerMethod();
    }
}

public class NestedInterfaceDemo implements OuterInterface, OuterInterface.InnerInterface{
    @Override
    public void innerMethod() {
        System.out.println("InnerInterface method called..!");
    }

    public static void main(String[] args) {
        OuterInterface.InnerInterface innerInterface = new NestedInterfaceDemo() { };
        innerInterface.innerMethod();

        OuterInterface outerInterface = new NestedInterfaceDemo(){};
        outerInterface.outerMethod();
    }

    @Override
    public void outerMethod() {
        System.out.println("OuterInterface method called..!");
    }
}