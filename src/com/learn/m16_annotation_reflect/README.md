# m16 注解与反射入门

注解（Annotation）是给代码贴的“标签”，反射（Reflection）是在运行时“查看和操作类”的能力。它们是很多框架（Spring、JUnit 等）的底层基础。本模块只做入门级了解。

## 学习目标

- 认识常见内置注解：`@Override`、`@Deprecated`、`@SuppressWarnings`。
- 定义自己的注解，并用 `@Retention(RUNTIME)` 让它在运行时可被读取。
- 获取 `Class` 对象的三种方式，认识 `getName` / `getSimpleName`。
- 用反射读取字段的值、调用对象的方法。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_BuiltinAnnotations.java` | 内置注解 |
| Ex02 | `Ex02_CustomAnnotation.java` | 自定义注解 + 反射读取 |
| Ex03 | `Ex03_ClassObject.java` | 获取 Class 对象 |
| Ex04 | `Ex04_ReflectFieldMethod.java` | 反射读字段、调方法 |

## 小贴士

- 注解本身不改变程序逻辑，它只是“信息标签”，要靠反射等手段去读取并据此行动。
- 反射很强大但也较慢、会绕过编译期检查，入门了解即可，日常优先用普通调用。

## 学完自测

- `@Override` 注解有什么实际作用（写错会怎样）？
- 为什么自定义注解常要加 `@Retention(RetentionPolicy.RUNTIME)`？
- 获取 Class 对象有哪几种方式？
