# m09 集合

数组长度固定、功能有限。集合（Collection）框架提供了更强大灵活的数据容器，是日常开发中最常用的工具之一。

## 学习目标

- `List`（`ArrayList`）：有序、可重复，按下标访问。
- `Set`（`HashSet`）：无序、自动去重。
- `Map`（`HashMap`）：键值对（key → value），按 key 查 value。
- 遍历集合的多种方式，以及用 `Iterator` 在遍历中安全删除元素。
- `Collections` 工具类的常用方法：`sort`、`max`、`min`、`reverse`。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_ArrayList.java` | add / get / size / contains / remove |
| Ex02 | `Ex02_HashSet.java` | 自动去重、判断包含 |
| Ex03 | `Ex03_HashMap.java` | put / get / getOrDefault、统计次数 |
| Ex04 | `Ex04_IterationAndIterator.java` | 遍历与 Iterator 删除 |
| Ex05 | `Ex05_Collections.java` | Collections 工具方法 |

## 小贴士

- 集合里只能装“对象”，所以用的是包装类型 `Integer`、`Double`，而不是 `int`、`double`
  （Java 会自动在两者间转换，叫“自动装箱/拆箱”）。
- `<String>`、`<Integer>` 这种尖括号是“泛型”，规定集合里装什么类型，详见 m11 模块。

## 学完自测

- List、Set、Map 三者最大的区别分别是什么？
- 为什么在 for-each 遍历时直接删除元素会出错？应该怎么删？
- `getOrDefault` 有什么用？
