package com.learn.m07_oop;

import java.util.Objects;

/*
 * ============================================================
 * 模块：m07 面向对象
 * 关卡：Ex06 重写 toString / equals / hashCode
 * ------------------------------------------------------------
 * 【知识点】
 *   所有类都默认继承自 Object，它有几个常被“重写”的方法：
 *       toString()  决定对象被打印时显示成什么样（默认是一串没用的地址）
 *       equals()    决定两个对象“内容是否相等”（默认只比较是不是同一对象）
 *       hashCode()  配合 equals 使用，相等的对象必须有相同的 hashCode
 *   重写时在方法上方写 @Override，让编译器帮你检查写对没。
 *
 * 【本关任务】
 *   1. 重写 toString()，返回形如 "Person{name=小明, age=18}" 的字符串。
 *   2. 重写 equals()，当对方也是 Person、且 name 与 age 都相同时返回 true，
 *      否则返回 false。
 *   （hashCode 已替你写好，不用改。）
 *   使程序打印：
 *       Person{name=小明, age=18}
 *       p1.equals(p2) ? true
 *       p1.equals(p3) ? false
 * ============================================================
 */
public class Ex06_ObjectMethods {

    public static void main(String[] args) {
        Person p1 = new Person("小明", 18);
        Person p2 = new Person("小明", 18);
        Person p3 = new Person("小红", 20);

        System.out.println(p1); // 打印对象会自动调用 toString()
        System.out.println("p1.equals(p2) ? " + p1.equals(p2));
        System.out.println("p1.equals(p3) ? " + p1.equals(p3));
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO(关卡6-1)：拼出并返回形如 "Person{name=小明, age=18}" 的字符串
        return "Person{name=" + name +"," + "age=" +age;
        
    }

    @Override
    public boolean equals(Object o) {
        // TODO(关卡6-2)：当 o 也是 Person，且 name、age 都相同时返回 true，否则返回 false

        
        //   （先判断 o 是不是 Person，再把它转成 Person 比较两个字段）
        throw new UnsupportedOperationException("请补全：name 与 age 都相同时返回 true");
    }

    @Override
    public int hashCode() {
        // 已写好：相等的对象要有相同的 hashCode，这里用 name、age 计算
        return Objects.hash(name, age);
    }
}

/*
 * ============================ 预期输出 ============================
 * Person{name=小明, age=18}
 * p1.equals(p2) ? true
 * p1.equals(p3) ? false
 * ===============================================================
 *
 * 排查提示：
 *  - 没重写 toString 时，打印对象会显示像 Person@1b6d3586 这样的地址。
 *  - p1 和 p2 内容相同所以 equals 为 true；p1 和 p3 不同所以为 false。
 */
