package com.learn.m16_annotation_reflect;

/*
 * ============================================================
 * 模块：m16 注解与反射入门
 * 关卡：Ex01 内置注解
 * ------------------------------------------------------------
 * 【知识点】
 *   Java 自带几个常用注解：
 *     @Override         放在方法上，让编译器检查“确实重写了父类方法”，
 *                       方法名写错会立刻报错，能帮你避免 bug。
 *     @Deprecated       标记“已过时”，调用处 IDE 会显示删除线提醒。
 *     @SuppressWarnings 压制某一类编译警告（如调用过时方法的警告）。
 *   注解本身不改变运行逻辑，只是给编译器/工具看的“标签”。
 *
 * 【本关任务】
 *   下方已写好父类 Base 与重写了 hello() 的子类 Child。
 *   在 main 里创建的 Child 对象上调用 hello()，让它打印「Child.hello」
 *  （多态会执行 Child 重写后的版本）。
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

        // TODO(关卡1-1)：在 c 上调用 hello() 方法，使其打印「Child.hello」

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
 *  - 如果只看到“这是一个过时的方法”，说明子类对象的方法还没被调用。
 *  - 试着把 Child 里的 @Override 留着、但把方法名故意拼错，
 *    编译器会立刻报错——这正是 @Override 的价值。
 */
