package com.learn.m13_optional;

import java.util.Optional;

/*
 * ============================================================
 * 模块：m13 Optional
 * 关卡：Ex02 取值与兜底
 * ------------------------------------------------------------
 * 【知识点】
 *   从 Optional 取值有几种不同方式：可以先问它有没有值再决定怎么办；
 *   也可以直接强行把值取出来，但盒子是空的时候这样做会抛异常、要谨慎；
 *   更推荐的是“兜底取值”——有值就返回里面的值，没值就返回你预先准备的
 *   一个默认值。这样能优雅地应对“没有值”的情况，省去成片的 if 判空。
 *
 * 【本关任务】
 *   下方 present 装着 "有值"，empty 是空盒子。
 *   请用“兜底取值”的方式从 empty 取值，并指定默认值为字符串 "默认"，
 *   把结果赋给 v1（因为 empty 是空的，应当拿到 "默认"）。
 *   使程序打印：
 *       empty.orElse = 默认
 *       present.orElse = 有值
 * ============================================================
 */
public class Ex02_OrElseIsPresent {

    public static void main(String[] args) {
        Optional<String> present = Optional.of("有值");
        Optional<String> empty = Optional.empty();

        // TODO(关卡2-1)：用“兜底取值”从 empty 取值，默认值用 "默认"，赋给 v1，使「empty.orElse = 默认」
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
