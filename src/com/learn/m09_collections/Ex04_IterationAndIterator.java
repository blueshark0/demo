package com.learn.m09_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * ============================================================
 * 模块：m09 集合
 * 关卡：Ex04 遍历与 Iterator
 * ------------------------------------------------------------
 * 【知识点】
 *   遍历集合最常用增强 for： for (int n : list) { ... }
 *   但如果想“边遍历边删除”，用增强 for 会抛 ConcurrentModificationException，
 *   正确做法是用 Iterator 的 remove()：
 *       Iterator<Integer> it = list.iterator();
 *       while (it.hasNext()) {
 *           int n = it.next();
 *           if (条件) it.remove();   // 安全删除
 *       }
 *
 * 【本关任务】
 *   1. 用增强 for 求列表所有元素之和。
 *   2. 用 Iterator 删除列表中所有偶数。
 *
 * 【如何闯关】
 *   按 TODO 补全两处，运行对照输出。
 * ============================================================
 */
public class Ex04_IterationAndIterator {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        int sum = 0;
        // TODO(关卡4-1)：用增强 for 遍历 nums，把每个数累加到 sum
        //   提示：for (int n : nums) sum += n;

        System.out.println("总和 = " + sum);

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            int n = it.next();
            // TODO(关卡4-2)：如果 n 是偶数（n % 2 == 0），用 it.remove() 删除它
            //   提示：if (n % 2 == 0) it.remove();
        }

        System.out.println("删除偶数后 = " + nums);
    }
}

/*
 * ============================ 预期输出 ============================
 * 总和 = 10
 * 删除偶数后 = [1, 3]
 * ===============================================================
 *
 * 排查提示：
 *  - 1+2+3+4 = 10。
 *  - 删除偶数 2 和 4 后只剩 [1, 3]；删除一定要用 it.remove()，不能用 nums.remove()。
 */
