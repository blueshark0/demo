package com.learn.m14_commonapi;

/*
 * ============================================================
 * 模块：m14 常用 API
 * 关卡：Ex01 Math 数学工具
 * ------------------------------------------------------------
 * 【知识点】
 *   Math 提供常用数学方法（都是静态方法，直接 Math.xxx 调用）：
 *       Math.abs(-5)     绝对值          → 5
 *       Math.max(3, 8)   较大值          → 8
 *       Math.pow(2, 10)  幂（2 的 10 次方）→ 1024.0（注意返回 double）
 *       Math.sqrt(144)   平方根          → 12.0
 *
 * 【本关任务】
 *   用 Math 的方法填出四个结果。
 *
 * 【如何闯关】
 *   把每个占位 0 改成对应的 Math 调用，运行对照输出。
 * ============================================================
 */
public class Ex01_Math {

    public static void main(String[] args) {
        // TODO(关卡1-1)：把 0 改成 Math.abs(-5)
        int abs = Math.abs(-5);
        // TODO(关卡1-2)：把 0 改成 Math.max(3, 8)
        int max = Math.max(3,8);
        // TODO(关卡1-3)：把 0 改成 Math.pow(2, 10)
        double pow = Math.pow(2,10);
        // TODO(关卡1-4)：把 0 改成 Math.sqrt(144)
        double sqrt = Math.sqrt(144);

        System.out.println("abs(-5) = " + abs);
        System.out.println("max(3, 8) = " + max);
        System.out.println("pow(2, 10) = " + pow);
        System.out.println("sqrt(144) = " + sqrt);
    }
}

/*
 * ============================ 预期输出 ============================
 * abs(-5) = 5
 * max(3, 8) = 8
 * pow(2, 10) = 1024.0
 * sqrt(144) = 12.0
 * ===============================================================
 *
 * 排查提示：
 *  - pow 和 sqrt 返回的是 double，所以打印出来带小数点（1024.0、12.0）。
 */
