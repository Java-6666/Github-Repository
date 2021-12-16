package cn.com.yuhui;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Test01 {
    @Test
    public void test01(){
        System.out.println("Hello world!");
        Collection arr=new ArrayList();
        //List
    }
    @Test
    public void test02(){
        int i,sum=0;
        for(i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
