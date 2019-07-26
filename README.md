## 环境
+ windows ltsc
+ Docker Desktop 2.0.0.3
+ Apache Maven 3.6.1
+ jdk 1.8.0_221
+ Git 2.22.0.windows.1
## 注意
+ 查看Java容器镜像日志是基于文件映射的,要求docker卷绑定
## 流程
+ 克隆项目
+ Git bash中：
```
#编译maven项目和构建镜像（build前最好先执行sh clean.sh)
sh build.sh
#后台启动docker-compose 容器
sh start.sh
#等待start完成
Sleep 30 
#用于向Java 容器发起请求
sh curl.sh
#当curl.sh 执行完毕后，用于查看Java 容器镜像日志，并停止dockercompose
sh stop.sh
```
## 实现了所有功能
