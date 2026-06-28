package com.learn.m01_basics;

/*
 * ============================================================
 * 模块：m01 基础语法与基本类型
 * 关卡：Ex03 八种基本类型
 * ------------------------------------------------------------
 * 【知识点】
 *   Java 有 8 种“基本类型”，按用途分四类：
 *     整数：byte(1字节) short(2字节) int(4字节) long(8字节)
 *     小数：float(4字节) double(8字节)
 *     字符：char（一个字符，用单引号 ' ' 括起来，如 'A'）
 *     布尔：boolean（只有 true / false 两个值）
 *   注意：long 字面量结尾要加 L，float 字面量结尾要加 f。
 *
 * 【本关任务】
 *   按 TODO 提示，给 8 个变量分别赋上正确的值。
 *
 * 【如何闯关】
 *   把每个占位值改成提示要求的值，运行 main，对照“预期输出”。
 * ============================================================
 */
public class Ex03_PrimitiveTypes {

    public static void main(String[] args) {

        // TODO(关卡3-1)：把 0 改成 100
        byte b = 100;

        // TODO(关卡3-2)：把 0 改成 20000
        short s = 20000;

        // TODO(关卡3-3)：把 0 改成 100000
        int i = 100000;

        // TODO(关卡3-4)：把 0L 改成 10000000000L（注意结尾的 L）
        long l = 10000000000L;

        // TODO(关卡3-5)：把 0f 改成 3.14f（注意结尾的 f）
        float f = 3.14f;

        // TODO(关卡3-6)：把 0 改成 2.718
        double d = 2.718;

        // TODO(关卡3-7)：把空格字符改成大写字母 'A'
        char c = 'A';

        // TODO(关卡3-8)：把 false 改成 true
        boolean flag = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
    }
}

/*
 * ============================ 预期输出 ============================
 * byte: 100
 * short: 20000
 * int: 100000
 * long: 10000000000
 * float: 3.14
 * double: 2.718
 * char: A
 * boolean: true
 * ===============================================================
 *
 * 排查提示：
 *  - long 漏写 L、float 漏写 f 会编译报错。
 *  - char 用单引号 'A'，不是双引号 "A"。
 */
