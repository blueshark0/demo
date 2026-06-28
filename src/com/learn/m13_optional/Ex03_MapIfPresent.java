package com.learn.m13_optional;

import java.util.Optional;

/*
 * ============================================================
 * 模块：m13 Optional
 * 关卡：Ex03 map 与 ifPresent
 * ------------------------------------------------------------
 * 【知识点】
 *   map：如果盒子里有值，就对值做转换，返回装着新值的盒子；如果是空盒子，
 *        什么也不做（依然是空盒子），全程不会有空指针异常。
 *   ifPresent：盒子里有值时才执行给定的操作，省去手动判空。
 *       opt.map(String::toUpperCase).ifPresent(s -> System.out.println(s));
 *
 * 【本关任务】
 *   用 map(String::toUpperCase) 把名字转成大写。
 *
 * 【如何闯关】
 *   把 name.map(s -> s) 改成 name.map(String::toUpperCase)，运行对照输出。
 * ============================================================
 */
public class Ex03_MapIfPresent {

    public static void main(String[] args) {
        Optional<String> name = Optional.of("alice");

        // TODO(关卡3-1)：把 s -> s 改成 String::toUpperCase
        Optional<String> upper = name.map(String::toUpperCase);

        // 有值时才打印
        upper.ifPresent(s -> System.out.println("大写名字 = " + s));

        // 对空盒子调用 map 也安全，结果还是空盒子
        Optional<String> nothing = Optional.empty();
        Optional<String> stillEmpty = nothing.map(String::toUpperCase);
        System.out.println("空盒子 map 之后还有值吗？ " + stillEmpty.isPresent());
    }
}

/*
 * ============================ 预期输出 ============================
 * 大写名字 = ALICE
 * 空盒子 map 之后还有值吗？ false
 * ===============================================================
 *
 * 排查提示：
 *  - 如果打印的是小写 alice，说明 map 里还是原样返回（s -> s）。
 *  - 注意第二部分：对空 Optional 调用 map 不会报错，这正是 Optional 的安全之处。
 */
