# m19 比较器与排序进阶 + 集合补全

在 m09（集合）、m12（Comparator + Lambda）的基础上，把“排序”和“有序集合”讲透：让类自带自然顺序、用链式比较器灵活排序、用 TreeMap/TreeSet/LinkedHashMap 维持不同含义的“有序”，再用 merge/computeIfAbsent 把往 Map 里累积数据的常见啰嗦写法一步搞定。

## 学习目标

- **Comparable 自然顺序**：实现 `compareTo`，给类一个“天生”的排序规则。
- **比较器链**：`comparing` 取键、`thenComparing` 打破平局、`reversed` 整体反向。
- **TreeMap / TreeSet**：始终按键有序，可通过构造时的比较器改成自定义序（如降序）。
- **LinkedHashMap**：按“插入顺序”遍历，区别于 TreeMap 的“按键排序”。
- **merge / computeIfAbsent**：分别简化“计数累加”与“分桶（Map 套 List）”。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_ComparableNaturalOrder.java` | 实现 Comparable 定义自然顺序，排序与求最值 |
| Ex02 | `Ex02_ComparatorChain.java` | comparing / thenComparing / reversed 链式排序 |
| Ex03 | `Ex03_TreeMapTreeSet.java` | TreeMap 自然序、TreeSet 自定义降序 |
| Ex04 | `Ex04_LinkedHashMapOrder.java` | LinkedHashMap 保留插入顺序 |
| Ex05 | `Ex05_ComputeIfAbsentMerge.java` | merge 词频统计、computeIfAbsent 奇偶分桶 |

## 小贴士

- “自然顺序”是类自带的默认规则；“比较器”是排序时临时给的规则，两者可并存。
- `compareTo` / 比较器都靠“负、零、正”的返回值表达大小，方向写反就会得到逆序。
- 降序时若把整个比较器都 `reversed`，连次级键也会跟着反；只反向需要降序的那一段。
- “有序”有两种含义：TreeMap 是“按键排序”，LinkedHashMap 是“按插入先后”。

## 学完自测

- Comparable 的“自然顺序”和临时传入的 Comparator 有什么区别？什么时候各用哪个？
- 想要“主键降序、同主键时次键升序”，比较器该怎么组合？
- TreeMap 和 LinkedHashMap 都“有序”，它们的“有序”分别指什么？
- merge 和 computeIfAbsent 各自最适合哪类“往 Map 里累积”的场景？
