package com.learn.m11_generics;

import java.util.ArrayList;
import java.util.List;

/*
 * ============================================================
 * 模块：m11 泛型
 * 关卡：Ex04 通配符 ? extends
 * ------------------------------------------------------------
 * 【知识点】
 *   List<Integer> 并不是 List<Number> 的子类型，所以一个只接收
 *   List<Number> 的方法没法传入 List<Integer>。通配符解决了这个问题：
 *       static double sumList(List<? extends Number> list) { ... }
 *   ? extends Number 表示“元素是某种 Number 子类型”的列表，于是
 *   List<Integer> 和 List<Double> 都能传进来（这种列表适合“只读”取数据）。
 *
 * 【本关任务】
 *   补全 sumList，把列表里每个数转成 double 累加。
 *
 * 【如何闯关】
 *   在循环里补一行把 n.doubleValue() 加到 total，运行对照输出。
 * ============================================================
 */
public class Ex04_Wildcards {

    static double sumList(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) {
            // TODO(关卡4-1)：把 n 转成 double 加到 total
            total += n.doubleValue();
            //   提示：total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.5);
        doubles.add(2.5);

        // 同一个方法，既能接收 List<Integer>，也能接收 List<Double>
        System.out.println("整数列表和 = " + sumList(ints));
        System.out.println("小数列表和 = " + sumList(doubles));
    }
}

/*
 * ============================ 预期输出 ============================
 * 整数列表和 = 6.0
 * 小数列表和 = 4.0
 * ===============================================================
 *
 * 排查提示：
 *  - 正因为用了 ? extends Number，一个方法才能同时服务两种不同的列表。
 *  - 用 ? extends 的列表只能“读”，不能往里 add 元素（这是它的限制）。
 */
