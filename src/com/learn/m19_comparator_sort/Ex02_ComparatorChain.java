package com.learn.m19_comparator_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * ============================================================
 * 模块：m19 比较器与排序进阶 + 集合补全
 * 关卡：Ex02 comparing / thenComparing / reversed
 * ------------------------------------------------------------
 * 【知识点】
 *   除了让类自带“自然顺序”，你也能在排序时临时给出一个比较器。现代写法
 *   是从“取键函数”出发：告诉比较器“拿对象的哪个字段当排序依据”，它就会
 *   按那个字段比较。当主键相等时，可以再追加一个“次级依据”来打破平局，
 *   让排序结果稳定可预期。还可以把整个比较器整体反向，得到降序。
 *   要点：把“整体反向”和“追加次级依据”组合时，反向只作用于它前面那一段，
 *   因此可以做到“主键降序、但同主键时次键仍按升序”的效果。
 *
 * 【本关任务】
 *   下方 Member 有 name 与 score 两个字段。给定四人：Tom 85、Amy 85、
 *   Bob 92、Cara 78。请在 main 里对同一个列表做两次排序并各打印一次：
 *   1. 先按分数升序排序；分数相同时按姓名字母升序。
 *      应得「[Cara(78), Amy(85), Tom(85), Bob(92)]」。
 *   2. 再按分数降序排序；分数相同时姓名仍按字母升序（注意降序写法要保证
 *      同分时姓名依然是升序）。应得「[Bob(92), Amy(85), Tom(85), Cara(78)]」。
 * ============================================================
 */
public class Ex02_ComparatorChain {

    static class Member {
        String name;
        int score;
        Member(String name, int score) { this.name = name; this.score = score; }
        @Override public String toString() { return name + "(" + score + ")"; }
    }

    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        list.add(new Member("Tom", 85));
        list.add(new Member("Amy", 85));
        list.add(new Member("Bob", 92));
        list.add(new Member("Cara", 78));

        // TODO(关卡2-1)：按分数升序、分数相同按姓名升序排序，然后整体打印
        //               （应为 [Cara(78), Amy(85), Tom(85), Bob(92)]）

        // TODO(关卡2-2)：按分数降序、同分仍按姓名升序排序，然后整体打印
        //               （应为 [Bob(92), Amy(85), Tom(85), Cara(78)]）
    }
}

/*
 * ============================ 预期输出 ============================
 * [Cara(78), Amy(85), Tom(85), Bob(92)]
 * [Bob(92), Amy(85), Tom(85), Cara(78)]
 * ===============================================================
 *
 * 排查提示：
 *  - 若同分的 Amy 与 Tom 顺序不对，说明缺少“次级依据”或次级方向写反了。
 *  - 第二次若把整个比较器都反向了，同分姓名会变降序；只反向分数那一段即可。
 */
