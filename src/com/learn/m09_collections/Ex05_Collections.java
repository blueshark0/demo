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
 *   Collections 是一个工具类，提供很多操作集合的静态方法，例如：
 *   求列表中的最大值、求最小值、把列表从小到大排序、把列表的顺序反转。
 *   要注意：排序和反转都是“原地”操作，会直接改变传入的那个列表本身，
 *   而不是返回一个新列表。
 *
 * 【本关任务】
 *   下方已给定列表 nums = [3, 1, 4, 1, 5, 9, 2]。请：
 *   1. 求出 nums 的最大值，赋给 max。
 *   2. 求出 nums 的最小值，赋给 min。
 *   3. 把 nums 从小到大排序。
 *   4. 把排序后的 nums 反转。
 *   补全后程序应打印：
 *       最大值 = 9
 *       最小值 = 1
 *       排序后 = [1, 1, 2, 3, 4, 5, 9]
 *       反转后 = [9, 5, 4, 3, 2, 1, 1]
 * ============================================================
 */
public class Ex05_Collections {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 3, 1, 4, 1, 5, 9, 2);

        // TODO(关卡5-1)：求出 nums 的最大值，赋给 max
        int max = Collections.max(nums);
        // TODO(关卡5-2)：求出 nums 的最小值，赋给 min
        int min = Collections.min(nums);

        // TODO(关卡5-3)：把 nums 从小到大排序（原地修改 nums）
        Collections.sort(nums);

        System.out.println("最大值 = " + max);
        System.out.println("最小值 = " + min);
        System.out.println("排序后 = " + nums);

        // TODO(关卡5-4)：把 nums 反转（原地修改 nums）
        Collections.reverse(nums);


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
