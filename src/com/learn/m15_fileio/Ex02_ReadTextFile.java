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
 *   Files.readAllLines 一次性把文件的所有行读成一个 List<String>：
 *       List<String> lines = Files.readAllLines(file);
 *   适合文件不太大的场景，简单直接。
 *
 * 【本关任务】
 *   读取 read_demo.txt 的所有行（文件已在程序里替你准备好）。
 *
 * 【如何闯关】
 *   把 lines 改成 Files.readAllLines(file)，运行对照输出。
 * ============================================================
 */
public class Ex02_ReadTextFile {

    public static void main(String[] args) throws IOException {
        Path dir = Path.of("src/com/learn/m15_fileio/data");
        Files.createDirectories(dir);
        Path file = dir.resolve("read_demo.txt");

        // 先准备一个文件供读取
        Files.write(file, Arrays.asList("apple", "banana", "cherry"));

        // TODO(关卡2-1)：把右边改成 Files.readAllLines(file)
        List<String> lines = Arrays.asList();

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
