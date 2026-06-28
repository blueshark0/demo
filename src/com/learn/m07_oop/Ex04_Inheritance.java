package com.learn.m07_oop;

/*
 * ============================================================
 * 模块：m07 面向对象
 * 关卡：Ex04 继承与 super
 * ------------------------------------------------------------
 * 【知识点】
 *   子类用 extends 继承父类，自动拥有父类的字段和方法，还能加自己的。
 *       class Dog extends Animal { ... }
 *   子类构造器里可以用 super(...) 调用父类的构造器，来初始化继承来的字段。
 *   super(...) 必须写在子类构造器的“第一行”。
 *   如果你不写 super(...)，Java 会自动调用父类的“无参构造器”。
 *
 * 【本关任务】
 *   1. 在 Dog 构造器里用 super(name) 调用父类带参构造器（否则名字会变成“未命名”）。
 *   2. 补全 Dog 自己的 bark() 方法。
 *
 * 【如何闯关】
 *   按 TODO 补全两处，运行对照输出。
 * ============================================================
 */
public class Ex04_Inheritance {

    public static void main(String[] args) {
        Dog dog = new Dog("旺财");
        dog.eat();  // eat 继承自父类 Animal
        dog.bark(); // bark 是 Dog 自己的方法
    }
}

class Animal {
    String name;

    Animal() {            // 无参构造器
        this.name = "未命名";
    }

    Animal(String name) { // 带参构造器
        this.name = name;
    }

    void eat() {
        System.out.println(name + " 正在吃东西");
    }
}

class Dog extends Animal {

    Dog(String name) {
        // TODO(关卡4-1)：在这一行用 super(name) 调用父类的带参构造器
        super(name);
        //   注意：super(...) 必须是构造器的第一行；
        //   如果这里什么都不写，Java 会自动调用父类无参构造器，name 会变成“未命名”。
    }

    void bark() {
        // TODO(关卡4-2)：打印  name + " 汪汪叫"
        System.out.println(name + " " + "汪汪叫");
        //   提示：System.out.println(name + " 汪汪叫");

    }
}

/*
 * ============================ 预期输出 ============================
 * 旺财 正在吃东西
 * 旺财 汪汪叫
 * ===============================================================
 *
 * 排查提示：
 *  - 如果第一行是“未命名 正在吃东西”，说明 super(name) 还没补，
 *    Java 调用了父类无参构造器，name 被设成了“未命名”。
 *  - 如果运行时抛异常，说明 bark() 还没补全。
 */
