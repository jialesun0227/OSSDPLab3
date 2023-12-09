package org.example.test;

import org.example.Solution10;
import org.junit.Assert;
import org.junit.Test;

public class Solution10Test {

    @Test
    public void testFractionAddition() {
        // 测试用例1: 两个正分数相加
        String expression1 = "1/2+1/3";
        String expected1 = "5/6";
        String result1 = Solution10.fractionAddition(expression1);
        Assert.assertEquals(expected1, result1);

        // 测试用例2: 两个正分数相减
        String expression2 = "2/3-1/4";
        String expected2 = "7/12";
        String result2 = Solution10.fractionAddition(expression2);
        Assert.assertEquals(expected2, result2);


        // 测试用例3: 多个分数相加
        String expression5 = "1/2+1/3+1/4+1/5";
        String expected5 = "77/60";
        String result5 = Solution10.fractionAddition(expression5);
        Assert.assertEquals(expected5, result5);



        // 测试用例4: 分子为1的分数
        String expression9 = "1/1+1/1";
        String expected9 = "2/1";
        String result9 = Solution10.fractionAddition(expression9);
        Assert.assertEquals(expected9, result9);

        // 测试用例5: 多个分母相同的分数相加
        String expression10 = "1/2+1/2+1/2+1/2";
        String expected10 = "2/1";
        String result10 = Solution10.fractionAddition(expression10);
        Assert.assertEquals(expected10, result10);
    }
}
