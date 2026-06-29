package com.learn.m18_stream_collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*
 * ============================================================
 * 模块：m18 Stream 进阶 / Collectors
 * 关卡：Ex02 分组 + 下游收集器 counting
 * ------------------------------------------------------------
 * 【知识点】
 *   groupingBy 不只是“分桶成列表”：它还能接一个“下游收集器”，对每个桶里的
 *   元素再做一次聚合。换句话说，分组负责“分”，下游收集器负责对每组“算”。
 *   其中 counting 这个下游收集器，做的就是“数一数这组有几个元素”，它给出的
 *   计数是 Long 类型。于是你能一步得到“键 → 该组元素个数”的 Map。
 *   和上一关一样，要稳定、可复现地打印整个 Map，就得用按键排序的有序 Map。
 *
 * 【本关任务】
 *   下方已给定 5 个单词（用 Arrays.asList，原始顺序）：
 *       apple, banana, avocado, cherry, blueberry
 *   按“单词首字母”分组，并统计每组有几个单词；结果按键升序、可复现，
 *   因此装入按键排序的有序 Map（TreeMap）后整体打印，使程序输出：
 *       {a=2, b=2, c=1}
 * ============================================================
 */
public class Ex02_GroupingCountingDownstream {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry", "blueberry");

        // TODO(关卡2-1)：把 words 变成流，按首字母分组，并对每组统计个数，
        //               结果装入按键升序的有序 Map，赋给下面的 counts
        Map<Character, Long> counts = null;

        System.out.println(counts);
    }
}

/*
 * ============================ 预期输出 ============================
 * {a=2, b=2, c=1}
 * ===============================================================
 *
 * 排查提示：
 *  - 首字母 a 的有 apple、avocado 共 2 个；b 的有 banana、blueberry 共 2 个；c 的有 cherry 1 个。
 *  - 如果打印 null，说明 counts 还没被赋值。
 *  - 如果每组得到的是单词列表而不是个数，说明还没用上“统计个数”的下游收集器。
 */
