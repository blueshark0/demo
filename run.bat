@echo off
rem ============================================================
rem 一步完成「编译 + 运行」某个练习（Windows 版）。
rem 用法:  run.bat 全限定类名
rem 示例:  run.bat com.learn.m01_basics.Ex01_HelloWorld
rem ============================================================
setlocal

if "%~1"=="" (
  echo 用法: run.bat ^<全限定类名^>
  echo 示例: run.bat com.learn.m01_basics.Ex01_HelloWorld
  exit /b 1
)

rem 切到脚本所在目录（项目根目录）
cd /d "%~dp0"

set "CLASS=%~1"
rem 把类名里的点换成反斜杠，拼出源文件路径：com.learn.X -> src\com\learn\X.java
set "SRC=src\%CLASS:.=\%.java"

if not exist "%SRC%" (
  echo 错误: 找不到源文件 %SRC%
  exit /b 1
)

echo ==^> 编译 %SRC%
javac -d out -encoding UTF-8 "%SRC%"
if errorlevel 1 (
  echo 编译失败，请根据上面的错误信息修改代码。
  exit /b 1
)

echo ==^> 运行 %CLASS%
echo ------------------------------------------------------------
java -cp out %CLASS%

endlocal
