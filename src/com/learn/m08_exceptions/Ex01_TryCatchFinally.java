package com.learn.m08_exceptions;

/*
 * ============================================================
 * 模块：m08 异常处理
 * 关卡：Ex01 try / catch / finally
 * ------------------------------------------------------------
 * 【知识点】
 *   try 把“可能出错的代码”包起来；一旦出错，立刻跳到匹配类型的 catch 去处理，
 *   try 块里出错点之后的代码不再执行；finally 里的代码无论是否出错都一定会
 *   执行，常用来做收尾清理。异常被 catch 住后，程序不会崩溃，会继续往下走。
 *
 * 【本关任务】
 *   数组 arr 只有 3 个元素。请在 try 块里故意访问一个越界的下标，触发
 *   ArrayIndexOutOfBoundsException 并被下方的 catch 捕获，使程序依次打印：
 *       捕获到异常：下标越界
 *       finally 总会执行
 *       程序继续运行
 * ============================================================
 */
public class Ex01_TryCatchFinally {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            // TODO(关卡1-1)：访问 arr 的一个越界下标（数组只有 3 个元素），制造下标越界
            int x = arr[3];
            System.out.println("访问成功，x = " + x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到异常：下标越界");
        } finally {
            System.out.println("finally 总会执行");
        }

        System.out.println("程序继续运行");
    }
}

/*
 * ============================ 预期输出 ============================
 * 捕获到异常：下标越界
 * finally 总会执行
 * 程序继续运行
 * ===============================================================
 *
 * 排查提示：
 *  - 如果看到“访问成功”，说明访问的下标还没越界。
 *  - 注意：异常被 catch 住后，程序不会崩溃，会继续往下执行。
 */
