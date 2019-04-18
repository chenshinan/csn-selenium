FROM registry.cn-hangzhou.aliyuncs.com/choerodon-tools/javabase:0.7.1
COPY target/app-fat-tests.jar /app-fat-tests.jar
COPY src/test/resources/driver ./driver

