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
 *   遍历集合最常用“增强 for”，能依次取出每个元素而不必关心下标。
 *   但如果想“边遍历边删除”，增强 for 会抛 ConcurrentModificationException。
 *   正确做法是借助 Iterator：先拿到列表的迭代器，反复判断还有没有
 *   下一个、取出下一个，并通过迭代器自身的删除方法来安全地移除当前元素。
 *
 * 【本关任务】
 *   下方已给定列表 nums = [1, 2, 3, 4]。请：
 *   1. 用增强 for 遍历 nums，求所有元素之和，累加到 sum。
 *   2. 用已创建好的迭代器 it 遍历 nums，删除其中所有偶数（n % 2 == 0）。
 *   补全后程序应打印：
 *       总和 = 10
 *       删除偶数后 = [1, 3]
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


        System.out.println("总和 = " + sum);

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) {
            int n = it.next();
            // TODO(关卡4-2)：如果 n 是偶数（n % 2 == 0），用迭代器把它安全地删除

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
 *  - 删除偶数 2 和 4 后只剩 [1, 3]；边遍历边删除要用迭代器自己的删除方法。
 */
