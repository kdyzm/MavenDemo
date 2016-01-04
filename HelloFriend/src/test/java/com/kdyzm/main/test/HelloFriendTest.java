package com.kdyzm.main.test;
import com.kdyzm.main.HelloFriend;
import org.junit.Test;
public class HelloFriendTest
{
    @Test
    public void testSayHello(){
        HelloFriend helloFriend=new HelloFriend();
        String result=helloFriend.sayHello(2);
        System.out.println("testSayHello的执行结果是："+result);
    }
}
