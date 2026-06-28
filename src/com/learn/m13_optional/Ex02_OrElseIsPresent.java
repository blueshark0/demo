package com.learn.m13_optional;

import java.util.Optional;

/*
 * ============================================================
 * 模块：m13 Optional
 * 关卡：Ex02 取值与兜底
 * ------------------------------------------------------------
 * 【知识点】
 *   从 Optional 取值的几种方式：
 *       isPresent()     有没有值（true / false）
 *       get()           直接取值（空盒子时会抛异常，慎用）
 *       orElse(默认值)   有值就返回值，没值就返回你给的默认值（推荐）
 *   orElse 让你优雅地处理“没有值”的情况，不用写一堆 if 判空。
 *
 * 【本关任务】
 *   用 orElse("默认") 取出 empty 的值（它是空的，应该拿到 "默认"）。
 *
 * 【如何闯关】
 *   把 v1 的空串改成 empty.orElse("默认")，运行对照输出。
 * ============================================================
 */
public class Ex02_OrElseIsPresent {

    public static void main(String[] args) {
        Optional<String> present = Optional.of("有值");
        Optional<String> empty = Optional.empty();

        // TODO(关卡2-1)：把空串改成 empty.orElse("默认")
        String v1 = "";

        String v2 = present.orElse("默认"); // 有值，返回 "有值"

        System.out.println("empty.orElse = " + v1);
        System.out.println("present.orElse = " + v2);
    }
}

/*
 * ============================ 预期输出 ============================
 * empty.orElse = 默认
 * present.orElse = 有值
 * ===============================================================
 *
 * 排查提示：
 *  - empty 是空盒子，orElse 返回兜底的 "默认"。
 *  - present 有值，orElse 直接返回里面的 "有值"，不会用默认值。
 */
