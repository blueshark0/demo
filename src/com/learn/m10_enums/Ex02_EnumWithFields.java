package com.learn.m10_enums;

/*
 * ============================================================
 * 模块：m10 枚举
 * 关卡：Ex02 带字段的枚举
 * ------------------------------------------------------------
 * 【知识点】
 *   枚举常量可以携带“数据”。给枚举加字段和构造器，每个常量在定义时
 *   传入自己的值：
 *       enum Planet {
 *           EARTH(9.8), JUPITER(24.8);   // 括号里是传给构造器的参数
 *           private final double gravity;
 *           Planet(double gravity) { this.gravity = gravity; }
 *           public double getGravity() { return gravity; }
 *       }
 *
 * 【本关任务】
 *   把 p 赋值为 Planet.EARTH，并打印它的重力。
 *
 * 【如何闯关】
 *   把 null 改成 Planet.EARTH，运行对照输出。
 * ============================================================
 */
public class Ex02_EnumWithFields {

    public static void main(String[] args) {
        // TODO(关卡2-1)：把 null 改成 Planet.EARTH
        Planet p = null;

        System.out.println(p + " 的重力是 " + p.getGravity());
    }
}

enum Planet {
    MERCURY(3.7),
    EARTH(9.8),
    JUPITER(24.8);

    private final double gravity; // 每个行星各自的重力

    Planet(double gravity) {      // 枚举的构造器（自动是私有的）
        this.gravity = gravity;
    }

    public double getGravity() {
        return gravity;
    }
}

/*
 * ============================ 预期输出 ============================
 * EARTH 的重力是 9.8
 * ===============================================================
 *
 * 排查提示：
 *  - 如果未赋值（p 还是 null），调用 p.getGravity() 会抛空指针异常并崩溃。
 *  - 每个枚举常量后面括号里的数，就是传给构造器的参数。
 */
