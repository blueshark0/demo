package com.learn.m15_fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/*
 * ============================================================
 * 模块：m15 文件 IO 入门
 * 关卡：Ex01 写入文本文件
 * ------------------------------------------------------------
 * 【知识点】
 *   用 Path 表示一个文件路径，它只是“指向某个文件的地址”，本身并不读写。
 *   要把若干行文本一次性写进文件，需要一个能接收“一个路径 + 一组文本行”
 *   的写入操作；它会创建（或覆盖）该文件并把这些行逐行写入。
 *   读写文件可能出错（如磁盘问题），属于受检异常，所以 main 声明了
 *   throws IOException，让这类异常向上抛出。
 *
 * 【本关任务】
 *   程序已为你准备好目标文件 file（路径 src/com/learn/m15_fileio/data/note.txt）
 *   和待写入的三行文本 lines（"第一行"、"第二行"、"第三行"）。
 *   请把 lines 这三行写入 file 文件，使程序打印出：
 *       已写入文件：src/com/learn/m15_fileio/data/note.txt
 *       文件是否存在：true
 * ============================================================
 */
public class Ex01_WriteTextFile {

    public static void main(String[] args) throws IOException {
        Path dir = Path.of("src/com/learn/m15_fileio/data");
        Files.createDirectories(dir); // 确保目录存在
        Path file = dir.resolve("note.txt");

        List<String> lines = Arrays.asList("第一行", "第二行", "第三行");

        // TODO(关卡1-1)：把 lines 这三行文本写入 file 文件


        System.out.println("已写入文件：" + file);
        System.out.println("文件是否存在：" + Files.exists(file));
    }
}

/*
 * ============================ 预期输出 ============================
 * 已写入文件：src/com/learn/m15_fileio/data/note.txt
 * 文件是否存在：true
 * ===============================================================
 *
 * 排查提示：
 *  - 补全后，可以到 data 目录打开 note.txt，看到写入的三行内容。
 *  - 路径分隔符在 Windows 上可能显示为反斜杠 \，属于正常差异。
 */
