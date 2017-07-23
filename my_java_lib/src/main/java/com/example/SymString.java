package com.example;
import java.util.Scanner;

/**
 * Created by yxc on 2017/6/29.
 */

public class SymString {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String str = input.next();
        huiwen(str);
        Max(str);


    }


    public static void Max(String str3){
        int max=0;
        String temp = "";
        //遍历字符串中的每个字母
        for (int i = 0; i < str3.length(); i++) {
            //数组下标j从字符串最后往前遍历
            for (int j = str3.length() - 1; j >= i; j--) {
                temp = str3.substring(i, j + 1);
                if (ishuiwen(temp)&&(j-i+1)>max) {
                    max=j-i+1;
                }
            }

        }
        System.out.println("最大回文字符串长度为： "+max);


    }
    public static void huiwen(String str3) {
        String huiwenStr = null;  //返回字符串中的回文字符串
        String temp = "";
        //遍历字符串中的每个字母
        for (int i = 0; i < str3.length(); i++) {
            //数组下标j从字符串最后往前遍历
            for (int j = str3.length(); j > i; j--) {
                temp = str3.substring(i, j);
                if (ishuiwen(temp)) {
                    //max=j-i+1;
                    huiwenStr = str3.substring(i, j);
                    if (huiwenStr.length() > 1) {
                        System.out.println("该字符串中回文字符有： " + huiwenStr);
                    }
                }

            }


        }
    }
    public static boolean ishuiwen(String str){


        String str2 = reverse(str);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str2.charAt(i)) {
                count++;
            }
        }
        if (count == str.length()) {
            return true;
        } else {
            return false;
        }
    }


    public static String reverse(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String left = s.substring(0, s.length() / 2);
        String right = s.substring(s.length() / 2, s.length());
        return reverse(right) + reverse(left);//递归
    }

    public static String reverse2(String s1) {
        char[] array = s1.toCharArray();
        String reverse = "";
        for (int i = array.length - 1; i >= 0; i--)
            reverse += array[i];

        return reverse;
    }
}
