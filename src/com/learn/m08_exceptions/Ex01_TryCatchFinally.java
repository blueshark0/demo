package com.learn.m08_exceptions;

/*
 * ============================================================
 * 模块：m08 异常处理
 * 关卡：Ex01 try / catch / finally
 * ------------------------------------------------------------
 * 【知识点】
 *   try 把“可能出错的代码”包起来；一旦出错，立刻跳到匹配的 catch 处理；
 *   finally 里的代码无论是否出错都一定会执行（常用来做收尾清理）：
 *       try { 可能出错的代码 }
 *       catch (异常类型 e) { 出错时的处理 }
 *       finally { 一定执行的收尾 }
 *
 * 【本关任务】
 *   故意访问数组越界的下标，触发并捕获 ArrayIndexOutOfBoundsException。
 *
 * 【如何闯关】
 *   把 arr[0] 改成 arr[5]（数组只有 3 个元素，下标 5 越界），运行对照输出。
 * ============================================================
 */
public class Ex01_TryCatchFinally {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            // TODO(关卡1-1)：把 arr[0] 改成 arr[5]，制造下标越界
            int x = arr[0];
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
 *  - 如果看到“访问成功”，说明下标还没改成越界的 5。
 *  - 注意：异常被 catch 住后，程序不会崩溃，会继续往下执行。
 */
