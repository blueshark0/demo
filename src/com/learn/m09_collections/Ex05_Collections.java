package com.learn.m09_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * ============================================================
 * 模块：m09 集合
 * 关卡：Ex05 Collections 工具类
 * ------------------------------------------------------------
 * 【知识点】
 *   Collections 是一个工具类，提供很多操作集合的静态方法：
 *       Collections.max(list)      最大值
 *       Collections.min(list)      最小值
 *       Collections.sort(list)     从小到大排序（直接改变原列表）
 *       Collections.reverse(list)  反转顺序（直接改变原列表）
 *
 * 【本关任务】
 *   求最大值、最小值，给列表排序，再反转。
 *
 * 【如何闯关】
 *   按 TODO 补全四处调用，运行对照输出。
 * ============================================================
 */
public class Ex05_Collections {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 3, 1, 4, 1, 5, 9, 2);

        // TODO(关卡5-1)：把 0 改成 Collections.max(nums)
        int max = 0;
        // TODO(关卡5-2)：把 0 改成 Collections.min(nums)
        int min = 0;

        // TODO(关卡5-3)：用 Collections.sort(nums) 给列表排序
        //   提示：Collections.sort(nums);

        System.out.println("最大值 = " + max);
        System.out.println("最小值 = " + min);
        System.out.println("排序后 = " + nums);

        // TODO(关卡5-4)：用 Collections.reverse(nums) 反转列表
        //   提示：Collections.reverse(nums);

        System.out.println("反转后 = " + nums);
    }
}

/*
 * ============================ 预期输出 ============================
 * 最大值 = 9
 * 最小值 = 1
 * 排序后 = [1, 1, 2, 3, 4, 5, 9]
 * 反转后 = [9, 5, 4, 3, 2, 1, 1]
 * ===============================================================
 *
 * 排查提示：
 *  - sort 和 reverse 都会“直接改变”原列表，不返回新列表。
 *  - 先排序成从小到大，再反转，就变成了从大到小。
 */
