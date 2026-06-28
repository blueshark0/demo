# Java 零基础闯关教程

一套面向**完全零基础**的 Java 初学者的循序渐进练习项目。纯 `.java` 文件，**无需任何构建工具**（不用 Maven / Gradle）。

学习方式很简单：**补全留空的代码 → 运行 `main` → 把控制台输出和文件底部「预期输出」逐行对照 → 一致即过关。**

---

## 一、环境要求

- JDK 17（已安装，命令行运行 `java -version` 可验证）
- 推荐使用 IntelliJ IDEA 打开本项目（零基础最省心）

---

## 二、学习路线图（请按顺序闯关）

| 序号 | 模块包 | 主题 | 你将学会 |
|------|--------|------|----------|
| 01 | `m01_basics` | 基础语法与基本类型 | main 方法、变量、八种基本类型、字面量、类型转换 |
| 02 | `m02_operators` | 运算符 | 算术、关系、逻辑、位运算、三元、自增自减 |
| 03 | `m03_controlflow` | 控制流 | if/else、switch、while、for、break/continue |
| 04 | `m04_arrays` | 数组 | 创建、遍历、最值与排序、二维数组 |
| 05 | `m05_methods` | 方法 | 定义与调用、参数与返回、重载、递归、可变参数 |
| 06 | `m06_strings` | String | 拼接、常用方法、不可变性、StringBuilder、格式化 |
| 07 | `m07_oop` | 面向对象 | 类与对象、构造器、封装、继承、接口与多态、Object 方法 |
| 08 | `m08_exceptions` | 异常处理 | try/catch/finally、受检与非受检、自定义异常、try-with-resources |
| 09 | `m09_collections` | 集合 | List、Set、Map、遍历与 Iterator、Collections 工具 |
| 10 | `m10_enums` | 枚举 | 基本枚举、带字段、枚举方法、switch 与 values |
| 11 | `m11_generics` | 泛型 | 泛型类、泛型方法、有界类型、通配符 |
| 12 | `m12_lambda_stream` | Lambda 与 Stream | 函数式接口、Lambda、方法引用、Stream 流水线 |
| 13 | `m13_optional` | Optional | 优雅地避免空指针 NullPointerException |
| 14 | `m14_commonapi` | 常用 API | Math、包装类、日期时间、Random、Scanner |
| 15 | `m15_fileio` | 文件 IO 入门 | 读写文本文件、Path、try-with-resources |
| 16 | `m16_annotation_reflect` | 注解与反射入门 | 内置/自定义注解、Class 对象、反射 |

每个模块下有 3–5 个练习（`Ex01`、`Ex02`……），按编号顺序由浅入深。每个模块目录里还有一份 `README.md` 导读。

---

## 三、两种运行方式

### 方式 A：IntelliJ IDEA（推荐零基础使用）

1. 用 IDEA 打开本项目根目录（即 `demo/` 这个文件夹）。
2. 确认左侧 `src` 目录被标记为 **Sources Root**（图标为蓝色文件夹）。若不是：右键 `src` → `Mark Directory as` → `Sources Root`。
3. 打开任意 `ExNN_*.java` 文件，点击 `main` 方法左侧的**绿色三角** → `Run`。
4. 在底部「Run」控制台查看输出。

### 方式 B：命令行（进阶，或没有 IDEA 时）

在项目根目录 `demo/` 下执行（以第一关为例）：

```bash
javac -d out -encoding UTF-8 src/com/learn/m01_basics/Ex01_HelloWorld.java
java -cp out com.learn.m01_basics.Ex01_HelloWorld
```

说明：`-d out` 把编译产物 `.class` 输出到 `out/` 目录；运行时用类的**全限定名**（包名 + 类名）。

也可以用项目自带的辅助脚本一步完成「编译 + 运行」：

```bash
./run.sh com.learn.m01_basics.Ex01_HelloWorld
# 或直接传源文件路径：
./run.sh src/com/learn/m01_basics/Ex01_HelloWorld.java
```

> Windows 用户用 `run.bat`，用法相同。

---

## 四、如何闯关

1. 打开一个练习文件，先读顶部块注释里的 **【知识点】** 和 **【本关任务】**。
2. 找到文件里所有 `// TODO`，按提示补全代码。
3. 运行 `main` 方法。
   - 如果抛出 `UnsupportedOperationException`，说明还有 `TODO` 没写完。
   - 如果输出里出现 `【请把这行改成 ...】` 之类占位文字，说明那一处还没改。
4. 把控制台输出与文件底部 **「预期输出」** 逐行对照，**完全一致就过关**！
5. 卡住时：回头重读【知识点】，再看 `TODO` 旁边的「提示」。本教程**不提供参考答案**，鼓励多试错、多查阅 JDK 文档。

---

## 五、目录约定

- 模块包名形如 `mNN_主题`，练习文件形如 `ExNN_主题`，**按编号顺序学习**。
- `public class` 的名字与文件名一致。
- 面向对象等需要多个类的练习，会把**辅助类写在同一个文件里**（写在 public 主类下方），保证「一个文件、一个 main、可直接运行」。

---

## 六、常见问题

- **中文乱码**：命令行编译时务必加 `-encoding UTF-8`；IDEA 里把文件编码设为 UTF-8（`Settings → Editor → File Encodings`）。
- **m14 Scanner、m15 文件 IO** 这两个模块运行时有特殊说明，请看对应模块的 `README.md`。
- **找不到主类 / 包名错误**：命令行运行时类名要写全限定名（含包），且要在项目根目录 `demo/` 下执行。
