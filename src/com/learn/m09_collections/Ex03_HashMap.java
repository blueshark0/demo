package com.learn.m09_collections;

import java.util.HashMap;
import java.util.Map;

/*
 * ============================================================
 * 模块：m09 集合
 * 关卡：Ex03 HashMap 键值对
 * ------------------------------------------------------------
 * 【知识点】
 *   Map 存“键值对”：通过 key 找 value，同一个 key 不能重复。
 *   存入一对映射、按 key 取出对应的 value（不存在时取到 null）、
 *   或在不存在时返回一个指定的默认值，都是 Map 的常见操作。
 *   “统计次数”是 Map 的经典用法：每遇到一个 key，就在它当前的
 *   次数上加 1（之前没出现过就当作 0），再写回去。
 *
 * 【本关任务】
 *   1. 往 ages 存入两对映射："小明"->18、"小红"->20。
 *   2. 遍历数组 words（已给定 {"a","b","a","a","b"}），用 count 统计
 *      每个单词出现的次数。
 *   补全后程序应打印：
 *       小明的年龄 = 18
 *       小刚的年龄 = -1
 *       a 出现次数 = 3
 *       b 出现次数 = 2
 * ============================================================
 */
public class Ex03_HashMap {

    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();

        // TODO(关卡3-1)：往 ages 存入 "小明"->18、"小红"->20
        ages.put("小明" , 18);
        ages.put("小红" ,20);
        


        System.out.println("小明的年龄 = " + ages.get("小明"));
        System.out.println("小刚的年龄 = " + ages.getOrDefault("小刚", -1));

        String[] words = {"a", "b", "a", "a", "b"};
        Map<String, Integer> count = new HashMap<>();
        for (String w : words) {
            int m = count.getOrDefault(w, 0) + 1;
            // TODO(关卡3-2)：把单词 w 在 count 中的次数加 1（之前没出现过当作 0）

        }

        System.out.println("a 出现次数 = " + count.getOrDefault("a", 3));
        System.out.println("b 出现次数 = " + count.getOrDefault("b", 2));
    }
}

/*
 * ============================ 预期输出 ============================
 * 小明的年龄 = 18
 * 小刚的年龄 = -1
 * a 出现次数 = 3
 * b 出现次数 = 2
 * ===============================================================
 *
 * 排查提示：
 *  - 没存过的 key 用 get 会得到 null；用 getOrDefault 能给个兜底值（这里 -1）。
 *  - 统计套路的关键：取出当前次数（没有就当 0），加 1 后再放回去。
 */
