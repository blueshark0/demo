# m18 Stream 进阶 / Collectors

m12 里你已经会了 filter / map / sorted / reduce / collect(toList)。本模块再往前一步：用更强大的收集器把数据“分组、统计、建索引、拼接、摊平”，并认识专门处理 int 的数值流 IntStream。

## 学习目标

- **groupingBy**：按分类键把元素分桶成「键 → 列表」的 Map。
- **下游收集器 counting**：分组之后对每组再聚合，比如数出每组个数。
- **toMap**：把每个元素映射成「键、值」，整理成一个查找表式的 Map。
- **joining**：把字符串流用分隔符（可带前后缀）拼成一整串。
- **flatMap / distinct / skip / limit**：摊平嵌套流、去重、跳过、截取。
- **IntStream 统计**：sum / average / max / min 与 summaryStatistics、rangeClosed。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_GroupingBy.java` | 用 groupingBy 按奇偶分组 |
| Ex02 | `Ex02_GroupingCountingDownstream.java` | 分组 + 下游收集器 counting |
| Ex03 | `Ex03_ToMapAndJoining.java` | toMap 建索引 + joining 拼接 |
| Ex04 | `Ex04_FlatMapDistinctLimit.java` | flatMap 摊平 + distinct / skip / limit |
| Ex05 | `Ex05_IntStreamSummary.java` | IntStream 汇总统计 |

## 小贴士

- groupingBy / toMap 默认返回的 Map **不保证顺序**。凡是要“打印整个 Map”的关卡，
  本模块统一把结果装进 **TreeMap**（按键升序），这样输出才稳定、可复现。
- counting 给出的计数是 **Long** 类型（打印出来是纯数字，不带小数）。
- flatMap 与 map 的区别：map 是“一个换一个”，flatMap 是“一个展开成多个、再首尾相接”。
- skip 和 limit 按书写顺序依次生效：先跳过、再截取。
- 处理大量 int 时优先用 IntStream，省去装箱拆箱，还自带 sum / average 等数值方法。

## 学完自测

- groupingBy 和 toMap 都生成 Map，它们的本质区别是什么？分别适合什么场景？
- 为什么本模块要把分组结果塞进 TreeMap？不塞会怎样？
- counting 的返回类型是什么？和元素个数有什么关系？
- flatMap 和 map 各自适合处理什么形状的数据？
- summaryStatistics 一次能拿到哪些统计量？比逐个调用 sum / max 好在哪？
