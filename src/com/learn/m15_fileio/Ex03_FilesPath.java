package com.learn.m15_fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/*
 * ============================================================
 * 模块：m15 文件 IO 入门
 * 关卡：Ex03 Path 与逐行读取
 * ------------------------------------------------------------
 * 【知识点】
 *   Files.exists(path) 判断文件是否存在。
 *   逐行读取大文件更省内存，用 BufferedReader 配合 try-with-resources：
 *       try (BufferedReader r = Files.newBufferedReader(file)) {
 *           String line;
 *           while ((line = r.readLine()) != null) { ... }
 *       }
 *   readLine() 每次读一行，读到文件末尾时返回 null。
 *
 * 【本关任务】
 *   在 while 循环里把读到的每一行打印成 "读到：xxx"。
 *
 * 【如何闯关】
 *   在循环体里补一行打印语句，运行对照输出。
 * ============================================================
 */
public class Ex03_FilesPath {

    public static void main(String[] args) throws IOException {
        Path dir = Path.of("src/com/learn/m15_fileio/data");
        Files.createDirectories(dir);
        Path file = dir.resolve("lines.txt");
        Files.write(file, Arrays.asList("line1", "line2"));

        System.out.println("文件存在？ " + Files.exists(file));

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                // TODO(关卡3-1)：打印 "读到：" + line
                System.out.println("读到：" + line);
                //   提示：System.out.println("读到：" + line);
            }
        }
    }
}

/*
 * ============================ 预期输出 ============================
 * 文件存在？ true
 * 读到：line1
 * 读到：line2
 * ===============================================================
 *
 * 排查提示：
 *  - 如果只看到“文件存在？ true”，说明循环体里的打印还没补。
 *  - try-with-resources 会在读完后自动关闭 reader，不用你手动 close。
 */
