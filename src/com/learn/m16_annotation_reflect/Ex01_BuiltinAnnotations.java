package com.learn.m16_annotation_reflect;

/*
 * ============================================================
 * 模块：m16 注解与反射入门
 * 关卡：Ex01 内置注解
 * ------------------------------------------------------------
 * 【知识点】
 *   Java 自带几个常用注解：
 *       @Override        放在方法上，让编译器检查“确实重写了父类方法”，
 *                        写错方法名会立刻报错，能帮你避免 bug。
 *       @Deprecated      标记“已过时”，调用时 IDE 会显示删除线提醒。
 *       @SuppressWarnings 压制某类编译警告（如调用过时方法的警告）。
 *
 * 【本关任务】
 *   调用子类重写后的 hello() 方法（多态会执行 Child 的版本）。
 *
 * 【如何闯关】
 *   补一行 c.hello();，运行对照输出。
 * ============================================================
 */
public class Ex01_BuiltinAnnotations {

    static class Base {
        void hello() {
            System.out.println("Base.hello");
        }
    }

    static class Child extends Base {
        @Override // 编译器据此检查：这里确实重写了父类的 hello
        void hello() {
            System.out.println("Child.hello");
        }
    }

    @Deprecated // 标记此方法已过时
    static void oldFeature() {
        System.out.println("这是一个过时的方法");
    }

    @SuppressWarnings("deprecation") // 压制“调用了过时方法”的警告
    public static void main(String[] args) {
        Child c = new Child();

        // TODO(关卡1-1)：调用 c.hello()
        c.hello();
        //   提示：c.hello();

        oldFeature(); // 调用被 @Deprecated 标记的方法（仍能正常运行）
    }
}

/*
 * ============================ 预期输出 ============================
 * Child.hello
 * 这是一个过时的方法
 * ===============================================================
 *
 * 排查提示：
 *  - 如果只看到“这是一个过时的方法”，说明 c.hello() 还没补。
 *  - 试着把 Child 里的 @Override 留着、但把方法名改成 hello（拼错），
 *    编译器会立刻报错——这正是 @Override 的价值。
 */
