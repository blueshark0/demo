package com.learn.m06_strings;

/*
 * ============================================================
 * 模块：m06 String 字符串
 * 关卡：Ex03 不可变性 与 == / equals
 * ------------------------------------------------------------
 * 【知识点】
 *   String 是“不可变”的：像 toUpperCase() 这样的方法不会修改原字符串，
 *   而是返回一个“新字符串”，原来的 s 一点都不会变。
 *
 *   比较字符串要分清两种“相等”：
 *       ==     比较“是不是同一个对象”（同一块内存）
 *       equals 比较“内容是不是一样”
 *   判断文字内容是否相同，永远用 equals！
 *
 * 【本关任务】
 *   1. 用 toUpperCase 得到大写新串，观察原串不变。
 *   2. 分别用 == 和 equals 比较 a 与 c，体会区别。
 *
 * 【如何闯关】
 *   把占位值改成正确的表达式，运行对照输出。
 * ============================================================
 */
public class Ex03_Immutability {

    public static void main(String[] args) {
        String s = "hello";
        // TODO(关卡3-1)：把空串改成 s.toUpperCase()
        String upper = "";

        System.out.println("原串 s = " + s);       // s 自己不会变
        System.out.println("大写 upper = " + upper);

        String a = "java";
        String c = new String("java"); // 用 new 创建，是另一个对象

        // TODO(关卡3-2)：把 false 改成 (a == c)  —— 比较是不是同一个对象
        boolean sameRef = false;
        // TODO(关卡3-3)：把 false 改成 a.equals(c) —— 比较内容是否相同
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
 *  - a 和 c 内容都是 "java"，但 c 是 new 出来的新对象，
 *    所以 == 为 false（不同对象），equals 为 true（内容相同）。
 */
