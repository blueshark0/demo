package com.learn.m01_basics;

/*
 * ============================================================
 * 模块：m01 基础语法与基本类型
 * 关卡：Ex05 类型转换与精度丢失
 * ------------------------------------------------------------
 * 【知识点】
 *   不同类型之间可以转换：
 *     自动转换（小 → 大，安全）：int 可以直接赋给 double。
 *         double d = anInt;   // 不需要任何额外写法
 *     强制转换（大 → 小，可能丢失精度）：要用 (目标类型) 写在前面。
 *         int n = (int) aDouble;   // 小数部分被直接“砍掉”，不是四舍五入
 *
 * 【本关任务】
 *   1. 把 int 变量 i 自动转换为 double，赋给 d。
 *   2. 把 double 变量 pi 强制转换为 int，赋给 truncated。
 *
 * 【如何闯关】
 *   补全两处 TODO，运行 main，对照“预期输出”。
 * ============================================================
 */
public class Ex05_TypeCasting {

    public static void main(String[] args) {

        int i = 7;
        // TODO(关卡5-1)：把 i 自动转换为 double 赋给 d
        //   提示：double d = i;  （小转大，直接赋值即可）
        double d = 0;

        double pi = 3.99;
        // TODO(关卡5-2)：把 pi 强制转换为 int 赋给 truncated
        //   提示：int truncated = (int) pi;  （大转小，要加 (int)）
        int truncated = 0;

        System.out.println("int 7 转 double = " + d);
        System.out.println("double 3.99 强制转 int = " + truncated);
    }
}

/*
 * ============================ 预期输出 ============================
 * int 7 转 double = 7.0
 * double 3.99 强制转 int = 3
 * ===============================================================
 *
 * 排查提示：
 *  - 3.99 转成 int 得到 3，而不是 4：强制转换是“截断”，直接丢掉小数。
 *  - 如果忘了写 (int)，编译会报错：因为不允许把 double 偷偷塞进 int。
 */
