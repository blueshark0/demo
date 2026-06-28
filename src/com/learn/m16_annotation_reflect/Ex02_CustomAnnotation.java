package com.learn.m16_annotation_reflect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
 * ============================================================
 * 模块：m16 注解与反射入门
 * 关卡：Ex02 自定义注解
 * ------------------------------------------------------------
 * 【知识点】
 *   用 @interface 定义自己的注解，注解里可以有“属性”（写法像方法）：
 *       @Retention(RetentionPolicy.RUNTIME)  // 运行时仍保留，才能被反射读到
 *       @interface Info {
 *           String author();
 *           int version() default 1;         // 可以有默认值
 *       }
 *   把注解贴到类上后，用反射 clazz.getAnnotation(Info.class) 读取它。
 *
 * 【本关任务】
 *   用反射取得 MyService 上的 @Info 注解，并读出 author 和 version。
 *
 * 【如何闯关】
 *   把 info 改成 MyService.class.getAnnotation(Info.class)，运行对照输出。
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
        // TODO(关卡2-1)：把 null 改成 MyService.class.getAnnotation(Info.class)
        Info info = null;

        System.out.println("作者 = " + info.author());
        System.out.println("版本 = " + info.version());
    }
}

/*
 * ============================ 预期输出 ============================
 * 作者 = 小明
 * 版本 = 2
 * ===============================================================
 *
 * 排查提示：
 *  - 若 info 还是 null，调用 info.author() 会抛空指针异常。
 *  - 如果注解没加 @Retention(RUNTIME)，运行时根本读不到它（会得到 null）。
 */
