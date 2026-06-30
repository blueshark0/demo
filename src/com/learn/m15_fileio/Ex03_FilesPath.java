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
 *   逐行读取文件比“一次全读进内存”更省内存，适合大文件：程序里已用
 *   try-with-resources 打开了一个 BufferedReader（这种写法会在读完后
 *   自动关闭它，不必手动 close）。BufferedReader 能一行一行地往下读，
 *   每读一行返回该行内容，读到文件末尾时返回 null —— while 循环正是
 *   靠这个“是否为 null”来判断要不要继续读。
 *
 * 【本关任务】
 *   程序已逐行读出文件 file（内容为两行：line1、line2），循环里的变量
 *   line 就是当前读到的一行。请在循环体里把每一行打印成 "读到：" 加上
 *   该行内容，使程序打印出：
 *       文件存在？ true
 *       读到：line1
 *       读到：line2
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
                // TODO(关卡3-1)：把当前这一行打印成 "读到：" 加上该行内容
                System.out.println("读到：" + line);
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
