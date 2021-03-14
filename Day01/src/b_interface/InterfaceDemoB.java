package b_interface;
/*
     JDK1.8版本 -> 静态方法 和 默认方法
    JDK1.9版本 -> 私有方法
 */
public interface InterfaceDemoB {
    //接口中的成员变量 - 是final修饰
    int num1 = 10;
    //public final -> 常量
    // public final static -> 静态常量 -> 全部大写
    public final static int NUM = 20;

    // JDK1.7 - 公开的抽象方法
    void method01();

    //JDK1.8 - 默认方法 (default)
    default void method02(){
        System.out.println("JDK1.8 才支持的默认方法");
        //num1 = 20;
    }
    //JDK1.8 - 静态方法 (static)
    static void method03(){
        System.out.println("JDK1.8 才支持的静态方法");
    }

    //JDK1.9 - 私有方法 (private)
    private void method04(){
        System.out.println("JDK1.9 才支持的私有方法");
    }

}
