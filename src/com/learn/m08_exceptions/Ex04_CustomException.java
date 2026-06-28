package com.learn.m08_exceptions;

/*
 * ============================================================
 * 模块：m08 异常处理
 * 关卡：Ex04 自定义异常
 * ------------------------------------------------------------
 * 【知识点】
 *   除了用 Java 自带的异常，你也可以定义“自己的异常类型”，让错误信息更贴切。
 *   做法是继承 Exception（受检）或 RuntimeException（非受检）：
 *       class InvalidNameException extends Exception {
 *           public InvalidNameException(String msg) { super(msg); }
 *       }
 *   然后就能像内置异常一样 throw 它。
 *
 * 【本关任务】
 *   补全 register：当用户名长度小于 3 时，抛出 InvalidNameException。
 *
 * 【如何闯关】
 *   把方法里的占位 throw 替换成 throw new InvalidNameException("用户名至少 3 个字符");
 *   运行对照输出。
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
            // TODO(关卡4-1)：抛出 new InvalidNameException("用户名至少 3 个字符")
            throw new UnsupportedOperationException("请改成抛出 InvalidNameException");
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
 *  - "ab" 长度是 2，小于 3，所以会进入 if 抛出异常。
 *  - 若未补全，会抛出 UnsupportedOperationException 而不是我们想要的异常，程序会崩溃。
 */
