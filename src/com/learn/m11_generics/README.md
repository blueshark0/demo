# m11 泛型（Generics）

泛型让你写出“类型可变”的类和方法：同一份代码能安全地处理不同类型，避免强制转换，还能在编译期就发现类型错误。你早就在用它了——`List<String>` 里的 `<String>` 就是泛型。

## 学习目标

- **泛型类**：`class Box<T>`，用时再指定具体类型（`Box<String>`、`Box<Integer>`）。
- **泛型方法**：`<T> T firstOf(T[] arr)`，方法自己带类型参数。
- **有界类型**：`<T extends Number>` 限定类型必须是某类的子类。
- **通配符**：`List<? extends Number>` 表示“某种 Number 子类型的列表”。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_GenericClass.java` | 泛型类 Box<T> |
| Ex02 | `Ex02_GenericMethod.java` | 泛型方法 |
| Ex03 | `Ex03_BoundedType.java` | 有界类型 `<T extends Number>` |
| Ex04 | `Ex04_Wildcards.java` | 通配符 `? extends` |

## 小贴士

- 类型参数习惯用单个大写字母：`T`（Type）、`E`（Element）、`K`/`V`（Key/Value）。
- 泛型只在编译期起“类型检查”的作用，运行时并不知道具体类型（这叫“类型擦除”，了解即可）。

## 学完自测

- 泛型最大的好处是什么（相比于到处用 Object 再强制转换）？
- `<T extends Number>` 中的 `extends` 起什么作用？
- `Box<String>` 和 `Box<Integer>` 用的是同一个类吗？
