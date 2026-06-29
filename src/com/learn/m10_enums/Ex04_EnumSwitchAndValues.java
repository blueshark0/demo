package com.learn.m10_enums;

/*
 * ============================================================
 * 模块：m10 枚举
 * 关卡：Ex04 switch 与 values / valueOf / ordinal
 * ------------------------------------------------------------
 * 【知识点】
 *   枚举自带几个好用的能力：一个方法能返回包含全部常量的数组，常用来
 *   遍历；每个常量还有一个“序号”，从 0 开始、按定义顺序编号；另有一个
 *   方法能根据字符串名字找到对应的常量。此外，switch 可以直接对枚举做
 *   分支判断，case 后面只写常量名本身，不需要加类型前缀。
 *
 * 【本关任务】
 *   下方已写好枚举 Season（SPRING/SUMMER/AUTUMN/WINTER）和遍历打印序号的
 *   代码。请：
 *   1. 用“按名字查找常量”的方式，把名字 "SUMMER" 转成对应常量赋给 summer。
 *   2. 用 switch 根据 summer 选出活动并赋给 activity：
 *      SPRING→"踏青"、SUMMER→"游泳"、AUTUMN→"赏枫"、WINTER→"滑雪"。
 *   使程序打印（含上方遍历部分）：
 *       所有季节：
 *         0 -> SPRING
 *         1 -> SUMMER
 *         2 -> AUTUMN
 *         3 -> WINTER
 *       夏天适合：游泳
 * ============================================================
 */
public class Ex04_EnumSwitchAndValues {

    public static void main(String[] args) {
        System.out.println("所有季节：");
        for (Season s : Season.values()) {
            System.out.println("  " + s.ordinal() + " -> " + s);
        }

        // TODO(关卡4-1)：用“按名字查找常量”的方式，把名字 "SUMMER" 转成对应常量赋给 summer
        Season summer = null;

        // TODO(关卡4-2)：用 switch 根据 summer 选出活动赋给 activity
        //               SPRING→"踏青"、SUMMER→"游泳"、AUTUMN→"赏枫"、WINTER→"滑雪"
        String activity = null;

        System.out.println("夏天适合：" + activity);
    }
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

/*
 * ============================ 预期输出 ============================
 * 所有季节：
 *   0 -> SPRING
 *   1 -> SUMMER
 *   2 -> AUTUMN
 *   3 -> WINTER
 * 夏天适合：游泳
 * ===============================================================
 *
 * 排查提示：
 *  - ordinal 从 0 开始，按枚举定义的先后顺序编号。
 *  - 若 summer 还是 null，switch(null) 会抛空指针异常。
 */
