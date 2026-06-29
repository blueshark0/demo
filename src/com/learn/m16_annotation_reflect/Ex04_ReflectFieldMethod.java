package com.learn.m16_annotation_reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * ============================================================
 * 模块：m16 注解与反射入门
 * 关卡：Ex04 反射读字段、调方法
 * ------------------------------------------------------------
 * 【知识点】
 *   反射能在运行时“动态地”读取对象的字段、调用对象的方法，而不必在
 *   编译期就把字段名、方法名写死：先从 Class 对象拿到对应的“字段”或
 *   “方法”，再把它作用到某个具体对象上，就能取到字段值 / 触发方法调用。
 *   反射相关操作可能抛出受检异常，所以 main 声明了 throws Exception。
 *
 * 【本关任务】
 *   下方 Person 有一个 public 字段 name（值为「小明」）和方法 greet()。
 *   已经帮你拿到了对象 p 和它的 Class 对象 clazz。请：
 *   1. 用反射读取 p 的 name 字段值，打印「字段 name = 小明」。
 *   2. 用反射调用 p 的 greet() 方法，打印「调用 greet() = 你好，我是 小明」。
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

        // TODO(关卡4-1)：用反射读取 p 的 name 字段值，打印「字段 name = 小明」

        // TODO(关卡4-2)：用反射调用 p 的 greet() 方法，打印「调用 greet() = 你好，我是 小明」
    }
}

/*
 * ============================ 预期输出 ============================
 * 字段 name = 小明
 * 调用 greet() = 你好，我是 小明
 * ===============================================================
 *
 * 排查提示：
 *  - 如果“字段 name =”后面是 null 或为空，说明还没真正用反射读出字段值。
 *  - 反射调用 greet() 的效果，和直接写 p.greet() 是一样的，只是“动态”得多。
 */
