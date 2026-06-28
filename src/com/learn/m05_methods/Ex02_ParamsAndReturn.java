package com.learn.m05_methods;

/*
 * ============================================================
 * 模块：m05 方法
 * 关卡：Ex02 参数与返回值
 * ------------------------------------------------------------
 * 【知识点】
 *   方法可以接收“参数”（输入），并通过 return “返回”一个结果（输出）：
 *       static int add(int a, int b) {
 *           return a + b;   // 把 a+b 的结果返回给调用者
 *       }
 *   返回值类型写在方法名前面（这里是 int）。调用 add(3, 4) 会得到 7。
 *
 * 【本关任务】
 *   实现 add(a, b)，返回两个整数的和。
 *
 * 【如何闯关】
 *   把 add 里那行 throw 替换成 return a + b;，运行对照输出。
 * ============================================================
 */
public class Ex02_ParamsAndReturn {

    static int add(int a, int b) {
        // TODO(关卡2-1)：返回 a + b 的结果
        //   提示：return a + b;
        throw new UnsupportedOperationException("请补全 add() 方法体");
    }

    public static void main(String[] args) {
        int result = add(3, 4);
        System.out.println("3 + 4 = " + result);
    }
}

/*
 * ============================ 预期输出 ============================
 * 3 + 4 = 7
 * ===============================================================
 *
 * 排查提示：
 *  - 别忘了 return，方法有返回值时必须把结果 return 出去。
 *  - 试着再调用一次 add(100, 200)，看看能不能得到 300。
 */
