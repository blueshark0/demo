package com.learn.m07_oop;

/*
 * ============================================================
 * 模块：m07 面向对象
 * 关卡：Ex05 接口与多态
 * ------------------------------------------------------------
 * 【知识点】
 *   接口（interface）定义“能做什么”，里面的方法只声明、没有方法体。
 *   类用 implements 实现接口，并为这些方法提供具体实现；实现接口的方法
 *   必须写成 public。
 *   多态：用父类型（接口）的引用去指向不同的实现类对象，调用同一个方法，
 *   会各自执行不同的实现——同一行调用，结果因对象而异。
 *
 * 【本关任务】
 *   补全 Circle 和 Rectangle 各自的 area() 方法，使程序打印：
 *       圆面积 = 12.57
 *       矩形面积 = 12.00
 *   （圆面积 = 圆周率 × 半径 × 半径；矩形面积 = 宽 × 高。圆周率用 Math.PI。）
 * ============================================================
 */
public class Ex05_PolymorphismInterface {

    public static void main(String[] args) {
        // 同样是 Shape 类型的引用，指向不同的对象
        Shape s1 = new Circle(2.0);
        Shape s2 = new Rectangle(3.0, 4.0);

        // 同样调用 area()，却会执行各自的实现 —— 这就是多态
        System.out.printf("圆面积 = %.2f%n", s1.area());
        System.out.printf("矩形面积 = %.2f%n", s2.area());
    }
}

interface Shape {
    double area(); // 抽象方法：只声明，不实现
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        // TODO(关卡5-1)：返回圆面积 = 圆周率 × 半径 × 半径（圆周率用 Math.PI）
        double area;
        return area = Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        // TODO(关卡5-2)：返回矩形面积 = 宽 × 高
        double area;
        return area = width * height;
    }
}

/*
 * ============================ 预期输出 ============================
 * 圆面积 = 12.57
 * 矩形面积 = 12.00
 * ===============================================================
 *
 * 排查提示：
 *  - 圆面积 = π×2×2 ≈ 12.566，%.2f 四舍五入成 12.57。
 *  - 实现接口的方法必须写成 public，否则编译报错。
 */
