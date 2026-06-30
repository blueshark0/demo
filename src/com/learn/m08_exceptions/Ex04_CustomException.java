package com.learn.m08_exceptions;

/*
 * ============================================================
 * 模块：m08 异常处理
 * 关卡：Ex04 自定义异常
 * ------------------------------------------------------------
 * 【知识点】
 *   除了用 Java 自带的异常，你也可以定义“自己的异常类型”，让错误信息更贴切、
 *   语义更清晰。做法是写一个类继承 Exception（成为受检异常）或继承
 *   RuntimeException（成为非受检异常），并提供一个能接收消息文本的构造器。
 *   定义好之后，它就能像内置异常一样被 throw 和被 catch。
 *
 * 【本关任务】
 *   下方已定义好自定义异常 InvalidNameException（继承 Exception）。补全
 *   register：当用户名长度小于 3 时，抛出一个 InvalidNameException，其消息
 *   文本为「用户名至少 3 个字符」；合法时打印「注册成功：」加上用户名。
 *   main 传入的是 "ab"（长度 2），因此程序应打印：
 *       注册失败：用户名至少 3 个字符
 * ============================================================
 */
public class Ex04_CustomException {

    public static void main(String[] args) {
        try {
            register("ab"); // 名字太短，应触发自定义异常
        } catch (InvalidNameException e) {
            System.out.println("注册失败：" + e.getMessage());
        }
    }

    static void register(String name) throws InvalidNameException {
        if (name.length() < 3) {
            // TODO(关卡4-1)：抛出一个 InvalidNameException，消息文本为「用户名至少 3 个字符」
            throw new InvalidNameException("用户名至少 3 个字符");
        }
        System.out.println("注册成功：" + name);
    }
}

// 自定义异常：继承 Exception 即可（这是受检异常）
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message); // 把错误信息交给父类保存
    }
}

/*
 * ============================ 预期输出 ============================
 * 注册失败：用户名至少 3 个字符
 * ===============================================================
 *
 * 排查提示：
 *  - "ab" 长度是 2，小于 3，所以会进入 if 分支抛出异常。
 *  - 确认抛出的消息文本与预期输出完全一致（含其中的空格）。
 */
