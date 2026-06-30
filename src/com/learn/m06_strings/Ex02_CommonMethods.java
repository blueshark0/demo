package com.learn.m06_strings;

import java.util.Arrays;

/*
 * ============================================================
 * 模块：m06 String 字符串
 * 关卡：Ex02 常用方法
 * ------------------------------------------------------------
 * 【知识点】
 *   字符串自带很多“方法”，用点号调用。常见的能力有：
 *     - 求字符串的长度（一共有多少个字符）；
 *     - 取出某个下标位置上的单个字符（下标从 0 开始数）；
 *     - 从某个下标开始一直截到末尾，得到一段子串；
 *     - 查某段文字第一次出现在哪个下标，找不到时返回 -1；
 *     - 把字符串整体转成大写；
 *     - 按某个分隔符把字符串切分成一个字符串数组。
 *
 * 【本关任务】
 *   下方已给定 s = "Hello, Java"、csv = "a,b,c"
 *   （必须用这两个固定值，输出才能对上）。请利用上面提到的能力，
 *   分别求出各结果并赋给已声明的变量，使程序打印：
 *       长度 = 11
 *       首字符 = H
 *       子串(从下标7起) = Java
 *       "Java" 的位置 = 7
 *       转大写 = HELLO, JAVA
 *       分割后第二个 = b
 *   提示：「子串(从下标7起)」要从下标 7 截到末尾；
 *         「分割后第二个」是 csv 按逗号切分后的第 2 段。
 * ============================================================
 */
public class Ex02_CommonMethods {

    public static void main(String[] args) {
        String s = "Hello, Java";

        // TODO(关卡2-1)：求 s 的长度，赋给 len
        int len = s.length();
        // TODO(关卡2-2)：取 s 的首字符（下标 0），赋给 first
        char first = s.charAt(0);
        // TODO(关卡2-3)：取 s 从下标 7 到末尾的子串，赋给 sub
        String sub = s.substring(7);
        // TODO(关卡2-4)：求 "Java" 在 s 中第一次出现的下标，赋给 idx
        int idx = s.indexOf("Java");
        // TODO(关卡2-5)：把 s 整体转成大写，赋给 upper
        String upper = s.toUpperCase();

        String csv = "a,b,c";
        // TODO(关卡2-6)：把 csv 按逗号切分成字符串数组，赋给 parts
        String[] parts = csv.split(",");


        System.out.println("长度 = " + len);
        System.out.println("首字符 = " + first);
        System.out.println("子串(从下标7起) = " + sub);
        System.out.println("\"Java\" 的位置 = " + idx);
        System.out.println("转大写 = " + upper);
        System.out.println("分割后第二个 = " + parts[1]);
    }
}

/*
 * ============================ 预期输出 ============================
 * 长度 = 11
 * 首字符 = H
 * 子串(从下标7起) = Java
 * "Java" 的位置 = 7
 * 转大写 = HELLO, JAVA
 * 分割后第二个 = b
 * ===============================================================
 *
 * 排查提示：
 *  - "Hello, Java" 一共 11 个字符（逗号和空格也算）。
 *  - 下标从 0 数：H(0) e(1) l(2) l(3) o(4) ,(5) 空格(6) J(7)，所以 Java 从 7 开始。
 */
