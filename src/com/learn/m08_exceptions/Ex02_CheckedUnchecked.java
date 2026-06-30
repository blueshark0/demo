package com.learn.m08_exceptions;

/*
 * ============================================================
 * 模块：m08 异常处理
 * 关卡：Ex02 受检异常 与 非受检异常
 * ------------------------------------------------------------
 * 【知识点】
 *   非受检异常（运行时异常，是 RuntimeException 的子类，例如整数除零时的
 *   ArithmeticException）：编译器不强制你处理，但运行时仍可能爆出来。
 *   受检异常（如 Exception、IOException）：编译器“强制”你必须处理——要么用
 *   try-catch 捕获，要么在方法签名上用 throws 声明，把它继续往外抛。
 *
 * 【本关任务】
 *   1. 在第一个 try 块里制造一个整数除零的运行时异常并被捕获，使其打印
 *      「捕获运行时异常：/ by zero」（消息文本由除零异常自带，为 "/ by zero"）。
 *   2. 调用 readData 时让它真正抛出受检异常并被捕获，使其打印
 *      「捕获受检异常：读取数据失败」。
 * ============================================================
 */
public class Ex02_CheckedUnchecked {

    // 这个方法声明了 throws Exception（受检异常），调用处必须处理
    static void readData(boolean fail) throws Exception {
        if (fail) {
            throw new Exception("读取数据失败");
        }
        System.out.println("数据读取成功");
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            // TODO(关卡2-1)：用 a 和 b 做一次整数除法，制造除零的运行时异常
            int result = a / b;
            System.out.println("除法结果 = " + result);
        } catch (ArithmeticException e) {
            System.out.println("捕获运行时异常：" + e.getMessage());
        }

        try {
            // TODO(关卡2-2)：调用 readData，让它走到抛出受检异常的分支
            readData(true);
        } catch (Exception e) {
            System.out.println("捕获受检异常：" + e.getMessage());
        }
    }
}

/*
 * ============================ 预期输出 ============================
 * 捕获运行时异常：/ by zero
 * 捕获受检异常：读取数据失败
 * ===============================================================
 *
 * 排查提示：
 *  - 整数除以 0 会抛 ArithmeticException，消息是 "/ by zero"。
 *  - readData 上若去掉 throws Exception，编译器会立刻报错——这就是“受检”。
 */
