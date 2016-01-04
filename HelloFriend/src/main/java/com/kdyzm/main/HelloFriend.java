package com.kdyzm.main;
import com.kdyzm.main.Hello;
public class HelloFriend{
    public String sayHello(int input){
        System.out.println("HelloFriend类sayHello方法接收到的参数是："+input);
        Hello hello = new Hello();
        int result=hello.calculate(input);
        return result+"";
    }
}
