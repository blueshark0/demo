package com.learn.m14_commonapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * ============================================================
 * 模块：m14 常用 API
 * 关卡：Ex03 日期时间 java.time
 * ------------------------------------------------------------
 * 【知识点】
 *   LocalDate 表示“一个日期”（年-月-日），是现代 Java 推荐的日期类型。
 *   它能指定具体的年月日来创建一个日期，能在某个日期的基础上往后推算
 *   若干天得到一个新日期（注意：这类运算不会改变原日期，而是返回一个
 *   新的日期对象），也能单独取出日期里的某个部分（比如月份）。要把
 *   日期显示成自定义的样子，可以借助 DateTimeFormatter。
 *   （本练习用“固定日期”而不是当前时间，是为了让输出可预期。）
 *
 * 【本关任务】
 *   下方已给定固定日期 2024 年 1 月 15 日（请勿改动）。在它的基础上
 *   往后推 20 天，得到 20 天后的日期，交给下方打印，使输出为：
 *       原日期 = 2024/01/15
 *       20天后 = 2024/02/04
 *       原日期是几月 = 1
 * ============================================================
 */
public class Ex03_JavaTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 15);

        // TODO(关卡3-1)：在 date 的基础上往后推 20 天，结果赋给 later（应为 2024/02/04）
        LocalDate later = date.plusDays(20);;


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
 *  - 往后推日期的运算不会改变原来的 date，而是返回一个新日期。
 */
