# m07 面向对象（OOP）

面向对象是 Java 的核心思想：把数据（字段）和操作数据的行为（方法）打包成“类”，再用类创建“对象”。这是本教程的重点模块，关卡也最多。

## 学习目标

- **类与对象**：类是模板，对象是按模板造出来的实例。
- **构造器**：创建对象时初始化字段。
- **封装**：字段设为 `private`，通过 `getter/setter` 访问；用 `this` 区分同名的参数和字段。
- **继承**：子类用 `extends` 复用父类，用 `super` 调用父类构造器/方法。
- **接口与多态**：用接口定义“能做什么”，父类型引用指向子类对象，同一句调用产生不同行为。
- **Object 常用方法**：重写 `toString`、`equals`、`hashCode`。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_ClassAndObject.java` | 定义类、创建对象、访问字段与方法 |
| Ex02 | `Ex02_Constructor.java` | 用构造器初始化对象 |
| Ex03 | `Ex03_EncapsulationThis.java` | private 字段 + getter/setter + this |
| Ex04 | `Ex04_Inheritance.java` | 继承与 super |
| Ex05 | `Ex05_PolymorphismInterface.java` | 接口与多态 |
| Ex06 | `Ex06_ObjectMethods.java` | 重写 toString / equals / hashCode |

## 重要约定：一个文件里可以有多个类

本教程坚持“一个文件、一个 `main`、可直接运行”。而 OOP 练习往往需要好几个类配合（比如父类、子类）。
做法是：**把辅助类直接写在 public 主类的下方**（它们不加 `public`）。例如 `Ex01` 里
`public class Ex01_ClassAndObject` 下面还写了一个 `class Point`。这是完全合法的，
运行时照样点 `main` 左侧的绿色三角即可。

## 学完自测

- 类和对象有什么区别？
- `this` 是什么，什么时候必须用它？
- `super(...)` 为什么必须写在子类构造器的第一行？
- 多态是怎么做到“同一句调用、不同表现”的？
