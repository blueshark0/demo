# m15 文件 IO 入门

程序经常需要把数据保存到文件、或从文件读取数据。本模块用现代、简洁的 `java.nio.file`（`Files` / `Path`）来读写文本文件。

## 学习目标

- 用 `Path` 表示文件路径，用 `Files.write` 写入文本、`Files.readAllLines` 读取所有行。
- 用 `Files.createDirectories` 确保目录存在、`Files.exists` 判断文件是否存在。
- 用 `try-with-resources` + `BufferedReader` 逐行读取（资源自动关闭）。

## 关卡清单

| 关卡 | 文件 | 目的 |
|------|------|------|
| Ex01 | `Ex01_WriteTextFile.java` | 写入文本文件 |
| Ex02 | `Ex02_ReadTextFile.java` | 读取文本文件 |
| Ex03 | `Ex03_FilesPath.java` | Path / exists + 逐行读 |

## ⚠️ 特殊运行说明

- 这些练习会在本模块的 `data/` 子目录下生成临时文件（如 `note.txt`）。这是正常现象，
  该目录已被 `.gitignore` 忽略，可随时删除。
- 文件路径用的是相对路径（相对“项目根目录”）。请确保从项目根目录 `demo/` 运行；
  在 IDEA 里默认就是项目根目录，直接点运行即可。

## 学完自测

- `Files.write` 和 `Files.readAllLines` 各做什么？
- 为什么读文件推荐用 `try-with-resources`？
