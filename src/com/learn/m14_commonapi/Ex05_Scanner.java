package com.learn.m14_commonapi;

import java.util.Scanner;

/*
 * ============================================================
 * 模块：m14 常用 API
 * 关卡：Ex05 控制台输入 Scanner
 * ------------------------------------------------------------
 * 【知识点】
 *   Scanner 从控制台读取用户输入：
 *       Scanner sc = new Scanner(System.in);
 *       String s = sc.nextLine();  读取一整行（字符串）
 *       int n = sc.nextInt();      读取一个整数
 *   用完记得 sc.close()。
 *
 * 【本关任务】
 *   读取用户输入的名字（一行）和年龄（整数），再打印问候语。
 *
 * 【如何闯关】
 *   补全两处读取语句，运行后“在控制台手动输入”，对照下面的示例。
 *   （在 IDEA 里：运行后点底部控制台，输入内容并回车。）
 * ============================================================
 */
public class Ex05_Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入你的名字：");
        // TODO(关卡5-1)：把空串改成 scanner.nextLine()
        String name = scanner.nextLine();

        System.out.print("请输入你的年龄：");
        // TODO(关卡5-2)：把 0 改成 scanner.nextInt()
        int age = scanner.nextInt();

        System.out.println("你好，" + name + "！你今年 " + age + " 岁。");
        scanner.close();
    }
}

/*
 * ============================ 预期输出（示例）============================
 * 这个练习需要你手动输入，输出取决于你输入的内容。
 * 假设你依次输入：  小明   （回车）   18   （回车）
 * 则完整的控制台显示为：
 *
 *   请输入你的名字：小明
 *   请输入你的年龄：18
 *   你好，小明！你今年 18 岁。
 * =====================================================================
 *
 * 排查提示：
 *  - 若未补全，名字会是空、年龄会是 0，问候语就不对。
 *  - nextInt 只读数字，别在该输年龄时输入文字，否则会抛 InputMismatchException。
 */
