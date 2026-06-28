package com.learn.m11_generics;

/*
 * ============================================================
 * 模块：m11 泛型
 * 关卡：Ex01 泛型类
 * ------------------------------------------------------------
 * 【知识点】
 *   泛型类在类名后面写一个类型参数 <T>，T 代表“某种类型”，使用时再确定：
 *       class Box<T> { private T value; ... }
 *       Box<String>  strBox = new Box<>();   // T 是 String
 *       Box<Integer> intBox = new Box<>();   // T 是 Integer
 *   好处：取出来的就是确定类型，不用强制转换，也不会放错类型。
 *
 * 【本关任务】
 *   往字符串盒子放 "你好"，往整数盒子放 42。
 *
 * 【如何闯关】
 *   按 TODO 补全两次 set 调用，运行对照输出。
 * ============================================================
 */
public class Ex01_GenericClass {

    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        // TODO(关卡1-1)：用 set 放入字符串 "你好"
        strBox.set("你好");
        //   提示：strBox.set("你好");

        Box<Integer> intBox = new Box<>();
        // TODO(关卡1-2)：用 set 放入整数 42
        intBox.set(42);
        //   提示：intBox.set(42);

        System.out.println("字符串盒子：" + strBox.get());
        System.out.println("整数盒子：" + intBox.get());
    }
}

class Box<T> {          // T 是类型参数
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

/*
 * ============================ 预期输出 ============================
 * 字符串盒子：你好
 * 整数盒子：42
 * ===============================================================
 *
 * 排查提示：
 *  - 没 set 过时 get 返回 null。
 *  - 试试给 strBox.set(123)，编译器会直接报错——这就是泛型的类型保护。
 */
