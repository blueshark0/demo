package com.learn.m11_generics;

/*
 * ============================================================
 * 模块：m11 泛型
 * 关卡：Ex02 泛型方法
 * ------------------------------------------------------------
 * 【知识点】
 *   方法也可以是泛型的：在返回类型前面写 <T> 声明类型参数，
 *   就能用同一个方法处理不同类型的数组：
 *       static <T> T firstOf(T[] array) { return array[0]; }
 *       firstOf(names)  // T 是 String
 *       firstOf(nums)   // T 是 Integer
 *
 * 【本关任务】
 *   补全 firstOf，返回数组的第一个元素。
 *
 * 【如何闯关】
 *   把方法里的 throw 替换成 return array[0];，运行对照输出。
 * ============================================================
 */
public class Ex02_GenericMethod {

    static <T> T firstOf(T[] array) {
        // TODO(关卡2-1)：返回数组的第一个元素
        return array[0];
        //   提示：return array[0];
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob"};
        Integer[] nums = {10, 20, 30};

        System.out.println("第一个名字 = " + firstOf(names));
        System.out.println("第一个数字 = " + firstOf(nums));
    }
}

/*
 * ============================ 预期输出 ============================
 * 第一个名字 = Alice
 * 第一个数字 = 10
 * ===============================================================
 *
 * 排查提示：
 *  - 同一个 firstOf 方法，既能处理 String[] 又能处理 Integer[]，这就是泛型方法的威力。
 *  - 返回类型 T 会根据你传入的数组类型自动确定。
 */
