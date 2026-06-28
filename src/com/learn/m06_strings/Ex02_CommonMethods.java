package com.learn.m06_strings;

/*
 * ============================================================
 * 模块：m06 String 字符串
 * 关卡：Ex02 常用方法
 * ------------------------------------------------------------
 * 【知识点】
 *   字符串自带很多方法（用 . 调用）：
 *       s.length()        长度
 *       s.charAt(i)       第 i 个字符（下标从 0 开始）
 *       s.substring(i)    从第 i 个字符开始到末尾的子串
 *       s.indexOf("x")    子串第一次出现的下标，找不到返回 -1
 *       s.toUpperCase()   转大写
 *       s.split(",")      按逗号切分成字符串数组
 *
 * 【本关任务】
 *   对字符串 "Hello, Java" 调用上述方法，填出各结果。
 *
 * 【如何闯关】
 *   把每个占位值改成正确的方法调用，运行对照输出。
 * ============================================================
 */
public class Ex02_CommonMethods {

    public static void main(String[] args) {
        String s = "Hello, Java";

        // TODO(关卡2-1)：把 0 改成 s.length()
        int len = 0;
        // TODO(关卡2-2)：把空格改成 s.charAt(0)
        char first = ' ';
        // TODO(关卡2-3)：把空串改成 s.substring(7)
        String sub = "";
        // TODO(关卡2-4)：把 0 改成 s.indexOf("Java")
        int idx = 0;
        // TODO(关卡2-5)：把空串改成 s.toUpperCase()
        String upper = "";

        String csv = "a,b,c";
        // TODO(关卡2-6)：把右边改成 csv.split(",")
        String[] parts = new String[]{"", "", ""};

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
