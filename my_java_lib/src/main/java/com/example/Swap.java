package com.example;

/**
 * Created by yxc on 2017/7/5.
 */
public class Swap{
    int count;
    public static void main(String args[]){
        char[] cs = {'a','b','c'};
        int length = cs.length;
        Swap CS=new Swap();
        CS.recursionSwap(cs,0,length);
        CS.Size();
    }
    public void Size(){
        System.out.println("可组合字符串数为："+count);
    }

    public static void swap(char[] cs,int index1,int index2){
        char temp = cs[index1];
        cs[index1]=cs[index2];
        cs[index2]=temp;
    }

    public  void recursionSwap(char[] cs,int start,int length){
        if (length<=1){
            return;
        }
        if(start>=length){
            print(cs);
            count++;
            return;
        }
        for(int i=start;i<length;i++){
            swap(cs,start,i);
            recursionSwap(cs,start+1,length);
            swap(cs,start,i);
        }
    }

    public static void print(char[] cs){

        for(int i=0;i<cs.length;i++){
            System.out.print(cs[i]);
        }
        System.out.println();
    }

}
