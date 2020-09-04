package com;

/**
 * throw是语句抛出一个异常，一般是在代码块的内部，当程序出现某种逻辑错误时由程序员主动抛出某种特定类型的异常
 * 当某个方法可能会抛出某种异常时用于throws 声明可能抛出的异常，然后交给上层调用它的方法程序处理
 */
public class TestThrows {
    public static void function() throws NumberFormatException {
        String s = "abc";
        System.out.println(Double.parseDouble(s));
    }

    public static void main(String[] args) {
        try {
            function();
        } catch (NumberFormatException e) {
            System.err.println("非数据类型不能强制类型转换。");
        }

    }
}
