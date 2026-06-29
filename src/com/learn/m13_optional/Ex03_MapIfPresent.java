package com.learn.m13_optional;

import java.util.Optional;

/*
 * ============================================================
 * 模块：m13 Optional
 * 关卡：Ex03 map 与 ifPresent
 * ------------------------------------------------------------
 * 【知识点】
 *   map：如果盒子里有值，就对值做一次转换，返回一个装着转换后新值的盒子；
 *        如果是空盒子，就什么也不做（依然是空盒子），全程不会有空指针异常。
 *   ifPresent：盒子里确实有值时，才执行你给定的那段操作，省去手动判空。
 *   把两者连起来用，可以在“有值才处理、空了就自动跳过”的前提下，
 *   安全地对盒子里的内容做加工。
 *
 * 【本关任务】
 *   下方 name 装着 "alice"。
 *   请用 map 把盒子里的名字转成全大写，得到一个新的 Optional，赋给 upper；
 *   随后已写好的 ifPresent 会在有值时打印它。
 *   另外，请对空盒子 nothing 同样做一次“转成大写”的 map，得到 stillEmpty。
 *   使程序打印：
 *       大写名字 = ALICE
 *       空盒子 map 之后还有值吗？ false
 * ============================================================
 */
public class Ex03_MapIfPresent {

    public static void main(String[] args) {
        Optional<String> name = Optional.of("alice");

        // TODO(关卡3-1)：用 map 把 name 里的名字转成全大写，结果赋给 upper，使下方打印「大写名字 = ALICE」
        Optional<String> upper = name;

        // 有值时才打印
        upper.ifPresent(s -> System.out.println("大写名字 = " + s));

        // 对空盒子调用 map 也安全，结果还是空盒子
        Optional<String> nothing = Optional.empty();
        // TODO(关卡3-2)：对空盒子 nothing 也做一次“转成大写”的 map，结果赋给 stillEmpty
        Optional<String> stillEmpty = nothing;
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
