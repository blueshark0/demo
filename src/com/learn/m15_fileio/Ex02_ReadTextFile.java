package com.learn.m15_fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/*
 * ============================================================
 * 模块：m15 文件 IO 入门
 * 关卡：Ex02 读取文本文件
 * ------------------------------------------------------------
 * 【知识点】
 *   有一种最直接的读法：一次性把整个文件的所有行读出来，结果是一个
 *   List<String>（每个元素是文件中的一行）。它简单直接，适合文件不太
 *   大的场景；文件较大时这样一次全读进内存就不划算了。
 *   读文件可能出错，属于受检异常，所以 main 声明了 throws IOException。
 *
 * 【本关任务】
 *   程序已替你准备好待读文件 file（路径 .../data/read_demo.txt，内容为
 *   三行：apple、banana、cherry）。请一次性读取 file 的所有行，把结果
 *   赋给 lines，使程序打印出：
 *       共 3 行：
 *         apple
 *         banana
 *         cherry
 * ============================================================
 */
public class Ex02_ReadTextFile {

    public static void main(String[] args) throws IOException {
        Path dir = Path.of("src/com/learn/m15_fileio/data");
        Files.createDirectories(dir);
        Path file = dir.resolve("read_demo.txt");

        // 先准备一个文件供读取
        Files.write(file, Arrays.asList("apple", "banana", "cherry"));

        // TODO(关卡2-1)：一次性读取 file 的所有行，赋给 lines（替换下面的空列表占位）
        List<String> lines = List.of();

        System.out.println("共 " + lines.size() + " 行：");
        for (String line : lines) {
            System.out.println("  " + line);
        }
    }
}

/*
 * ============================ 预期输出 ============================
 * 共 3 行：
 *   apple
 *   banana
 *   cherry
 * ===============================================================
 *
 * 排查提示：
 *  - 如果显示“共 0 行”，说明还没真正去读文件（lines 还是空的）。
 */
