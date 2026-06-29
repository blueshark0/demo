package com.learn.m18_stream_collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/*
 * ============================================================
 * 模块：m18 Stream 进阶 / Collectors
 * 关卡：Ex03 toMap 建索引 + joining 拼接
 * ------------------------------------------------------------
 * 【知识点】
 *   toMap 和 groupingBy 不同：它不分桶，而是把“每一个元素”各自映射成一对
 *   “键、值”，从而把整条流整理成一个 Map（适合用来建索引／查找表）。同样地，
 *   默认得到的 Map 无序，要稳定打印就用按键排序的有序 Map。
 *   joining 则是专门拼字符串的收集器：把一条字符串流用指定的分隔符连成一整串，
 *   还能在最前、最后各加上一段前缀和后缀。
 *
 * 【本关任务】
 *   下方已给定 5 个单词（用 Arrays.asList，原始顺序 apple, banana, avocado, cherry, blueberry）。
 *   1. 用 toMap 生成「单词 → 单词长度」的映射，按键升序、可复现，装入按键排序
 *      的有序 Map（TreeMap）后整体打印；应得到：
 *          {apple=5, avocado=7, banana=6, blueberry=9, cherry=6}
 *   2. 用 joining，以分隔符「, 」、前缀「[」、后缀「]」把全部单词（保持原始顺序）
 *      拼成一个串并打印；应得到：
 *          [apple, banana, avocado, cherry, blueberry]
 * ============================================================
 */
public class Ex03_ToMapAndJoining {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "cherry", "blueberry");

        // TODO(关卡3-1)：用 toMap 把每个单词映射成「单词 → 长度」，
        //               结果装入按键升序的有序 Map，赋给下面的 lenMap
        Map<String, Integer> lenMap = null;

        System.out.println(lenMap);

        // TODO(关卡3-2)：用 joining（分隔符「, 」、前缀「[」、后缀「]」）把全部单词拼成一个串，
        //               赋给下面的 joined
        String joined = "";

        System.out.println(joined);
    }
}

/*
 * ============================ 预期输出 ============================
 * {apple=5, avocado=7, banana=6, blueberry=9, cherry=6}
 * [apple, banana, avocado, cherry, blueberry]
 * ===============================================================
 *
 * 排查提示：
 *  - 第一行是 Map：键是单词、值是该单词的字母个数；顺序乱了说明没用按键排序的有序 Map。
 *  - 第二行是一整个字符串：开头有「[」、结尾有「]」、单词之间用「, 」隔开。
 *  - 第二行若没有方括号或单词没被分隔开，说明 joining 的分隔符／前后缀还没填对。
 */
