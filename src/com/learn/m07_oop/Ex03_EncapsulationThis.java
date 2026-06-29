package com.learn.m07_oop;

/*
 * ============================================================
 * 模块：m07 面向对象
 * 关卡：Ex03 封装与 this
 * ------------------------------------------------------------
 * 【知识点】
 *   封装：把字段设为 private，外部不能直接读写，只能通过公开的
 *   getter（读）和 setter（写）方法访问。好处是可以在方法里做检查、保护数据。
 *   this：当方法的“参数名”和“字段名”相同时，需要用 this 指明“字段本身”，
 *   以便和同名的参数区分开来。
 *
 * 【本关任务】
 *   补全 setBalance（把传入的值保存到字段）和 getBalance（返回字段的值）
 *   两个方法，使后续打印结果为「余额 = 100.0」。
 * ============================================================
 */
public class Ex03_EncapsulationThis {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(100);
        System.out.println("余额 = " + acc.getBalance());
    }
}

class Account {
    private double balance; // 私有字段，外部无法直接访问

    public void setBalance(double balance) {
        // TODO(关卡3-1)：把参数 balance 赋给字段 balance（用 this 区分二者）

    }

    public double getBalance() {
        // TODO(关卡3-2)：返回字段 balance 的值
        throw new UnsupportedOperationException("请补全：返回字段 balance 的值");
    }
}

/*
 * ============================ 预期输出 ============================
 * 余额 = 100.0
 * ===============================================================
 *
 * 排查提示：
 *  - 漏写 this 会变成“自己赋值给自己”，字段依然是 0.0。
 *  - balance 是 double，所以打印出来是 100.0（带小数点）。
 */
