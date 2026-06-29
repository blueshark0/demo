package com.learn.m06_strings;

/*
 * ============================================================
 * 模块：m06 String 字符串
 * 关卡：Ex01 创建与拼接
 * ------------------------------------------------------------
 * 【知识点】
 *   字符串是用双引号括起来的一段文字。用加号可以把多段字符串“拼”到
 *   一起，组成更长的字符串。字符串和数字相加时，数字会自动被当成文字
 *   再拼上去，所以最终结果还是一个字符串。
 *
 * 【本关任务】
 *   下方已给定 first = "Hello"、second = "Java"、year = 2024
 *   （必须用这三个固定值，输出才能对上）。请：
 *   1. 把 first、一个空格、second 拼成一段文字，赋给 greeting，
 *      使其打印「Hello Java」（注意 Hello 和 Java 之间有一个空格）。
 *   2. 把文字「Java 」和数字 year 拼成一段文字，赋给 withYear，
 *      使其打印「Java 2024」。
 * ============================================================
 */
public class Ex01_CreateAndConcat {

    public static void main(String[] args) {
        String first = "Hello";
        String second = "Java";

        // TODO(关卡1-1)：把 first、一个空格、second 拼成 "Hello Java"，赋给 greeting
        String greeting = "";

        int year = 2024;
        // TODO(关卡1-2)：把文字「Java 」和数字 year 拼成 "Java 2024"，赋给 withYear
        String withYear = "";

        System.out.println(greeting);
        System.out.println(withYear);
    }
}

/*
 * ============================ 预期输出 ============================
 * Hello Java
 * Java 2024
 * ===============================================================
 *
 * 排查提示：
 *  - 注意 Hello 和 Java 之间要有一个空格。
 *  - 数字和字符串用加号连接时，数字会自动变成文字。
 */
