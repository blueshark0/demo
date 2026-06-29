package com.learn.m08_exceptions;

/*
 * ============================================================
 * 模块：m08 异常处理
 * 关卡：Ex03 throw 与 throws
 * ------------------------------------------------------------
 * 【知识点】
 *   throw（动词，“抛”）：在代码里主动抛出一个异常对象，让当前执行流立刻中断、
 *   把异常往外传递。throws（声明）：写在方法签名末尾，声明“本方法可能抛出某种
 *   异常”，提醒调用者要处理它。本关方法 checkAge 已声明 throws Exception。
 *
 * 【本关任务】
 *   补全 checkAge：当 age 小于 0 时，主动抛出一个 Exception，其消息文本为
 *   「年龄不能为负」；age 合法时打印「年龄合法：」加上该年龄。配合 main 里的
 *   三次调用（20、-5、99），程序应依次打印：
 *       年龄合法：20
 *       捕获：年龄不能为负
 *   （checkAge(-5) 抛异常后跳到 catch，所以 checkAge(99) 不会被执行。）
 * ============================================================
 */
public class Ex03_ThrowThrows {

    static void checkAge(int age) throws Exception {
        // TODO(关卡3-1)：当 age 小于 0 时，抛出一个消息为「年龄不能为负」的 Exception
        if (age < 0) {
            throw new UnsupportedOperationException("请补全：当 age < 0 时抛出消息为「年龄不能为负」的 Exception");
        }
        System.out.println("年龄合法：" + age);
    }

    public static void main(String[] args) {
        try {
            checkAge(20);   // 合法
            checkAge(-5);   // 这次会抛异常
            checkAge(99);   // 抛异常后这行不会执行
        } catch (Exception e) {
            System.out.println("捕获：" + e.getMessage());
        }
    }
}

/*
 * ============================ 预期输出 ============================
 * 年龄合法：20
 * 捕获：年龄不能为负
 * ===============================================================
 *
 * 排查提示：
 *  - checkAge(-5) 抛异常后，程序跳到 catch，所以 checkAge(99) 不会执行。
 *  - 因为抛的是受检异常 Exception，方法上必须写 throws Exception（已写好）。
 */
