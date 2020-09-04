package com;

import com.login.Login;

import java.util.ConcurrentModificationException;

/**
 * 1 请写一段示例代码，演示如何在一个方法中捕获多个异常类型。
 * 2 捕获异常代码块中，只有try/finally语句而没有catch语句是否可以，请编写一段函数加以验证。
 * 3 对于finally语句段中的代码一定会执行吗？请编写一段程序进行验证。
 * 4 throw和throws的区别是什么？请写一段程序加以说明。
 * 5 请定义一个登录接口的业务处理类，并编写一个login方法，来模拟处理如下登录异常情况：
 * 	    1001-用户名或密码为空
 * 	    1002-用户名不存在
 * 	    1003-密码错误
 * 	    1004-此帐号已锁定
 */
public class Main {

    public static void main(String[] args) {
        //moreThrow();

        // noCache();

        // isExecFinally();

        boolean isLogin = (new Login("admin", "123456")).login();
        System.out.println(isLogin);
    }


    /**
     * 捕获多个异常
     */
    public static void moreThrow()
    {
        try {
            // Object a = null;
            // a.getClass();

            // int a = 5 / 0;

             int a;
             a = Integer.parseInt("aaa");

            System.out.println(a);

        }catch (NullPointerException e) {
            System.err.println("空指针异常:" + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("数字类型转换异常:" + e.getMessage());
        } catch (ClassCastException e) {
            System.err.println("类型类型转换异常:" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("数组下标越界异常:" + e.getMessage());
        } catch (ConcurrentModificationException e) {
            System.err.println("并发修改异常:" + e.getMessage());
        } catch (Exception e) {
            System.err.println("其他异常:" + e.getMessage());
        }
    }


    /**
     * 只有try/finally语句而没有catch语句 可以执行
     */
    public static void noCache()
    {
        try{
            int a = 5 / 0;
        } finally {
            System.out.println("最终捕获");
        }
    }


    /**
     * finally语句段中的代码一定会执行
     */
    public static void isExecFinally()
    {
        try{
            int a = 5 / 0;
            int b = 5;
        } catch (Exception e) {
            System.out.println("异常捕获");
        } finally {
            System.out.println("最终捕获");
        }
    }

}
