package com.learn.m16_annotation_reflect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * ============================================================
 * 模块：m16 注解与反射入门
 * 关卡：Ex02 自定义注解
 * ------------------------------------------------------------
 * 【知识点】
 *   除了内置注解，你也能用 @interface 定义自己的注解。注解里可以声明
 *   “属性”（写法很像方法），属性还能带默认值。关键点：只有给注解加上
 *   @Retention(RetentionPolicy.RUNTIME)，它才会在运行时被保留、才能
 *   被反射读取；否则运行时根本读不到它（会得到 null）。读取的办法是
 *   通过反射，向某个类的 Class 对象询问它身上贴的那个注解。
 *
 * 【本关任务】
 *   下方 MyService 类上已贴好 @Info(author = "小明", version = 2)。
 *   请用反射取得 MyService 上的 @Info 注解对象，再读出它的两个属性，
 *   打印「作者 = 小明」与「版本 = 2」。
 * ============================================================
 */
public class Ex02_CustomAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @interface Info {
        String author();
        int version() default 1;
    }

    @Info(author = "小明", version = 2)
    static class MyService {
    }

    public static void main(String[] args) {
        // TODO(关卡2-1)：用反射取得 MyService 类上的 @Info 注解对象
        Class<?> clazz = MyService.class;
        // TODO(关卡2-2)：读出注解的 author 与 version 两个属性，分别打印
        Info info = clazz.getAnnotation(Info.class);
       // System.out.println("作者 = " + clazz +"版本 = " +clazz);
        System.out.println("作者 = " + info.author());
        System.out.println("版本 = " + info.version());
        //               「作者 = 小明」与「版本 = 2」
    }
}

/*
 * ============================ 预期输出 ============================
 * 作者 = 小明
 * 版本 = 2
 * ===============================================================
 *
 * 排查提示：
 *  - 若运行时取到的注解是 null，多半是注解没加 @Retention(RUNTIME)，
 *    或者反射读取注解的写法不对。
 *  - 读不到属性值时，确认你是否在用“注解对象”去读它的属性。
 */
