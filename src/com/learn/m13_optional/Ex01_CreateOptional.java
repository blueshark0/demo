package com.learn.m13_optional;

import java.util.Optional;

/*
 * ============================================================
 * 模块：m13 Optional
 * 关卡：Ex01 创建 Optional
 * ------------------------------------------------------------
 * 【知识点】
 *   Optional 是一个“可能有值、也可能为空”的盒子，用来更安全地表达
 *   “这里也许没有值”，避免到处直接面对 null。它有几种不同的创建途径：
 *   有的要求传入的值必须非空、否则当场报错；有的允许传入可能为空的值、
 *   为空时就得到一个空盒子；还有的直接造一个明确的空盒子。
 *   盒子造好后，可以问它“里面到底有没有值”，得到 true 或 false。
 *
 * 【本关任务】
 *   下方已给出两个盒子：a 装着 "hello"，b 由一个 null 得来（是空盒子）。
 *   请再创建一个明确为空的 Optional<String>，赋给变量 c。
 *   使程序打印：
 *       a 有值吗？ true
 *       b 有值吗？ false
 *       c 有值吗？ false
 * ============================================================
 */
public class Ex01_CreateOptional {

    public static void main(String[] args) {
        Optional<String> a = Optional.of("hello");      // 有值
        Optional<String> b = Optional.ofNullable(null); // 空（因为传了 null）

        // TODO(关卡1-1)：创建一个明确为空的 Optional<String>，赋给 c，使「c 有值吗？」打印 false
        Optional<String> c = null;

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
