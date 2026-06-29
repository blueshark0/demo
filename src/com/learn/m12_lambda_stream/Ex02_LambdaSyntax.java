package com.learn.m12_lambda_stream;

import java.util.Arrays;

/*
 * ============================================================
 * 模块：m12 Lambda 与 Stream
 * 关卡：Ex02 Lambda 语法
 * ------------------------------------------------------------
 * 【知识点】
 *   很多 Java 内置接口都能用 Lambda 实现，例如 Runnable（无参、无返回，
 *   描述“要做的一件事”）和 Comparator（比较两个值，返回负数表示前者排在
 *   前面、正数表示排在后面、0 表示视为相等）。把一个 Comparator 传给
 *   Arrays.sort，就能用自己定义的规则给数组排序。
 *
 * 【本关任务】
 *   下方已给定数组 words = {"banana", "fig", "apple"}（保持不变）。
 *   请用 Lambda 写一个比较器传给 Arrays.sort，让数组“按字符串长度从短到长”
 *   排序，使程序打印：
 *       Runnable 跑起来了
 *       [fig, apple, banana]
 * ============================================================
 */
public class Ex02_LambdaSyntax {

    public static void main(String[] args) {
        // Runnable：用 Lambda 描述“要做的事”
        Runnable r = () -> System.out.println("Runnable 跑起来了");
        r.run();

        String[] words = {"banana", "fig", "apple"};

        // TODO(关卡2-1)：用 Lambda 写一个比较器，让 words 按字符串长度从短到长排序
        Arrays.sort(words, (a, b) -> 0);

        System.out.println(Arrays.toString(words));
    }
}

/*
 * ============================ 预期输出 ============================
 * Runnable 跑起来了
 * [fig, apple, banana]
 * ===============================================================
 *
 * 排查提示：
 *  - fig(3) < apple(5) < banana(6)，所以按长度排序后是这个顺序。
 *  - 如果顺序没变（还是 banana, fig, apple），说明比较器还返回着 0（视为都相等）。
 */
