#!/usr/bin/env bash
#
# 一步完成「编译 + 运行」某个练习。
#
# 用法:
#   ./run.sh com.learn.m01_basics.Ex01_HelloWorld         # 传全限定类名
#   ./run.sh src/com/learn/m01_basics/Ex01_HelloWorld.java # 或传 .java 源文件路径
#
set -e

# 1) 校验参数
if [ -z "$1" ]; then
  echo "用法: ./run.sh <全限定类名 或 .java 文件路径>"
  echo "示例: ./run.sh com.learn.m01_basics.Ex01_HelloWorld"
  exit 1
fi

# 2) 校验 javac / java 是否可用
for cmd in javac java; do
  if ! command -v "$cmd" >/dev/null 2>&1; then
    echo "错误: 找不到命令「$cmd」。请先安装 JDK 17 并把它加入 PATH。"
    exit 1
  fi
done

# 3) 切到脚本所在目录（即项目根目录），保证相对路径正确
SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$SCRIPT_DIR"

# 4) 把入参统一解析成「全限定类名 CLASS」和「源文件路径 SRC」
ARG="$1"
if [[ "$ARG" == *.java ]]; then
  # 入参是源文件路径：去掉前缀 src/ 和后缀 .java，再把 / 换成 .
  CLASS="${ARG#src/}"
  CLASS="${CLASS%.java}"
  CLASS="${CLASS//\//.}"
  SRC="$ARG"
else
  # 入参是全限定类名：把 . 换成 / 拼出源文件路径
  CLASS="$ARG"
  SRC="src/${ARG//.//}.java"
fi

if [ ! -f "$SRC" ]; then
  echo "错误: 找不到源文件 $SRC"
  exit 1
fi

# 5) 编译（失败时 set -e 会直接终止），再运行
echo "==> 编译 $SRC"
javac -d out -encoding UTF-8 "$SRC"
echo "==> 运行 $CLASS"
echo "------------------------------------------------------------"
java -cp out "$CLASS"
