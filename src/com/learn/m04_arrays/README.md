# m04 数组

数组（array）能把“一批同类型的数据”装在一起，用下标（编号）访问。它是最基础的数据容器。

## 学习目标

- 创建数组、用下标读写元素、获取长度 `length`（下标从 **0** 开始）。
- 用普通 `for` 和增强 `for`（for-each）遍历数组。
- 常见操作：求最大/最小值、用 `Arrays.sort` 排序。
- 二维数组（数组的数组），用双重循环遍历。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_CreateAndAccess.java` | 创建数组、按下标读写、看长度 |
| Ex02 | `Ex02_Traverse.java` | 普通 for 与增强 for 遍历求和 |
| Ex03 | `Ex03_CommonOps.java` | 求最值、Arrays.sort 排序 |
| Ex04 | `Ex04_MultiDim.java` | 二维数组与双重循环 |

## 留空方式说明

以“补全循环体内的一句话”或“补一行赋值”为主。注意数组下标从 0 开始，最大下标是 `length - 1`，越界会抛 `ArrayIndexOutOfBoundsException`。

## 学完自测

- 长度为 5 的数组，合法下标范围是多少？
- 普通 for 和增强 for 各自适合什么时候用？
- `Arrays.sort` 默认按什么顺序排序？
