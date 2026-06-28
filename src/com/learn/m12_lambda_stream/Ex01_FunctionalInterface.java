package com.learn.m12_lambda_stream;

/*
 * ============================================================
 * 模块：m12 Lambda 与 Stream
 * 关卡：Ex01 函数式接口
 * ------------------------------------------------------------
 * 【知识点】
 *   “函数式接口”是只有一个抽象方法的接口。实现它有两种写法：
 *   老写法用匿名内部类，新写法用 Lambda（更简洁，二者等价）：
 *       匿名类： new Greeter() { public String greet(String n){ return ...; } }
 *       Lambda： n -> ...           // 参数 -> 返回值
 *
 * 【本关任务】
 *   用 Lambda 实现 Greeter，让它返回 "你好，" + name。
 *
 * 【如何闯关】
 *   把 g2 的 Lambda 体 null 改成 "你好，" + name，运行对照输出。
 * ============================================================
 */
public class Ex01_FunctionalInterface {

    // 函数式接口：只有一个抽象方法
    interface Greeter {
        String greet(String name);
    }

    public static void main(String[] args) {
        // 老写法：匿名内部类
        Greeter g1 = new Greeter() {
            @Override
            public String greet(String name) {
                return "你好，" + name;
            }
        };

        // 新写法：Lambda（等价于上面，但简洁很多）
        // TODO(关卡1-1)：把 null 改成 "你好，" + name
        Greeter g2 = name -> "你好，" + name;

        System.out.println(g1.greet("匿名类"));
        System.out.println(g2.greet("Lambda"));
    }
}

/*
 * ============================ 预期输出 ============================
 * 你好，匿名类
 * 你好，Lambda
 * ===============================================================
 *
 * 排查提示：
 *  - 如果第二行是 “null”，说明 g2 的 Lambda 体还没补。
 *  - 对比 g1 和 g2 的写法，能体会到 Lambda 省掉了多少样板代码。
 */
