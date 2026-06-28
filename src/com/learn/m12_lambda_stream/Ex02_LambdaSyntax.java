package com.learn.m12_lambda_stream;

import java.util.Arrays;

/*
 * ============================================================
 * 模块：m12 Lambda 与 Stream
 * 关卡：Ex02 Lambda 语法
 * ------------------------------------------------------------
 * 【知识点】
 *   很多 Java 内置接口都能用 Lambda 实现，例如：
 *     Runnable：无参无返回   () -> System.out.println("...")
 *     Comparator：比较两个值 (a, b) -> a - b   （负数表示 a 排在前面）
 *   把 Comparator 传给 Arrays.sort，就能自定义排序规则。
 *
 * 【本关任务】
 *   用 Lambda 定义比较器，让字符串数组“按长度从短到长”排序。
 *
 * 【如何闯关】
 *   把比较器 (a, b) -> 0 改成 (a, b) -> a.length() - b.length()，运行对照输出。
 * ============================================================
 */
public class Ex02_LambdaSyntax {

    public static void main(String[] args) {
        // Runnable：用 Lambda 描述“要做的事”
        Runnable r = () -> System.out.println("Runnable 跑起来了");
        r.run();

        String[] words = {"banana", "fig", "apple"};

        // TODO(关卡2-1)：把 0 改成 a.length() - b.length()，按长度排序
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
