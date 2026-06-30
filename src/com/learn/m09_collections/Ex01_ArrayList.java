package com.learn.m09_collections;

import java.util.ArrayList;
import java.util.List;

/*
 * ============================================================
 * 模块：m09 集合
 * 关卡：Ex01 ArrayList 列表
 * ------------------------------------------------------------
 * 【知识点】
 *   List 是“有序、可重复”的集合：它会记住元素被添加的先后顺序，
 *   同一个值也允许出现多次。ArrayList 是 List 最常用的实现。
 *   List 支持的常见操作：往末尾添加元素、按下标取出某个元素、
 *   查询元素个数、判断是否包含某个元素、删除某个元素。
 *
 * 【本关任务】
 *   下方已为你创建好空列表 fruits。请：
 *   1. 依次往 fruits 添加 "苹果"、"香蕉"、"橘子"（顺序不能变）。
 *   2. 删除 "香蕉"。
 *   补全后程序应打印：
 *       元素个数 = 3
 *       第一个 = 苹果
 *       包含香蕉？ true
 *       删除香蕉后个数 = 2
 * ============================================================
 */
public class Ex01_ArrayList {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // TODO(关卡1-1)：依次往 fruits 添加 "苹果"、"香蕉"、"橘子"（保持这个顺序）
        fruits.add("苹果");
        fruits.add("香蕉");
        fruits.add("橘子");


        System.out.println("元素个数 = " + fruits.size());
        System.out.println("第一个 = " + (fruits.isEmpty() ? "无" : fruits.get(0)));
        System.out.println("包含香蕉？ " + fruits.contains("香蕉"));

        // TODO(关卡1-2)：从 fruits 中删除 "香蕉"
        fruits.remove("香蕉");


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
 *  - 如果个数是 0，说明还没把元素添加进列表；List 会记住添加的顺序。
 */
