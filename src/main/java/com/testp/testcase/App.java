package com.testp.testcase;

import java.util.ArrayList;
import com.google.gson.Gson;

/**
 * Hello world!
 * 新建maven项目的例子，后续包括git上传等等
 */
public class App 
{
    public static void main( String[] args )
    {	
        System.out.println( "Hello World!" );
        TestMod tm1=new TestMod();
        tm1.setAge(20);
        tm1.setName("张三");
        TestMod tm2=new TestMod();
        tm2.setAge(30);
        tm2.setName("李四");
        ArrayList<TestMod> tms=new ArrayList<TestMod>();
        tms.add(tm1);
        tms.add(tm2);
        Gson gs=new Gson();
        String result=gs.toJson(tms);
        System.out.println(result);
    }
}
