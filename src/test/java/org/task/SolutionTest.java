package org.task;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.Assert.*;

public class SolutionTest {
    Solution sol;
    private Stream<Integer> generateStream(int n){
        return Stream.iterate(0, value -> value + 1).limit(n);
    }

    private List<Integer> generateAnswer(int n){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < 10 && i < n; i++){
            result.add(n-i-1);
        }
        return result;
    }

    @Before
    public void init(){
        sol = new Solution();
    }

    @Test
    public void testLess10Count(){
        assertEquals(sol.topN(generateStream(4)), generateAnswer(4));
    }

    @Test
    public void test10Count(){
        assertEquals(sol.topN(generateStream(10)), generateAnswer(10));
    }

    @Test
    public void test20Count(){
        assertEquals(sol.topN(generateStream(20)), generateAnswer(20));
    }

    @Test
    public void testMillionCount(){
        assertEquals(sol.topN(generateStream(1000000)), generateAnswer(1000000));
    }

    @Test
    public void test100MillionCount(){
        assertEquals(sol.topN(generateStream(100000000)), generateAnswer(100000000));
    }

    @Test
    public void testBillionCount(){
        assertEquals(sol.topN(generateStream(1000000000)), generateAnswer(1000000000));
    }
}
