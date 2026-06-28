package com.learn.m12_lambda_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * ============================================================
 * 模块：m12 Lambda 与 Stream
 * 关卡：Ex04 Stream：filter + map + collect
 * ------------------------------------------------------------
 * 【知识点】
 *   Stream 把对集合的处理写成“流水线”，每一步只描述“做什么”：
 *       list.stream()                  // 变成流
 *           .filter(n -> n % 2 == 0)   // 过滤：只保留偶数
 *           .map(n -> n * 2)           // 转换：每个数乘 2
 *           .collect(Collectors.toList()); // 收集回列表
 *   流不会改变原集合，而是产出一个新结果。
 *
 * 【本关任务】
 *   从 nums 中“保留偶数”，再把保留下来的“每个数翻倍”。
 *
 * 【如何闯关】
 *   取消下面两行的注释并补全 filter、map，运行对照输出。
 * ============================================================
 */
public class Ex04_StreamFilterMap {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> result = nums.stream()
                // TODO(关卡4-1)：取消注释，保留偶数
                // .filter(n -> n % 2 == 0)
                // TODO(关卡4-2)：取消注释，把每个数乘 2
                // .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("偶数翻倍后 = " + result);
    }
}

/*
 * ============================ 预期输出 ============================
 * 偶数翻倍后 = [4, 8, 12]
 * ===============================================================
 *
 * 排查提示：
 *  - 偶数是 2、4、6，各自翻倍得到 4、8、12。
 *  - 如果输出是 [1, 2, 3, 4, 5, 6]，说明 filter / map 还没补（被注释着）。
 */
