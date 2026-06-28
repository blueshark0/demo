package com.learn.m05_methods;

/*
 * ============================================================
 * 模块：m05 方法
 * 关卡：Ex03 方法重载
 * ------------------------------------------------------------
 * 【知识点】
 *   “重载”指：多个方法名字相同，但参数不同（个数或类型不同），可以并存。
 *   编译器会根据你传入的实参类型，自动选择匹配的那个方法：
 *       add(2, 3)     → 调用 int  版，得到 5
 *       add(2.5, 3.5) → 调用 double 版，得到 6.0
 *
 * 【本关任务】
 *   实现两个 add：一个接收两个 int，一个接收两个 double，各自返回它们的和。
 *
 * 【如何闯关】
 *   分别补全两个 add 的方法体，运行对照输出。
 * ============================================================
 */
public class Ex03_Overload {

    static int add(int a, int b) {
        // TODO(关卡3-1)：返回两个 int 的和
        throw new UnsupportedOperationException("请补全 int 版 add()");
    }

    static double add(double a, double b) {
        // TODO(关卡3-2)：返回两个 double 的和
        throw new UnsupportedOperationException("请补全 double 版 add()");
    }

    public static void main(String[] args) {
        System.out.println("int  版：" + add(2, 3));
        System.out.println("double 版：" + add(2.5, 3.5));
    }
}

/*
 * ============================ 预期输出 ============================
 * int  版：5
 * double 版：6.0
 * ===============================================================
 *
 * 排查提示：
 *  - 两个方法名都叫 add，靠参数类型（int 还是 double）来区分。
 *  - double 版结果是 6.0（带小数点），int 版是 5。
 */
