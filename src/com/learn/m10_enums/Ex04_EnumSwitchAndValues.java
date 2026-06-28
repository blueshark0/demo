package com.learn.m10_enums;

/*
 * ============================================================
 * 模块：m10 枚举
 * 关卡：Ex04 switch 与 values / valueOf / ordinal
 * ------------------------------------------------------------
 * 【知识点】
 *   values()  返回包含所有枚举常量的数组，可用来遍历。
 *   ordinal() 返回常量的序号（从 0 开始，按定义顺序）。
 *   valueOf("名字") 根据字符串名字得到对应的枚举常量。
 *   switch 可以直接对枚举做分支，case 后只写常量名（不加类型前缀）。
 *
 * 【本关任务】
 *   用 Season.valueOf("SUMMER") 得到 summer，再用 switch 查它适合的活动。
 *
 * 【如何闯关】
 *   把 null 改成 Season.valueOf("SUMMER")，运行对照输出。
 * ============================================================
 */
public class Ex04_EnumSwitchAndValues {

    public static void main(String[] args) {
        System.out.println("所有季节：");
        for (Season s : Season.values()) {
            System.out.println("  " + s.ordinal() + " -> " + s);
        }

        // TODO(关卡4-1)：把 null 改成 Season.valueOf("SUMMER")
        Season summer = null;

        String activity = switch (summer) {
            case SPRING -> "踏青";
            case SUMMER -> "游泳";
            case AUTUMN -> "赏枫";
            case WINTER -> "滑雪";
        };
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
