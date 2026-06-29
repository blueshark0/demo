package com.learn.m08_exceptions;

/*
 * ============================================================
 * 模块：m08 异常处理
 * 关卡：Ex05 try-with-resources 自动关闭资源
 * ------------------------------------------------------------
 * 【知识点】
 *   文件、网络连接等“资源”用完必须关闭，否则会泄漏；手动关闭容易忘。
 *   try-with-resources 把资源声明在 try 后面的括号里，当 try 块结束时（哪怕
 *   中途发生异常）会“自动”调用该资源的 close() 方法来收尾。能这样用的前提是：
 *   资源类实现了 AutoCloseable 接口，也就是提供了一个 close() 方法。
 *
 * 【本关任务】
 *   下方 MyResource 实现了 AutoCloseable。补全它的 close() 方法，让它打印
 *   「资源已自动关闭」。配合已写好的构造器与 use() 方法，程序应依次打印：
 *       资源已打开
 *       正在使用资源
 *       资源已自动关闭
 *       main 结束
 *   （注意 close 的触发时机：在“正在使用资源”之后、“main 结束”之前自动发生。）
 * ============================================================
 */
public class Ex05_TryWithResources {

    public static void main(String[] args) {
        try (MyResource res = new MyResource()) {
            res.use();
        } // 离开 try 块时，res.close() 会被自动调用

        System.out.println("main 结束");
    }
}

class MyResource implements AutoCloseable {

    MyResource() {
        System.out.println("资源已打开");
    }

    void use() {
        System.out.println("正在使用资源");
    }

    @Override
    public void close() {
        // TODO(关卡5-1)：打印「资源已自动关闭」
    }
}

/*
 * ============================ 预期输出 ============================
 * 资源已打开
 * 正在使用资源
 * 资源已自动关闭
 * main 结束
 * ===============================================================
 *
 * 排查提示：
 *  - 注意顺序：close 在 “正在使用资源” 之后、“main 结束” 之前自动触发。
 *  - 这说明资源在离开 try 块的瞬间就被关闭了，完全不用你手动调用。
 */
