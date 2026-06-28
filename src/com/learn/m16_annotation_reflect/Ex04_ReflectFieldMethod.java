package com.learn.m16_annotation_reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * ============================================================
 * 模块：m16 注解与反射入门
 * 关卡：Ex04 反射读字段、调方法
 * ------------------------------------------------------------
 * 【知识点】
 *   反射能在运行时“动态地”读取字段、调用方法（即使不在编译期写死）：
 *       Field f = clazz.getField("name");   // 拿到字段
 *       Object v = f.get(对象);              // 读取该对象这个字段的值
 *       Method m = clazz.getMethod("greet"); // 拿到方法
 *       Object r = m.invoke(对象);           // 调用该对象的这个方法
 *   反射操作可能抛异常，所以 main 声明了 throws Exception。
 *
 * 【本关任务】
 *   用反射读取 person 的 name 字段值。
 *
 * 【如何闯关】
 *   把 nameValue 改成 nameField.get(p)，运行对照输出。
 * ============================================================
 */
public class Ex04_ReflectFieldMethod {

    static class Person {
        public String name = "小明";

        public String greet() {
            return "你好，我是 " + name;
        }
    }

    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Class<?> clazz = p.getClass();

        Field nameField = clazz.getField("name");
        // TODO(关卡4-1)：把 null 改成 nameField.get(p)
        Object nameValue = null;
        System.out.println("字段 name = " + nameValue);

        Method greetMethod = clazz.getMethod("greet");
        Object result = greetMethod.invoke(p); // 反射调用 p.greet()
        System.out.println("调用 greet() = " + result);
    }
}

/*
 * ============================ 预期输出 ============================
 * 字段 name = 小明
 * 调用 greet() = 你好，我是 小明
 * ===============================================================
 *
 * 排查提示：
 *  - 如果“字段 name =”后面是 null，说明还没用 nameField.get(p) 真正去读。
 *  - 反射调用 greet() 的效果，和直接写 p.greet() 是一样的，只是“动态”得多。
 */
