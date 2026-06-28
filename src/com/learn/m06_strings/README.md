# m06 String 字符串

字符串（`String`）是最常用的类型之一，用来表示文字。它有很多好用的方法，本模块带你掌握最常用的那些。

## 学习目标

- 创建字符串、用 `+` 拼接（字符串和数字拼接会自动变成字符串）。
- 常用方法：`length`、`charAt`、`substring`、`indexOf`、`toUpperCase`、`split`。
- **不可变性**：字符串方法都返回“新字符串”，原字符串永不改变；
  以及用 `==` 比较“是不是同一个对象” vs 用 `equals` 比较“内容是否相同”。
- 用 `StringBuilder` 高效地拼接、反转字符串。
- 用 `String.format` / `printf` 格式化输出。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_CreateAndConcat.java` | 创建与 + 拼接 |
| Ex02 | `Ex02_CommonMethods.java` | length / charAt / substring / indexOf / toUpperCase / split |
| Ex03 | `Ex03_Immutability.java` | 不可变性，== 与 equals 的区别 |
| Ex04 | `Ex04_StringBuilder.java` | StringBuilder 拼接与反转 |
| Ex05 | `Ex05_Format.java` | String.format 格式化 |

## 学完自测

- 为什么说 String 是“不可变”的？`s.toUpperCase()` 会改变 s 吗？
- 比较两个字符串的“内容”应该用 `==` 还是 `equals`？
- 在循环里大量拼接字符串，为什么推荐用 `StringBuilder`？
