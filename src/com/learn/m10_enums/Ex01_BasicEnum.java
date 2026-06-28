package com.learn.m10_enums;

/*
 * ============================================================
 * 模块：m10 枚举
 * 关卡：Ex01 基本枚举
 * ------------------------------------------------------------
 * 【知识点】
 *   枚举用 enum 定义，把所有可能的取值一一列出：
 *       enum Weekday { MON, TUE, WED, THU, FRI, SAT, SUN }
 *   用法： Weekday d = Weekday.WED;
 *   枚举值用 == 比较即可（它们是唯一的常量）。
 *
 * 【本关任务】
 *   把 today 赋值为 Weekday.WED（周三）。
 *
 * 【如何闯关】
 *   把 null 改成 Weekday.WED，运行对照输出。
 * ============================================================
 */
public class Ex01_BasicEnum {

    public static void main(String[] args) {
        // TODO(关卡1-1)：把 null 改成 Weekday.WED
        Weekday today = Weekday.WED;

        System.out.println("今天是 " + today);
        System.out.println("是不是周三？ " + (today == Weekday.WED));
    }
}

// 枚举类型：写在主类下方（同文件、非 public）
enum Weekday {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

/*
 * ============================ 预期输出 ============================
 * 今天是 WED
 * 是不是周三？ true
 * ===============================================================
 *
 * 排查提示：
 *  - 如果输出 “今天是 null”，说明 today 还没赋值。
 *  - 打印枚举时，默认显示它的名字（这里是 WED）。
 */
