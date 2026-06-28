package com.learn.m08_exceptions;

/*
 * ============================================================
 * 模块：m08 异常处理
 * 关卡：Ex05 try-with-resources 自动关闭资源
 * ------------------------------------------------------------
 * 【知识点】
 *   文件、网络连接等“资源”用完必须关闭，否则会泄漏。手动 close 容易忘。
 *   try-with-resources 把资源写在 try 后面的括号里，块结束时会“自动”调用
 *   它的 close() 方法（哪怕中途发生异常也会关）：
 *       try (MyResource res = new MyResource()) {
 *           res.use();
 *       } // 这里自动调用 res.close()
 *   能这样用的前提：资源类实现了 AutoCloseable 接口（即有 close 方法）。
 *
 * 【本关任务】
 *   补全 MyResource 的 close() 方法，让它打印“资源已自动关闭”。
 *
 * 【如何闯关】
 *   把 close() 里的 throw 替换成打印语句，运行，注意 close 的调用时机。
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
        // TODO(关卡5-1)：打印 “资源已自动关闭”
        System.out.println("资源已自动关闭");
        //   提示：System.out.println("资源已自动关闭");

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
