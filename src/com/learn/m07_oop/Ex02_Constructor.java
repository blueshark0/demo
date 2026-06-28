package com.learn.m07_oop;

/*
 * ============================================================
 * 模块：m07 面向对象
 * 关卡：Ex02 构造器
 * ------------------------------------------------------------
 * 【知识点】
 *   构造器是创建对象时自动调用的特殊方法，名字必须和类名相同、没有返回类型。
 *   它的作用是“在对象诞生时就把字段初始化好”：
 *       Book(String t, double p) {   // 构造器
 *           title = t;
 *           price = p;
 *       }
 *       Book b = new Book("Java入门", 59.9);  // new 时会调用构造器
 *
 * 【本关任务】
 *   补全 Book 的构造器，把传入的 t、p 保存到字段 title、price。
 *
 * 【如何闯关】
 *   把构造器里那行 throw 替换成两行赋值，运行对照输出。
 * ============================================================
 */
public class Ex02_Constructor {

    public static void main(String[] args) {
        Book b = new Book("Java入门", 59.9);
        b.show();
    }
}

class Book {
    String title;
    double price;

    // 构造器：名字和类名相同，没有返回类型
    Book(String t, double p) {
        // TODO(关卡2-1)：把参数 t、p 分别赋给字段 title、price
        //   提示：title = t;  price = p;  然后删掉下面这行 throw
        throw new UnsupportedOperationException("请补全 Book 构造器");
    }

    void show() {
        System.out.println("《" + title + "》价格：" + price + " 元");
    }
}

/*
 * ============================ 预期输出 ============================
 * 《Java入门》价格：59.9 元
 * ===============================================================
 *
 * 排查提示：
 *  - 运行时若抛 UnsupportedOperationException，说明构造器还没补全。
 *  - 构造器不写返回类型（连 void 都不写），名字必须叫 Book。
 */
