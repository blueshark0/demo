package com.learn.m02_operators;

/*
 * ============================================================
 * 模块：m02 运算符
 * 关卡：Ex03 逻辑运算符
 * ------------------------------------------------------------
 * 【知识点】
 *   逻辑运算符用来组合多个布尔条件：
 *       与：两个条件都为 true，结果才 true
 *       或：只要有一个条件为 true，结果就 true
 *       非：取反，true 变 false，false 变 true
 *   “短路”：与运算左边为 false 就不再看右边；或运算左边为 true 就不再看右边。
 *
 * 【本关任务】
 *   下方已给定 sunny = true（晴天）、weekend = false（不是周末），必须用这两个值。
 *   请写出 3 个逻辑表达式，分别赋给 goOut、either、notSunny：
 *     - goOut：晴天“且”周末（两个条件都成立才为真）
 *     - either：晴天“或”周末（至少满足一个就为真）
 *     - notSunny：“不是”晴天（对 sunny 取反）
 *   使程序打印出：
 *       晴天且周末，出去玩？ false
 *       晴天或周末，至少满足一个？ true
 *       不是晴天？ false
 * ============================================================
 */
public class Ex03_Logical {

    public static void main(String[] args) {
        boolean sunny = true;    // 今天是晴天
        boolean weekend = false; // 今天不是周末

        // TODO(关卡3-1)：表达“晴天且周末”，结果赋给 goOut
        boolean goOut = sunny && weekend;
        // TODO(关卡3-2)：表达“晴天或周末”，结果赋给 either
        boolean either = sunny || weekend;
        // TODO(关卡3-3)：表达“不是晴天”，结果赋给 notSunny
        boolean notSunny = !sunny;

        System.out.println("晴天且周末，出去玩？ " + goOut);
        System.out.println("晴天或周末，至少满足一个？ " + either);
        System.out.println("不是晴天？ " + notSunny);
    }
}

/*
 * ============================ 预期输出 ============================
 * 晴天且周末，出去玩？ false
 * 晴天或周末，至少满足一个？ true
 * 不是晴天？ false
 * ===============================================================
 *
 * 排查提示：
 *  - “与”要两个条件都成立；这里 weekend 是 false，所以 goOut 为 false。
 *  - “或”只要一个成立即可；sunny 为 true，所以 either 为 true。
 */
