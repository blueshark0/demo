package com.learn.m11_generics;

/*
 * ============================================================
 * 模块：m11 泛型
 * 关卡：Ex03 有界类型 <T extends Number>
 * ------------------------------------------------------------
 * 【知识点】
 *   有时你希望类型参数“必须是某类的子类”，用 extends 设上界：
 *       static <T extends Number> double sum(T[] array) { ... }
 *   这里限定 T 必须是 Number 的子类（Integer、Double 等），这样才能
 *   安全调用 Number 的方法，比如 doubleValue()。
 *
 * 【本关任务】
 *   补全 sum，把数组里每个数转成 double 累加。
 *
 * 【如何闯关】
 *   在循环里补一行把 n.doubleValue() 加到 total，运行对照输出。
 * ============================================================
 */
public class Ex03_BoundedType {

    static <T extends Number> double sum(T[] array) {
        double total = 0;
        for (T n : array) {
            // TODO(关卡3-1)：把 n 转成 double 加到 total
            total = total + n.doubleValue();
            //   提示：total += n.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        Integer[] ints = {1, 2, 3};
        Double[] doubles = {1.5, 2.5};

        System.out.println("整数和 = " + sum(ints));
        System.out.println("小数和 = " + sum(doubles));
    }
}

/*
 * ============================ 预期输出 ============================
 * 整数和 = 6.0
 * 小数和 = 4.0
 * ===============================================================
 *
 * 排查提示：
 *  - 因为有 <T extends Number> 的限制，才能调用 doubleValue()。
 *  - 如果循环体没补，total 一直是 0.0。
 */
