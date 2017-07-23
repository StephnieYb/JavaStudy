package com.example;

import java.util.BitSet;

/**
 * Created by yxc on 2017/7/21.
 */

public class Random99 {
    public static void main(String args[]) {
        BitSet num = new BitSet(100);
//        for (int count = 0; count <=99; ) {
//            int random = (int) (Math.random() * 100);
//            num.set(random);
//            count++;
//        }
        while (num.length()<=99){
            int count=0;
            int random = (int) (Math.random() * 100);
            num.set(random);
            count++;
        }
        //返回第一个设置为 true 的位的索引，这发生在指定的起始索引或之后的索引上
        for (int i = num.nextSetBit(0); i >= 0; i = num.nextSetBit(i + 1)) {
            System.out.println(i + " ");
        }
//        System.out.println("产生了"+num.length()+"个随机数");


    }


}
