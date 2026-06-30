package com.learn.m11_generics;

/*
 * ============================================================
 * 模块：m11 泛型
 * 关卡：Ex03 有界类型 <T extends Number>
 * ------------------------------------------------------------
 * 【知识点】
 *   有时你希望类型参数“必须是某个类的子类”，可以用 extends 给它设一个上界。
 *   下方 <T extends Number> 就限定了 T 必须是 Number 的子类（如整数、小数），
 *   正因为有这层限制，才能在方法里安全地把每个元素当作 Number 来取它的数值。
 *
 * 【本关任务】
 *   下方有界泛型方法 sum 的签名已给好，循环骨架也已搭好，方法体待补：
 *   遍历数组时，把每个元素转成 double 累加到 total 上。补全后程序应打印：
 *       整数和 = 6.0
 *       小数和 = 4.0
 * ============================================================
 */
public class Ex03_BoundedType {

    static <T extends Number> double sum(T[] array) {
        double total = 0;
        for (T n : array) {
            // TODO(关卡3-1)：把当前元素 n 转成 double，并累加到 total 上

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
 *  - 因为有 <T extends Number> 的限制，才能把元素安全地当作数值取出来累加。
 *  - 如果循环体没补，total 会一直是 0.0。
 */
