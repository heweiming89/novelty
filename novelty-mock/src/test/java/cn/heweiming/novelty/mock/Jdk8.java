package cn.heweiming.novelty.mock;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.Test;

public class Jdk8 {

    @Test
    public void test() {
        ArrayList<Integer> list = new ArrayList<>();
        Predicate<? super Integer> filter;
        Function keyExtractor;
        
    }
    
    @Test
    public void testStr(){
        String s1 = "1234";
        String s2 = "1234";
        String s3 = new String("1234");
        String s4 = "12" + "34";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == "1234");
    }

}
