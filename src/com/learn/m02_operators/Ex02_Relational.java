package com.learn.m02_operators;

/*
 * ============================================================
 * 模块：m02 运算符
 * 关卡：Ex02 关系运算符
 * ------------------------------------------------------------
 * 【知识点】
 *   关系运算符用来比较两个值，结果一定是布尔值 true 或 false：
 *       >  大于    <  小于    >= 大于等于   <= 小于等于
 *       == 等于    != 不等于
 *   注意：判断“相等”是两个等号 ==，一个等号 = 是“赋值”。
 *
 * 【本关任务】
 *   用 x、y 写出 5 个比较表达式。
 *
 * 【如何闯关】
 *   把每个占位 false 改成 TODO 要求的比较表达式，运行对照输出。
 * ============================================================
 */
public class Ex02_Relational {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // TODO(关卡2-1)：把 false 改成 x > y
        boolean gt = x > y;
        // TODO(关卡2-2)：把 false 改成 x < y
        boolean lt = x < y;
        // TODO(关卡2-3)：把 false 改成 x == y
        boolean eq = x == y;
        // TODO(关卡2-4)：把 false 改成 x != y
        boolean ne = x != y;
        // TODO(关卡2-5)：把 false 改成 x >= 10
        boolean ge = x >= 10;

        System.out.println("10 > 20 ? " + gt);
        System.out.println("10 < 20 ? " + lt);
        System.out.println("10 == 20 ? " + eq);
        System.out.println("10 != 20 ? " + ne);
        System.out.println("10 >= 10 ? " + ge);
    }
}

/*
 * ============================ 预期输出 ============================
 * 10 > 20 ? false
 * 10 < 20 ? true
 * 10 == 20 ? false
 * 10 != 20 ? true
 * 10 >= 10 ? true
 * ===============================================================
 *
 * 排查提示：
 *  - 判断相等用 ==（两个等号），千万别写成 =（那是赋值）。
 */
