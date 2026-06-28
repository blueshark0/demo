package com.learn.m06_strings;

/*
 * ============================================================
 * 模块：m06 String 字符串
 * 关卡：Ex01 创建与拼接
 * ------------------------------------------------------------
 * 【知识点】
 *   字符串用双引号创建： String s = "你好";
 *   用 + 可以把多个字符串拼接起来；字符串和数字相加，数字会自动
 *   转成字符串再拼接：  "Java " + 2024  →  "Java 2024"
 *
 * 【本关任务】
 *   1. 把 first、一个空格、second 拼成 "Hello Java"。
 *   2. 把字符串 "Java " 和数字 year 拼接成 "Java 2024"。
 *
 * 【如何闯关】
 *   把占位空串改成正确的拼接表达式，运行对照输出。
 * ============================================================
 */
public class Ex01_CreateAndConcat {

    public static void main(String[] args) {
        String first = "Hello";
        String second = "Java";

        // TODO(关卡1-1)：把空串改成 first + " " + second
        String greeting = "";

        int year = 2024;
        // TODO(关卡1-2)：把空串改成 "Java " + year
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
 *  - 注意 Hello 和 Java 之间要有一个空格，靠 + " " + 加进去。
 *  - 数字和字符串用 + 连接时，数字会自动变成文字。
 */
