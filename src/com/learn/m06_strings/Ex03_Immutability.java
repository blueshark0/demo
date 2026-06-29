package com.learn.m06_strings;

/*
 * ============================================================
 * 模块：m06 String 字符串
 * 关卡：Ex03 不可变性 与 == / equals
 * ------------------------------------------------------------
 * 【知识点】
 *   String 是“不可变”的：像转大写这类方法不会改动原来的字符串，而是
 *   返回一个全新的字符串，原来的变量一点都不会变。
 *
 *   比较字符串要分清两种“相等”：
 *     - 一种比较“是不是同一个对象”（指向同一块内存）；
 *     - 另一种比较“内容是不是一样”。
 *   判断文字内容是否相同时，要用比较“内容”的那种方式。
 *
 * 【本关任务】
 *   下方已给定 s = "hello"、a = "java"、c = new String("java")
 *   （c 用 new 创建，是另一个对象）。请：
 *   1. 把 s 转成大写得到新串，赋给 upper；并观察原串 s 不变。
 *      目标：「原串 s = hello」「大写 upper = HELLO」。
 *   2. 用比较“是否同一个对象”的方式比较 a 与 c，结果赋给 sameRef；
 *      用比较“内容是否相同”的方式比较 a 与 c，结果赋给 sameContent。
 *      目标：「a == c ? false」「a.equals(c) ? true」。
 * ============================================================
 */
public class Ex03_Immutability {

    public static void main(String[] args) {
        String s = "hello";
        // TODO(关卡3-1)：把 s 转成大写得到新串，赋给 upper
        String upper = "";

        System.out.println("原串 s = " + s);       // s 自己不会变
        System.out.println("大写 upper = " + upper);

        String a = "java";
        String c = new String("java"); // 用 new 创建，是另一个对象

        // TODO(关卡3-2)：比较 a 与 c 是不是同一个对象，结果赋给 sameRef
        boolean sameRef = false;
        // TODO(关卡3-3)：比较 a 与 c 的内容是否相同，结果赋给 sameContent
        boolean sameContent = false;

        System.out.println("a == c ? " + sameRef);
        System.out.println("a.equals(c) ? " + sameContent);
    }
}

/*
 * ============================ 预期输出 ============================
 * 原串 s = hello
 * 大写 upper = HELLO
 * a == c ? false
 * a.equals(c) ? true
 * ===============================================================
 *
 * 排查提示：
 *  - upper 变成大写，但 s 仍然是小写 hello —— 这就是“不可变”。
 *  - a 和 c 内容都是 "java"，但 c 是 new 出来的新对象：
 *    因此“是否同一个对象”为 false，“内容是否相同”为 true。
 */
