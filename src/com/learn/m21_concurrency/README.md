# m21 多线程入门

线程让程序能“同时”往前推进多条执行流；本模块带你从手动开线程，一路认识到同步、原子类与线程池，理解并行带来的好处与“数据争用”的坑。

## 学习目标

- 用 `Runnable` + Lambda 描述任务，用线程 `start` 异步执行、用 `join` 等待汇合。
- 理解多线程结果为何“顺序不保证、合计却确定”，学会用 `join` 拿到可复现的聚合结果。
- 认识“丢更新”问题，用 `synchronized` 给“读-改-写”加锁保护共享变量。
- 用 `AtomicInteger` 实现无锁、不丢更新的计数。
- 用线程池（`ExecutorService`）提交任务、用 `Future` 取结果，并正确 `shutdown`。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_ThreadRunnableStart.java` | Runnable+Lambda 创建、start、join |
| Ex02 | `Ex02_JoinMultiThreads.java` | 多线程 join 聚合得确定结果 |
| Ex03 | `Ex03_SynchronizedCounter.java` | synchronized 同步避免丢更新 |
| Ex04 | `Ex04_AtomicInteger.java` | 原子类无锁计数 |
| Ex05 | `Ex05_ExecutorServicePool.java` | 线程池 submit/Future/shutdown |

## 小贴士

- 多线程的打印顺序每次运行都可能不同，这很正常；本模块每关只把“最终聚合结果”那一行作为过关判据。
- 共享数据是多线程的最大坑：要么让各线程写各自互不重叠的位置（无竞争），要么对共享变量加锁/用原子类。
- 想让结果稳定可复现，必须在读取/汇总之前确保所有子线程都已结束（`join` / `awaitTermination`）。
- 线程池用完一定要 `shutdown`，否则程序可能不退出。

## 学完自测

- 为什么调用 `start` 才真正开新线程，直接调用任务里的方法不算？
- 多个线程对同一个普通 `int` 自增，为什么结果会偏小且不稳定？
- `synchronized` 和 `AtomicInteger` 都能避免丢更新，它们各有什么取舍？
- 线程池相比每次 `new Thread` 有哪些好处？`Future.get()` 在结果还没算好时会发生什么？
