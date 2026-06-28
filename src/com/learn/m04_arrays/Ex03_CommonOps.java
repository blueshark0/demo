package com.learn.m04_arrays;

import java.util.Arrays;

/*
 * ============================================================
 * 模块：m04 数组
 * 关卡：Ex03 求最值与排序
 * ------------------------------------------------------------
 * 【知识点】
 *   求最大值的思路：先假设第一个元素最大，再逐个比较、遇到更大的就更新。
 *   求最小值同理。
 *   排序可以直接用工具方法： Arrays.sort(data);  // 默认从小到大
 *   Arrays.toString(data) 能把数组变成好看的字符串，方便打印。
 *   （注意文件顶部已经 import java.util.Arrays;）
 *
 * 【本关任务】
 *   1. 求出数组的最大值 max 和最小值 min。
 *   2. 用 Arrays.sort 把数组从小到大排序。
 *
 * 【如何闯关】
 *   补全两个循环体里的比较语句，以及排序那一行，运行对照输出。
 * ============================================================
 */
public class Ex03_CommonOps {

    public static void main(String[] args) {
        int[] data = {5, 3, 9, 1, 7};

        int max = data[0];
        for (int v : data) {
            // TODO(关卡3-1)：如果 v 比 max 大，就把 v 赋给 max
            //   提示：if (v > max) max = v;
        }

        int min = data[0];
        for (int v : data) {
            // TODO(关卡3-2)：如果 v 比 min 小，就把 v 赋给 min
            //   提示：if (v < min) min = v;
        }

        // TODO(关卡3-3)：用 Arrays.sort(data) 给数组排序
        //   提示：Arrays.sort(data);

        System.out.println("最大值 = " + max);
        System.out.println("最小值 = " + min);
        System.out.println("排序后 = " + Arrays.toString(data));
    }
}

/*
 * ============================ 预期输出 ============================
 * 最大值 = 9
 * 最小值 = 1
 * 排序后 = [1, 3, 5, 7, 9]
 * ===============================================================
 *
 * 排查提示：
 *  - 如果“排序后”还是 [5, 3, 9, 1, 7]，说明 Arrays.sort 那行还没补。
 *  - Arrays.sort 会直接修改原数组本身，不需要接收返回值。
 */
