package com.learn.m14_commonapi;

/*
 * ============================================================
 * 模块：m14 常用 API
 * 关卡：Ex02 包装类与解析
 * ------------------------------------------------------------
 * 【知识点】
 *   每个基本类型都有对应的“包装类”：int→Integer，double→Double……
 *   常用功能：
 *       Integer.parseInt("100")     把字符串解析成 int
 *       Double.parseDouble("3.14")  把字符串解析成 double
 *       Integer.MAX_VALUE           int 能表示的最大值
 *   自动装箱/拆箱：int 和 Integer 之间会自动转换，写起来很自然。
 *
 * 【本关任务】
 *   把字符串 "100" 解析成 int，把 "3.14" 解析成 double。
 *
 * 【如何闯关】
 *   按 TODO 把占位 0 改成对应的解析调用，运行对照输出。
 * ============================================================
 */
public class Ex02_WrapperParse {

    public static void main(String[] args) {
        // TODO(关卡2-1)：把 0 改成 Integer.parseInt("100")
        int n = Integer.parseInt("100");
        // TODO(关卡2-2)：把 0 改成 Double.parseDouble("3.14")
        double d = Double.parseDouble("3.14");

        Integer boxed = 42;   // 自动装箱：int 42 变成 Integer 对象
        int unboxed = boxed;  // 自动拆箱：Integer 变回 int

        System.out.println("parseInt(\"100\") = " + n);
        System.out.println("parseDouble(\"3.14\") = " + d);
        System.out.println("装箱再拆箱 = " + unboxed);
        System.out.println("int 最大值 = " + Integer.MAX_VALUE);
    }
}

/*
 * ============================ 预期输出 ============================
 * parseInt("100") = 100
 * parseDouble("3.14") = 3.14
 * 装箱再拆箱 = 42
 * int 最大值 = 2147483647
 * ===============================================================
 *
 * 排查提示：
 *  - 如果把 "abc" 这种非数字字符串传给 parseInt，会抛 NumberFormatException。
 *  - Integer.MAX_VALUE 是 2147483647，再加 1 会“溢出”变成负数，可自行试试。
 */
