package com.learn.m18_stream_collectors;

import java.util.Arrays;
import java.util.List;

/*
 * ============================================================
 * 模块：m18 Stream 进阶 / Collectors
 * 关卡：Ex04 flatMap 摊平 + distinct / skip / limit
 * ------------------------------------------------------------
 * 【知识点】
 *   有时流里的“每个元素本身又是一个集合”（列表套列表）。flatMap 能把这种
 *   “嵌套”摊平：它把每个子集合都展开成一段子流，再把所有子流首尾相接成一条
 *   扁平的流。它和 map 的区别在于——map 是“一个换一个”，flatMap 是“一个展开成多个”。
 *   另外三个常用的“截取”操作：distinct 去掉重复元素、skip 跳过开头若干个、
 *   limit 只取开头若干个；它们常串起来用，按书写顺序依次作用。
 *
 * 【本关任务】
 *   1. 下方已给定嵌套列表 [[1, 2], [3, 4], [5]]
 *      （用 Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4), Arrays.asList(5))）。
 *      用 flatMap 把它摊平，收集成一个列表打印；应得到：
 *          [1, 2, 3, 4, 5]
 *   2. 下方已给定 [1, 1, 2, 2, 3, 3, 4, 4, 5, 5]。先去重，再跳过最前面 1 个，
 *      再只取接下来的 2 个，收集成列表打印；应得到：
 *          [2, 3]
 * ============================================================
 */
public class Ex04_FlatMapDistinctLimit {

    public static void main(String[] args) {
        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5));

        // TODO(关卡4-1)：把 nested 变成流，用 flatMap 摊平后收集成列表，赋给下面的 flat
        List<Integer> flat = null;

        System.out.println(flat);

        List<Integer> dup = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);

        // TODO(关卡4-2)：把 dup 变成流，先去重、再跳过 1 个、再只取 2 个，
        //               收集成列表，赋给下面的 picked
        List<Integer> picked = null;

        System.out.println(picked);
    }
}

/*
 * ============================ 预期输出 ============================
 * [1, 2, 3, 4, 5]
 * [2, 3]
 * ===============================================================
 *
 * 排查提示：
 *  - 第一行若还是 [[1, 2], [3, 4], [5]] 这种嵌套形状，说明还没用 flatMap 摊平。
 *  - 第二行：去重后是 [1, 2, 3, 4, 5]，跳过 1 个变成 [2, 3, 4, 5]，再只取 2 个就是 [2, 3]。
 *  - 注意 skip 和 limit 的先后顺序：先跳过、再截取。
 */
