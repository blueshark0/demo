package com.learn.m17_innerclass;

/*
 * ============================================================
 * 模块：m17 内部类与匿名类
 * 关卡：Ex01 成员内部类
 * ------------------------------------------------------------
 * 【知识点】
 *   成员内部类是写在“另一个类内部、且不带 static”的类。它天生“依附”
 *   于某个外部对象而存在：必须先有一个外部类的对象，才能创建出它的内部
 *   对象。也正因为如此，成员内部类可以直接读写所属外部对象的字段——哪怕
 *   那些字段是 private 的。这和静态嵌套类有本质区别：静态嵌套类不持有任何
 *   外部实例，能独立创建，也就读不到外部类的非静态字段。
 *
 * 【本关任务】
 *   下方外部类 Account 有私有字段 owner（值「小明」）和 balance（值 100），
 *   它的成员内部类 Statement 有方法 summary()，要返回把它们拼起来的字符串。
 *   1. 补全 summary()，让它返回「账户小明的余额 = 100」这种形式的字符串
 *      （即 "账户" + owner + "的余额 = " + balance）。
 *   2. 在 main 中先创建一个 Account 对象，再用这个对象创建它的 Statement
 *      内部对象，最后打印 summary() 的结果，得到一行「账户小明的余额 = 100」。
 * ============================================================
 */
public class Ex01_MemberInnerClass {

    static class Account {
        private String owner = "小明";
        private int balance = 100;

        class Statement {
            String summary() {
                throw new UnsupportedOperationException("请补全：返回 \"账户\" + owner + \"的余额 = \" + balance");
            }
        }
    }

    public static void main(String[] args) {
        // TODO(关卡1-1)：创建一个 Account 对象
        // TODO(关卡1-2)：用这个 Account 对象创建它的 Statement 内部对象
        // TODO(关卡1-3)：打印 Statement 的 summary() 结果
    }
}

/*
 * ============================ 预期输出 ============================
 * 账户小明的余额 = 100
 * ===============================================================
 *
 * 排查提示：
 *  - 内部对象必须由外部对象来创建；如果编译报错提示“需要外部实例”，
 *    说明你创建 Statement 的写法不对——它不能脱离某个 Account 对象单独 new。
 *  - 如果余额或户主显示不对，检查 summary() 里拼接的字段是否用对了。
 */
