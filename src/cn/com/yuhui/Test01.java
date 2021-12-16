package cn.com.yuhui;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test01 {
    @Test
    public void test01(){
        System.out.println("Hello world!");
    }
    @Test
    public void test02(){
        int i,sum=0;
        for(i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
    @Test
    public void test03(){
        int[] arr={12,58,52,452,125,365,58};
        for(int i=1;i<arr.length;i++){
            for(int j=0;j< arr.length-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
