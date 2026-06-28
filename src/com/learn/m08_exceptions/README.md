# m08 异常处理

程序运行时难免出错（除以 0、数组越界、文件不存在……）。异常机制让你能“捕获”这些错误并优雅处理，而不是让程序直接崩溃。

## 学习目标

- `try / catch / finally`：`try` 包住可能出错的代码，`catch` 捕获并处理，`finally` 无论如何都会执行。
- **受检异常**（编译器强制处理，如 `Exception`）与**非受检异常**（运行时异常，如 `ArithmeticException`）的区别。
- `throw`（抛出一个异常对象）与 `throws`（在方法签名上声明可能抛出的异常）。
- **自定义异常**：继承 `Exception` 写自己的异常类型。
- `try-with-resources`：让资源（文件、连接等）用完自动关闭。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_TryCatchFinally.java` | 捕获越界异常，体会 finally |
| Ex02 | `Ex02_CheckedUnchecked.java` | 受检 vs 非受检异常 |
| Ex03 | `Ex03_ThrowThrows.java` | throw 抛出、throws 声明 |
| Ex04 | `Ex04_CustomException.java` | 自定义异常类 |
| Ex05 | `Ex05_TryWithResources.java` | 资源自动关闭 |

## 学完自测

- `finally` 在什么情况下会执行？
- 受检异常和非受检异常，编译器对待它们有什么不同？
- 自定义异常一般继承哪个类？
