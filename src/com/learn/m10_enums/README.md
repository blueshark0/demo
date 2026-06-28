# m10 枚举（enum）

当一个变量的取值只能是“有限的几种”（如星期、季节、方向、订单状态），用枚举比用一堆常量字符串更安全、更清晰。

## 学习目标

- 定义基本枚举，用 `==` 比较枚举值。
- 给枚举常量带上字段和构造器（如行星带重力值）。
- 给枚举加方法，甚至让每个常量各自实现一个抽象方法。
- `switch` 配合枚举；`values()` 遍历所有常量；`valueOf()` 按名字取常量；`ordinal()` 取序号。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_BasicEnum.java` | 定义并使用基本枚举 |
| Ex02 | `Ex02_EnumWithFields.java` | 带字段和构造器的枚举 |
| Ex03 | `Ex03_EnumMethods.java` | 每个常量各自实现抽象方法 |
| Ex04 | `Ex04_EnumSwitchAndValues.java` | switch + values / valueOf / ordinal |

## 小贴士

- 枚举常量习惯全大写，如 `MON`、`SUMMER`。
- 枚举本质上也是一种特殊的类，所以能有字段、构造器和方法。
- 在 `switch` 里写枚举的 case 时，只写常量名（如 `SUMMER`），不用写 `Season.SUMMER`。

## 学完自测

- 枚举相比“一堆字符串常量”有什么好处？
- `values()`、`valueOf()`、`ordinal()` 分别做什么？
