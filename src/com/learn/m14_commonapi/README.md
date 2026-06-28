# m14 常用 API

Java 标准库提供了大量开箱即用的工具类。本模块带你认识日常开发中最常打交道的几个。

## 学习目标

- `Math`：数学运算（绝对值、最值、幂、平方根等）。
- 包装类与解析：`Integer.parseInt`、`Double.parseDouble`、自动装箱拆箱、`Integer.MAX_VALUE`。
- `java.time`：现代日期时间 API（`LocalDate`、日期加减、格式化）。
- `Random`：生成随机数。
- `Scanner`：从控制台读取用户输入。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_Math.java` | Math 常用方法 |
| Ex02 | `Ex02_WrapperParse.java` | 包装类、解析、装箱拆箱 |
| Ex03 | `Ex03_JavaTime.java` | LocalDate 日期加减与格式化 |
| Ex04 | `Ex04_Random.java` | 生成随机数 |
| Ex05 | `Ex05_Scanner.java` | 读取控制台输入 |

## ⚠️ 特殊运行说明

- **Ex04_Random** 故意使用了“固定种子” `new Random(42)`，这样每次运行都会生成
  相同的随机序列，方便你和“预期输出”对照。真实项目里通常用无参 `new Random()`，
  每次结果都不同。
- **Ex05_Scanner** 需要你在运行后“手动输入”。在 IDEA 里运行后，点一下底部控制台、
  输入内容再回车即可。它的“预期输出”是“当你输入示例内容时”的结果。

## 学完自测

- `Math.pow(2, 10)` 的返回类型是什么？
- 字符串 "100" 怎么变成数字 100？
- 为什么测试随机相关代码时，常用“固定种子”？
