package com.learn.m12_lambda_stream;

import java.util.Arrays;
import java.util.List;

/*
 * ============================================================
 * 模块：m12 Lambda 与 Stream
 * 关卡：Ex05 Stream：sorted + reduce + count
 * ------------------------------------------------------------
 * 【知识点】
 *   count()  统计流中元素个数。
 *   sorted() 把流排序。
 *   reduce(初始值, (a, b) -> ...) 把所有元素“归约”成一个值，
 *   例如求和： reduce(0, (a, b) -> a + b)，从 0 开始两两相加。
 *
 * 【本关任务】
 *   用 reduce 求 nums 所有元素之和。
 *
 * 【如何闯关】
 *   把 sum 的 0 改成 nums.stream().reduce(0, (a, b) -> a + b)，运行对照输出。
 * ============================================================
 */
public class Ex05_StreamReduceSorted {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 1, 4, 2);

        long count = nums.stream().count();
        System.out.println("元素个数 = " + count);

        System.out.print("排序后 = ");
        nums.stream().sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // TODO(关卡5-1)：把 0 改成 nums.stream().reduce(0, (a, b) -> a + b)
        int sum = 0;

        System.out.println("总和 = " + sum);
    }
}

/*
 * ============================ 预期输出 ============================
 * 元素个数 = 5
 * 排序后 = 1 2 3 4 5
 * 总和 = 15
 * ===============================================================
 *
 * 排查提示：
 *  - “排序后”那行末尾有一个空格（每个数字后都跟了空格），属于正常。
 *  - reduce 从初始值 0 开始：((((0+5)+3)+1)+4)+2 = 15。
 */
