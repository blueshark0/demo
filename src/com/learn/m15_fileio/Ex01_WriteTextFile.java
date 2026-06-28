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
 *   用 Path 表示一个文件路径，用 Files.write 把多行文本写进文件：
 *       Path file = Path.of("xxx/note.txt");
 *       Files.write(file, List.of("第一行", "第二行"));
 *   读写文件可能出错（如磁盘问题），所以 main 声明了 throws IOException。
 *
 * 【本关任务】
 *   把 lines 里的三行文本写入 note.txt。
 *
 * 【如何闯关】
 *   补全 Files.write 调用，运行对照输出（并可去 data 目录查看生成的文件）。
 * ============================================================
 */
public class Ex01_WriteTextFile {

    public static void main(String[] args) throws IOException {
        Path dir = Path.of("src/com/learn/m15_fileio/data");
        Files.createDirectories(dir); // 确保目录存在
        Path file = dir.resolve("note.txt");

        List<String> lines = Arrays.asList("第一行", "第二行", "第三行");

        // TODO(关卡1-1)：用 Files.write(file, lines) 把这几行写入文件
        //   提示：Files.write(file, lines);

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
