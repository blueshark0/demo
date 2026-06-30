package com.learn.m01_basics;

import java.net.SocketTimeoutException;

/*
 * ============================================================
 * 模块：m01 基础语法与基本类型
 * 关卡：Ex03 八种基本类型
 * ------------------------------------------------------------
 * 【知识点】
 *   Java 有 8 种“基本类型”，按用途分四类：
 *     整数：byte(1字节) short(2字节) int(4字节) long(8字节)
 *     小数：float(4字节) double(8字节)
 *     字符：char（一个字符，用单引号括起来）
 *     布尔：boolean（只有“真 / 假”两个值）
 *   注意：long 字面量结尾要加 L，float 字面量结尾要加 f，
 *   否则编译器会把它们当作 int 或 double 处理而报错。
 *
 * 【本关任务】
 *   声明下面 8 个变量并各自赋上指定的值，然后逐行打印它们：
 *     byte b      = 100
 *     short s     = 20000
 *     int i       = 100000
 *     long l      = 10000000000（必须使用 long 字面量写法）
 *     float f     = 3.14（必须使用 float 字面量写法）
 *     double d    = 2.718
 *     char c      = 大写字母 A（用单引号）
 *     boolean flag = true
 *   打印格式为「类型名: 值」，例如「byte: 100」「boolean: true」，
 *   各行的前缀分别是 "byte: " "short: " "int: " "long: "
 *   "float: " "double: " "char: " "boolean: "（冒号后有一个空格）。
 * ============================================================
 */
public class Ex03_PrimitiveTypes {

    public static void main(String[] args) {

        // TODO(关卡3-1)：声明 byte b 并赋值为 100，随后打印「byte: 100」
        byte b = 100;
        System.out.println("byte: " + b);
        // TODO(关卡3-2)：声明 short s 并赋值为 20000，随后打印「short: 20000」
        short s = 20000;
        System.out.println("short: " + s);
        // TODO(关卡3-3)：声明 int i 并赋值为 100000，随后打印「int: 100000」
        int i = 100000;
        System.out.println("int: " + i);
        // TODO(关卡3-4)：声明 long l 并赋值为 10000000000（用 long 字面量写法），随后打印「long: 10000000000」
        long l = 10_000_000_000l;
        System.out.println("long: " + l);
        // TODO(关卡3-5)：声明 float f 并赋值为 3.14（用 float 字面量写法），随后打印「float: 3.14」
        float f = 3.14f;
        System.out.println("float: " + f);
        // TODO(关卡3-6)：声明 double d 并赋值为 2.718，随后打印「double: 2.718」
        double d = 2.718;
        System.out.println("double: " + d);
        // TODO(关卡3-7)：声明 char c 并赋值为大写字母 A（用单引号），随后打印「char: A」
        char c = 'A';
        System.out.println("char: " + c);
        // TODO(关卡3-8)：声明 boolean flag 并赋值为 true，随后打印「boolean: true」
        boolean flag = true;
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
 *  - long、float 的字面量若漏写各自的后缀，会编译报错。
 *  - char 要用单引号，不是双引号。
 */
