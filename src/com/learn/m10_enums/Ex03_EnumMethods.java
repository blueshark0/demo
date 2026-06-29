package com.learn.m10_enums;

/*
 * ============================================================
 * 模块：m10 枚举
 * 关卡：Ex03 枚举的方法（每个常量各自实现）
 * ------------------------------------------------------------
 * 【知识点】
 *   枚举里可以声明一个“抽象方法”，强制每个常量都给出自己的实现。这样
 *   不同的常量就拥有了各自不同的行为：调用同名方法，结果却因常量而异。
 *   实现的写法是在每个常量名后面跟一对花括号，在里面重写那个抽象方法。
 *   这让枚举既是一组取值，又能像“一族小策略”那样各自工作。
 *
 * 【本关任务】
 *   下方枚举 Operation 声明了抽象方法 apply(int, int)，并要求每个常量
 *   各自实现它：PLUS 表示加法、TIMES 表示乘法。请补全这两个常量的实现，
 *   并把变量 op 赋值为 PLUS，使程序打印：
 *       3 PLUS 4 = 7
 *       3 TIMES 4 = 12
 * ============================================================
 */
public class Ex03_EnumMethods {

    public static void main(String[] args) {
        // TODO(关卡3-1)：把 op 赋值为表示“加法”的枚举常量，使下面打印「3 PLUS 4 = 7」
        Operation op = null;

        System.out.println("3 PLUS 4 = " + op.apply(3, 4));
        System.out.println("3 TIMES 4 = " + Operation.TIMES.apply(3, 4));
    }
}

enum Operation {
    PLUS {
        public int apply(int a, int b) {
            // TODO(关卡3-2)：实现“加法”，返回 a 与 b 相加的结果
            throw new UnsupportedOperationException("请补全：PLUS 的 apply 应返回 a 加 b");
        }
    },
    TIMES {
        public int apply(int a, int b) {
            // TODO(关卡3-3)：实现“乘法”，返回 a 与 b 相乘的结果
            throw new UnsupportedOperationException("请补全：TIMES 的 apply 应返回 a 乘 b");
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
