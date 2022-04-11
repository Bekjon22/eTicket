package ai.ecma.appeticketserver;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());

        test(56);
    }

    public static void test(int... ints){
        System.out.println("varargs -> "+ Arrays.toString(ints));
    }
}
