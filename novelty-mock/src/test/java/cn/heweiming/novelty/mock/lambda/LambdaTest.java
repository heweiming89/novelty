package cn.heweiming.novelty.mock.lambda;

import java.util.Comparator;

import org.junit.Test;

public class LambdaTest {

    @Test
    public void test() {
        Comparator<Integer> c = (x, y) -> Integer.compare(x, y);
    }

}
