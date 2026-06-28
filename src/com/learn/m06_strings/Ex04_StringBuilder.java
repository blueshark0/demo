package com.learn.m06_strings;

/*
 * ============================================================
 * 模块：m06 String 字符串
 * 关卡：Ex04 StringBuilder
 * ------------------------------------------------------------
 * 【知识点】
 *   每次用 + 拼接字符串都会生成一个新对象，循环里大量拼接会很浪费。
 *   StringBuilder 是“可变的字符串”，适合频繁拼接：
 *       StringBuilder sb = new StringBuilder();
 *       sb.append("a");          // 追加
 *       sb.reverse();            // 反转
 *       String result = sb.toString();  // 转回普通字符串
 *   append 还能“链式调用”： sb.append("a").append("b");
 *
 * 【本关任务】
 *   1. 用 append 依次追加 "a"、"b"、"c"。
 *   2. 把 "abcde" 反转。
 *
 * 【如何闯关】
 *   按 TODO 补全 append 与 reverse 的调用，运行对照输出。
 * ============================================================
 */
public class Ex04_StringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // TODO(关卡4-1)：用 append 依次追加 "a"、"b"、"c"
        //   提示：sb.append("a"); sb.append("b"); sb.append("c");
        //        （也可以写成链式：sb.append("a").append("b").append("c");）
        String built = sb.toString();

        StringBuilder sb2 = new StringBuilder("abcde");
        // TODO(关卡4-2)：用 reverse 反转 sb2
        //   提示：sb2.reverse();
        String reversed = sb2.toString();

        System.out.println("拼接结果 = " + built);
        System.out.println("反转结果 = " + reversed);
    }
}

/*
 * ============================ 预期输出 ============================
 * 拼接结果 = abc
 * 反转结果 = edcba
 * ===============================================================
 *
 * 排查提示：
 *  - 如果“拼接结果”是空的，说明 append 还没补。
 *  - reverse() 会直接改变 sb2 本身，不需要接收返回值。
 */
