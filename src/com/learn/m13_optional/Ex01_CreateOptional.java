package com.learn.m13_optional;

import java.util.Optional;

/*
 * ============================================================
 * 模块：m13 Optional
 * 关卡：Ex01 创建 Optional
 * ------------------------------------------------------------
 * 【知识点】
 *   Optional 是一个“可能有值、也可能为空”的盒子，三种创建方式：
 *       Optional.of(值)         值不能为 null，否则直接抛异常
 *       Optional.ofNullable(值) 值可以为 null（为 null 就是空盒子）
 *       Optional.empty()        直接创建一个空盒子
 *   用 isPresent() 判断盒子里到底有没有值。
 *
 * 【本关任务】
 *   用 Optional.empty() 创建一个空的 Optional。
 *
 * 【如何闯关】
 *   把 c 的 null 改成 Optional.empty()，运行对照输出。
 * ============================================================
 */
public class Ex01_CreateOptional {

    public static void main(String[] args) {
        Optional<String> a = Optional.of("hello");      // 有值
        Optional<String> b = Optional.ofNullable(null); // 空（因为传了 null）

        // TODO(关卡1-1)：把 null 改成 Optional.empty()
        Optional<String> c = Optional.empty();

        System.out.println("a 有值吗？ " + a.isPresent());
        System.out.println("b 有值吗？ " + b.isPresent());
        System.out.println("c 有值吗？ " + c.isPresent());
    }
}

/*
 * ============================ 预期输出 ============================
 * a 有值吗？ true
 * b 有值吗？ false
 * c 有值吗？ false
 * ===============================================================
 *
 * 排查提示：
 *  - 若 c 还是 null，调用 c.isPresent() 会抛空指针异常并崩溃。
 *  - 注意区别：b 是“装着 null 的 Optional”，它是空盒子，isPresent 为 false。
 */
