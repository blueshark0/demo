package com.learn.m02_operators;

/*
 * ============================================================
 * 模块：m02 运算符
 * 关卡：Ex03 逻辑运算符
 * ------------------------------------------------------------
 * 【知识点】
 *   逻辑运算符用来组合多个布尔条件：
 *       &&（与）：两个都为 true，结果才 true
 *       ||（或）：只要有一个为 true，结果就 true
 *       !（非） ：取反，true 变 false，false 变 true
 *   “短路”：&& 左边为 false 就不再看右边；|| 左边为 true 就不再看右边。
 *
 * 【本关任务】
 *   用 sunny、weekend 两个条件写出 3 个逻辑表达式。
 *
 * 【如何闯关】
 *   把占位 false 改成 TODO 要求的逻辑表达式，运行对照输出。
 * ============================================================
 */
public class Ex03_Logical {

    public static void main(String[] args) {
        boolean sunny = true;    // 今天是晴天
        boolean weekend = false; // 今天不是周末

        // TODO(关卡3-1)：把 false 改成 sunny && weekend（晴天“且”周末）
        boolean goOut = false;
        // TODO(关卡3-2)：把 false 改成 sunny || weekend（晴天“或”周末）
        boolean either = false;
        // TODO(关卡3-3)：把 false 改成 !sunny（“不是”晴天）
        boolean notSunny = false;

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
 *  - && 要两个条件都成立；这里 weekend 是 false，所以 goOut 为 false。
 *  - || 只要一个成立即可；sunny 为 true，所以 either 为 true。
 */
