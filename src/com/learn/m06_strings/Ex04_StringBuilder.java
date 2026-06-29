package com.learn.m06_strings;

/*
 * ============================================================
 * 模块：m06 String 字符串
 * 关卡：Ex04 StringBuilder
 * ------------------------------------------------------------
 * 【知识点】
 *   每次用加号拼接字符串都会生成一个新对象，循环里大量拼接会很浪费。
 *   StringBuilder 是“可变的字符串”，适合频繁拼接：它可以往末尾不断
 *   追加内容，也能把已有内容整体反转，最后再转回普通字符串使用。
 *   它的追加操作还支持“链式调用”——一次连着追加多段内容。
 *
 * 【本关任务】
 *   下方已给定空的 sb 和内容为 "abcde" 的 sb2
 *   （必须用这两个固定起点，输出才能对上）。请：
 *   1. 往 sb 末尾依次追加 "a"、"b"、"c"，使「拼接结果」为「abc」。
 *   2. 把 sb2（"abcde"）整体反转，使「反转结果」为「edcba」。
 * ============================================================
 */
public class Ex04_StringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // TODO(关卡4-1)：往 sb 末尾依次追加 "a"、"b"、"c"

        String built = sb.toString();

        StringBuilder sb2 = new StringBuilder("abcde");
        // TODO(关卡4-2)：把 sb2 整体反转

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
 *  - 如果“拼接结果”是空的，说明追加这步还没补。
 *  - 反转会直接改变 sb2 本身，不需要接收返回值。
 */
