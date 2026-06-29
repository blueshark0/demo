package com.learn.m12_lambda_stream;

import java.util.function.Function;

/*
 * ============================================================
 * 模块：m12 Lambda 与 Stream
 * 关卡：Ex03 方法引用
 * ------------------------------------------------------------
 * 【知识点】
 *   当一个 Lambda 做的事只是“调用某个已经存在的方法”时，可以改用更短的
 *   “方法引用”写法，省掉参数和括号，直接指向那个方法。方法引用既可以指向
 *   某个类的实例方法，也可以指向静态方法。
 *   Function<入参类型, 返回类型> 是一个常用函数式接口，用 apply 调用。
 *
 * 【本关任务】
 *   下方 toUpper 已用方法引用写好做示范。请用“静态方法引用”给 parse 赋值，
 *   让它能把字符串解析成对应的整数（即把字符串 "123" 解析成整数 123），
 *   使程序打印：
 *       toUpper("hello") = HELLO
 *       parse("123") + 1 = 124
 * ============================================================
 */
public class Ex03_MethodReference {

    public static void main(String[] args) {
        // 实例方法引用（已写好做示范）：String::toUpperCase 等价于 s -> s.toUpperCase()
        Function<String, String> toUpper = String::toUpperCase;
        System.out.println("toUpper(\"hello\") = " + toUpper.apply("hello"));

        // TODO(关卡3-1)：用静态方法引用给 parse 赋值，使其能把字符串解析成对应的整数
        Function<String, Integer> parse = s -> 0;

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
 *  - 如果第二行是 1，说明 parse 还返回着 0（"123" 没被真正解析成整数）。
 *  - 方法引用其实就是“调用某个已有方法”的 Lambda 的简写形式。
 */
