package com.learn.m10_enums;

/*
 * ============================================================
 * 模块：m10 枚举
 * 关卡：Ex03 枚举的方法（每个常量各自实现）
 * ------------------------------------------------------------
 * 【知识点】
 *   枚举可以声明一个“抽象方法”，然后每个常量给出自己的实现。这样不同
 *   常量就有了不同的行为：
 *       enum Operation {
 *           PLUS  { public int apply(int a, int b) { return a + b; } },
 *           TIMES { public int apply(int a, int b) { return a * b; } };
 *           public abstract int apply(int a, int b);
 *       }
 *   于是 Operation.PLUS.apply(3, 4) = 7，Operation.TIMES.apply(3, 4) = 12。
 *
 * 【本关任务】
 *   把 op 赋值为 Operation.PLUS，再用它做一次运算。
 *
 * 【如何闯关】
 *   把 null 改成 Operation.PLUS，运行对照输出。
 * ============================================================
 */
public class Ex03_EnumMethods {

    public static void main(String[] args) {
        // TODO(关卡3-1)：把 null 改成 Operation.PLUS
        Operation op = null;

        System.out.println("3 PLUS 4 = " + op.apply(3, 4));
        System.out.println("3 TIMES 4 = " + Operation.TIMES.apply(3, 4));
    }
}

enum Operation {
    PLUS {
        public int apply(int a, int b) {
            return a + b;
        }
    },
    TIMES {
        public int apply(int a, int b) {
            return a * b;
        }
    };

    // 抽象方法：每个常量都必须实现它
    public abstract int apply(int a, int b);
}

/*
 * ============================ 预期输出 ============================
 * 3 PLUS 4 = 7
 * 3 TIMES 4 = 12
 * ===============================================================
 *
 * 排查提示：
 *  - PLUS 实现的是加法，TIMES 实现的是乘法，行为各不相同。
 *  - 若 op 还是 null，调用 op.apply(...) 会抛空指针异常。
 */
