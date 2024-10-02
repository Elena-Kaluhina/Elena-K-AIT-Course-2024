package method;

public class Method_1_2_3 {

    public static void main(String[] args) {
        System.out.println("Main method started");
        method1();
        System.out.println("Main method finished");

    }

    public static void method1(){

        System.out.println("Method1 started");
        method2();
        System.out.println("Method1 finished");

    }

    public static void method2(){

        System.out.println("Method2 started");
        method3();
        System.out.println("Method2 finished");

    }

    public static void method3(){

        System.out.println("Method3 started");
        System.out.println("Method3 finished");

    }

}

