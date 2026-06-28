package com.learn.m09_collections;

import java.util.HashSet;
import java.util.Set;

/*
 * ============================================================
 * 模块：m09 集合
 * 关卡：Ex02 HashSet 集合
 * ------------------------------------------------------------
 * 【知识点】
 *   Set 是“无序、不重复”的集合：往里加重复元素会被自动忽略。
 *       Set<String> set = new HashSet<>();
 *       set.add("a");           添加
 *       set.contains("a");      是否包含
 *       set.size();             元素个数（重复的只算一个）
 *
 * 【本关任务】
 *   依次添加 "a"、"b"、"a"（注意第三个是重复的 "a"）。
 *
 * 【如何闯关】
 *   按 TODO 补全三次 add 调用，运行对照输出，观察重复元素被去掉。
 * ============================================================
 */
public class Ex02_HashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // TODO(关卡2-1)：依次添加 "a"、"b"、"a"
        set.add("a"); set.add("b"); set.add("a");
        //   提示：set.add("a"); set.add("b"); set.add("a");

        System.out.println("集合大小 = " + set.size()); // 重复的 a 只算一次
        System.out.println("包含 a？ " + set.contains("a"));
        System.out.println("包含 c？ " + set.contains("c"));
    }
}

/*
 * ============================ 预期输出 ============================
 * 集合大小 = 2
 * 包含 a？ true
 * 包含 c？ false
 * ===============================================================
 *
 * 排查提示：
 *  - 添加了三次，但 "a" 重复，所以大小是 2 而不是 3。
 *  - Set 不保证顺序，所以不要依赖元素的先后。
 */
