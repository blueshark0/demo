package com.learn.m11_generics;

/*
 * ============================================================
 * 模块：m11 泛型
 * 关卡：Ex01 泛型类
 * ------------------------------------------------------------
 * 【知识点】
 *   泛型类在类名后面写一个类型参数 <T>，T 代表“某种类型”，到使用时才确定
 *   它具体是谁：同一个类，既能装字符串，也能装整数。好处是取出来的就是确定
 *   类型，不用强制转换，也不会不小心放错类型——编译器会帮你把关。
 *
 * 【本关任务】
 *   下方 Box<T> 已给出类型参数声明，但 set/get 的方法体是空的，需要你补全：
 *   set 应把传入的值存进字段，get 应把存进去的值返回出来。
 *   然后在 main 里往字符串盒子放入 "你好"，往整数盒子放入 42，使程序打印：
 *       字符串盒子：你好
 *       整数盒子：42
 * ============================================================
 */
public class Ex01_GenericClass {

    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        // TODO(关卡1-1)：往字符串盒子 strBox 里放入字符串 "你好"
        strBox.set(new String("你好"));

        Box<Integer> intBox = new Box<>();
        // TODO(关卡1-2)：往整数盒子 intBox 里放入整数 42
        intBox.set(new Integer(42));

        System.out.println("字符串盒子：" + strBox.get());
        System.out.println("整数盒子：" + intBox.get());
    }
}

class Box<T> {          // T 是类型参数
    private T value;

    public void set(T value) {
        // TODO(关卡1-3)：把传入的 value 存进字段 this.value
        this.value = value;
    }

    public T get() {
        // TODO(关卡1-4)：把字段里存的值返回出去
        return this.value;
    }



}

/*
 * ============================ 预期输出 ============================
 * 字符串盒子：你好
 * 整数盒子：42
 * ===============================================================
 *
 * 排查提示：
 *  - 没存过值时 get 会返回 null。
 *  - 试试往字符串盒子里放一个整数，编译器会直接报错——这就是泛型的类型保护。
 */
