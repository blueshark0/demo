package com.learn.m14_commonapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * ============================================================
 * 模块：m14 常用 API
 * 关卡：Ex03 日期时间 java.time
 * ------------------------------------------------------------
 * 【知识点】
 *   LocalDate 表示“一个日期”（年-月-日），是现代 Java 推荐的日期类型：
 *       LocalDate.of(2024, 1, 15)   指定年月日
 *       date.plusDays(20)           得到 20 天后的日期（原日期不变）
 *       date.getMonthValue()        取月份
 *   用 DateTimeFormatter 把日期格式化成你想要的样子。
 *   （这里用“固定日期”而不是 LocalDate.now()，是为了让输出可预期。）
 *
 * 【本关任务】
 *   用 plusDays(20) 算出 20 天后的日期。
 *
 * 【如何闯关】
 *   把 later 的 date 改成 date.plusDays(20)，运行对照输出。
 * ============================================================
 */
public class Ex03_JavaTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 15);

        // TODO(关卡3-1)：把 date 改成 date.plusDays(20)
        LocalDate later = date.plusDays(20);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println("原日期 = " + date.format(fmt));
        System.out.println("20天后 = " + later.format(fmt));
        System.out.println("原日期是几月 = " + date.getMonthValue());
    }
}

/*
 * ============================ 预期输出 ============================
 * 原日期 = 2024/01/15
 * 20天后 = 2024/02/04
 * 原日期是几月 = 1
 * ===============================================================
 *
 * 排查提示：
 *  - 1 月 15 日加 20 天，跨过 1 月底（31 天），到了 2 月 4 日。
 *  - plusDays 不会改变原来的 date，而是返回一个新日期。
 */
