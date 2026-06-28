# m12 Lambda 与 Stream

Lambda 让你能把“一段行为”当作参数传来传去；Stream 则提供了一套优雅的“流水线”来处理集合数据。这是现代 Java 最常用、最能提升代码可读性的特性。

## 学习目标

- **函数式接口**：只有一个抽象方法的接口，可以用 Lambda 来实现。
- **Lambda 语法**：`(参数) -> 表达式`，比匿名内部类简洁得多。
- **方法引用**：`String::toUpperCase` 是 Lambda 的进一步简写。
- **Stream 流水线**：`filter`（过滤）、`map`（转换）、`sorted`（排序）、
  `reduce`（归约）、`collect`（收集）、`count`（计数）。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_FunctionalInterface.java` | 函数式接口：匿名类 vs Lambda |
| Ex02 | `Ex02_LambdaSyntax.java` | 用内置接口写 Lambda |
| Ex03 | `Ex03_MethodReference.java` | 方法引用 |
| Ex04 | `Ex04_StreamFilterMap.java` | filter + map + collect |
| Ex05 | `Ex05_StreamReduceSorted.java` | sorted + reduce + count |

## 小贴士

- Lambda 只能用于“函数式接口”（恰好一个抽象方法）。
- Stream 是“一次性”的，处理完就不能再用；它也不会改变原集合。

## 学完自测

- Lambda 和匿名内部类相比，好在哪？
- `filter`、`map`、`collect` 各自做什么？
- `String::toUpperCase` 等价于哪个 Lambda？
