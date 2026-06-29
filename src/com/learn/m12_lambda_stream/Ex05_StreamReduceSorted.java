package com.learn.m12_lambda_stream;

import java.util.Arrays;
import java.util.List;

/*
 * ============================================================
 * 模块：m12 Lambda 与 Stream
 * 关卡：Ex05 Stream：sorted + reduce + count
 * ------------------------------------------------------------
 * 【知识点】
 *   Stream 上有几个常用的“收尾”操作：count() 统计流中元素的个数；
 *   sorted() 把流里的元素排好序；reduce 则从一个“初始值”出发，按你给定的
 *   两两合并规则，把所有元素逐步“归约”成最终的一个值（比如把它们累加成一个和）。
 *
 * 【本关任务】
 *   下方已给定 nums = [5, 3, 1, 4, 2]（保持不变），其中元素个数与排序两步
 *   已写好。请用 reduce 求出 nums 所有元素之和并赋给 sum，使程序打印：
 *       元素个数 = 5
 *       排序后 = 1 2 3 4 5
 *       总和 = 15
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

        // TODO(关卡5-1)：用 reduce 求出 nums 所有元素之和，赋给 sum
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
 *  - 如果“总和”是 0，说明 reduce 还没补全（5+3+1+4+2 应为 15）。
 */
