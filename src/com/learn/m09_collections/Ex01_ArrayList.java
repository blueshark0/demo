package com.learn.m09_collections;

import java.util.ArrayList;
import java.util.List;

/*
 * ============================================================
 * 模块：m09 集合
 * 关卡：Ex01 ArrayList 列表
 * ------------------------------------------------------------
 * 【知识点】
 *   List 是“有序、可重复”的集合，ArrayList 是最常用的实现：
 *       List<String> list = new ArrayList<>();
 *       list.add("x");          添加元素
 *       list.get(0);            按下标取元素
 *       list.size();            元素个数
 *       list.contains("x");     是否包含
 *       list.remove("x");       删除元素
 *
 * 【本关任务】
 *   1. 依次往 fruits 添加 "苹果"、"香蕉"、"橘子"。
 *   2. 删除 "香蕉"。
 *
 * 【如何闯关】
 *   按 TODO 补全 add 和 remove 调用，运行对照输出。
 * ============================================================
 */
public class Ex01_ArrayList {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // TODO(关卡1-1)：依次添加 "苹果"、"香蕉"、"橘子"
        //   提示：fruits.add("苹果"); ……

        System.out.println("元素个数 = " + fruits.size());
        System.out.println("第一个 = " + (fruits.isEmpty() ? "无" : fruits.get(0)));
        System.out.println("包含香蕉？ " + fruits.contains("香蕉"));

        // TODO(关卡1-2)：删除 "香蕉"
        //   提示：fruits.remove("香蕉");

        System.out.println("删除香蕉后个数 = " + fruits.size());
    }
}

/*
 * ============================ 预期输出 ============================
 * 元素个数 = 3
 * 第一个 = 苹果
 * 包含香蕉？ true
 * 删除香蕉后个数 = 2
 * ===============================================================
 *
 * 排查提示：
 *  - 如果个数是 0，说明 add 还没补；List 会记住添加的顺序。
 */
