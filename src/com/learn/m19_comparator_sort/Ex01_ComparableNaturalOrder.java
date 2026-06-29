package com.learn.m19_comparator_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * ============================================================
 * 模块：m19 比较器与排序进阶 + 集合补全
 * 关卡：Ex01 Comparable 自然排序
 * ------------------------------------------------------------
 * 【知识点】
 *   一个类如果实现了 Comparable，就等于给自己定义了一个“天生的、默认的”
 *   排序规则，这叫“自然顺序”。一旦有了自然顺序，再对这种对象排序或求最大值
 *   时，就不用每次都临时给一个比较器了。自然顺序的核心是一个用来“两两比较”
 *   的方法：它接收“另一个对象”，约定返回负数表示“我比它小”、返回零表示
 *   “一样大”、返回正数表示“我比它大”。排序工具正是靠这个返回值来决定先后。
 *   想按某个整数字段升序，就让“我的值减去对方的值”的符号正好对应大小关系。
 *
 * 【本关任务】
 *   下方 Student 已声明“实现了 Comparable”，请补全它的比较方法，使其
 *   按 score（分数）从小到大为自然顺序。
 *   然后在 main 里：
 *   1. 把给定的三名学生（Tom 85、Amy 92、Bob 78）放进一个可排序的列表，
 *      按自然顺序排序后整体打印，应得「[Bob(78), Tom(85), Amy(92)]」。
 *   2. 求出列表中分数最高的学生并打印「最高分 = Amy(92)」。
 * ============================================================
 */
public class Ex01_ComparableNaturalOrder {

    static class Student implements Comparable<Student> {
        String name;
        int score;
        Student(String name, int score) { this.name = name; this.score = score; }
        @Override public String toString() { return name + "(" + score + ")"; }

        @Override public int compareTo(Student o) {
            // TODO(关卡1-1)：定义自然顺序——按 score 从小到大比较，返回负/零/正
            throw new UnsupportedOperationException("请补全：按 score 升序的比较");
        }
    }

    public static void main(String[] args) {
        // TODO(关卡1-2)：把 Tom 85、Amy 92、Bob 78 放入一个可排序的列表，
        //               按自然顺序排序后整体打印（应为 [Bob(78), Tom(85), Amy(92)]）

        // TODO(关卡1-3)：求出并打印分数最高的学生「最高分 = Amy(92)」
    }
}

/*
 * ============================ 预期输出 ============================
 * [Bob(78), Tom(85), Amy(92)]
 * 最高分 = Amy(92)
 * ===============================================================
 *
 * 排查提示：
 *  - 若排序结果是降序或乱序，检查比较方法里“谁减谁”的方向。
 *  - 若求最高分得到的是 Bob 或 Tom，说明比较方向反了或求最值用错了方向。
 */
