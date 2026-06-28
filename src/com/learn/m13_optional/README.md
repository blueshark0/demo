# m13 Optional

`null` 是很多程序崩溃（空指针异常 NullPointerException）的根源。`Optional` 是一个“可能装着值、也可能是空”的容器，它强迫你显式地考虑“没有值”的情况，从而写出更安全的代码。

## 学习目标

- 创建 Optional：`of`（值非空）、`ofNullable`（值可能为空）、`empty`（空）。
- 取值与兜底：`isPresent`、`get`、`orElse`、`orElseGet`。
- 链式处理：`map`（有值才转换）、`ifPresent`（有值才执行），优雅地避免判空。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_CreateOptional.java` | of / ofNullable / empty |
| Ex02 | `Ex02_OrElseIsPresent.java` | isPresent / orElse 取值与兜底 |
| Ex03 | `Ex03_MapIfPresent.java` | map / ifPresent 避免 NPE |

## 小贴士

- `Optional.of(null)` 会直接抛异常；值可能为 null 时要用 `ofNullable`。
- 尽量别用 `get()`（没值时会抛异常），优先用 `orElse` 给个兜底值。

## 学完自测

- `of` 和 `ofNullable` 有什么区别？
- 为什么说 Optional 能帮你减少空指针异常？
- `map` 作用在一个空的 Optional 上会发生什么？
