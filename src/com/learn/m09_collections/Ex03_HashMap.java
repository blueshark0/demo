package com.learn.m09_collections;

import java.util.HashMap;
import java.util.Map;

/*
 * ============================================================
 * 模块：m09 集合
 * 关卡：Ex03 HashMap 键值对
 * ------------------------------------------------------------
 * 【知识点】
 *   Map 存“键值对”，通过 key 找 value，key 不能重复：
 *       Map<String, Integer> map = new HashMap<>();
 *       map.put("小明", 18);                 存入
 *       map.get("小明");                     取出（不存在返回 null）
 *       map.getOrDefault("小刚", -1);        不存在时返回默认值
 *   统计次数的经典套路： map.put(k, map.getOrDefault(k, 0) + 1);
 *
 * 【本关任务】
 *   1. 往 ages 存入 "小明"->18、"小红"->20。
 *   2. 统计数组 words 中每个单词出现的次数。
 *
 * 【如何闯关】
 *   按 TODO 补全两处，运行对照输出。
 * ============================================================
 */
public class Ex03_HashMap {

    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();

        // TODO(关卡3-1)：存入 "小明"->18、"小红"->20
        ages.put("小明", 18);
        ages.put("小红", 20);
        //   提示：ages.put("小明", 18); ages.put("小红", 20);

        System.out.println("小明的年龄 = " + ages.get("小明"));
        System.out.println("小刚的年龄 = " + ages.getOrDefault("小刚", -1));

        String[] words = {"a", "b", "a", "a", "b"};
        Map<String, Integer> count = new HashMap<>();
        for (String w : words) {
            // TODO(关卡3-2)：把单词 w 的次数加 1
            count.put(w, count.getOrDefault(w,0)+1);
            //   提示：count.put(w, count.getOrDefault(w, 0) + 1);
        }

        System.out.println("a 出现次数 = " + count.getOrDefault("a", 0));
        System.out.println("b 出现次数 = " + count.getOrDefault("b", 0));
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
