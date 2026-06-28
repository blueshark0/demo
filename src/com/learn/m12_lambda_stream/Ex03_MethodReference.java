package com.learn.m12_lambda_stream;

import java.util.function.Function;

/*
 * ============================================================
 * 模块：m12 Lambda 与 Stream
 * 关卡：Ex03 方法引用
 * ------------------------------------------------------------
 * 【知识点】
 *   当 Lambda 只是“调用一个已有的方法”时，可以用更短的“方法引用”写法：
 *       s -> s.toUpperCase()    可写成   String::toUpperCase
 *       s -> Integer.parseInt(s) 可写成   Integer::parseInt
 *   Function<入参类型, 返回类型> 是一个常用函数式接口，用 apply 调用。
 *
 * 【本关任务】
 *   用静态方法引用 Integer::parseInt，把字符串解析成整数。
 *
 * 【如何闯关】
 *   把 s -> 0 改成 Integer::parseInt，运行对照输出。
 * ============================================================
 */
public class Ex03_MethodReference {

    public static void main(String[] args) {
        // 实例方法引用（已写好做示范）：String::toUpperCase 等价于 s -> s.toUpperCase()
        Function<String, String> toUpper = String::toUpperCase;
        System.out.println("toUpper(\"hello\") = " + toUpper.apply("hello"));

        // TODO(关卡3-1)：把 s -> 0 改成 Integer::parseInt
        Function<String, Integer> parse = Integer::parseInt;

        int n = parse.apply("123");
        System.out.println("parse(\"123\") + 1 = " + (n + 1));
    }
}

/*
 * ============================ 预期输出 ============================
 * toUpper("hello") = HELLO
 * parse("123") + 1 = 124
 * ===============================================================
 *
 * 排查提示：
 *  - 如果第二行是 1，说明 parse 还返回着 0（123 没被真正解析）。
 *  - Integer::parseInt 就是 s -> Integer.parseInt(s) 的简写。
 */
