package com.learn.m16_annotation_reflect;

/*
 * ============================================================
 * 模块：m16 注解与反射入门
 * 关卡：Ex03 获取 Class 对象
 * ------------------------------------------------------------
 * 【知识点】
 *   每个类在运行时都有一个对应的 Class 对象，描述这个类的信息。获取方式：
 *       1) 类名.class            如 String.class
 *       2) 对象.getClass()       如 "hi".getClass()
 *       3) Class.forName("全限定名")
 *   常用方法：getName() 全限定名（含包），getSimpleName() 简单名（不含包）。
 *
 * 【本关任务】
 *   用 c2.getSimpleName() 取得字符串对象的简单类名。
 *
 * 【如何闯关】
 *   把 simple 的空串改成 c2.getSimpleName()，运行对照输出。
 * ============================================================
 */
public class Ex03_ClassObject {

    public static void main(String[] args) {
        // 方式 1：类名.class
        Class<String> c1 = String.class;

        // 方式 2：对象.getClass()
        String s = "hello";
        Class<? extends String> c2 = s.getClass();

        System.out.println("c1 全名 = " + c1.getName());
        System.out.println("c1 简单名 = " + c1.getSimpleName());

        // TODO(关卡3-1)：把空串改成 c2.getSimpleName()
        String simple = c2.getSimpleName();
        System.out.println("c2 简单名 = " + simple);
    }
}

/*
 * ============================ 预期输出 ============================
 * c1 全名 = java.lang.String
 * c1 简单名 = String
 * c2 简单名 = String
 * ===============================================================
 *
 * 排查提示：
 *  - getName 带包名（java.lang.String），getSimpleName 只有类名（String）。
 *  - c1 和 c2 指向的是同一个 Class 对象（都是 String 的），所以简单名相同。
 */
