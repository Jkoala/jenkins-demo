FROM java:8
# 将当前目录下的jar包复制到docker容器的/目录下
ADD helloworld-0.0.1-SNAPSHOT.jar /helloworld-0.0.1-SNAPSHOT.jar
# 声明服务运行在8080端口
EXPOSE 8080
# 指定docker容器启动时运行jar包
CMD ["java", "-jar", "helloworld-0.0.1-SNAPSHOT.jar"]