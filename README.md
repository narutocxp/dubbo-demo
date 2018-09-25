# dubbo-demo
一.模块说明
1.dubbo-provider-01为服务提供者,启动方式为main
2.dubbo-provider-02为服务提供者,启动方式为(包含了main启动和外置tomcat容器启动),该模快使用了dubbo协议和rest协议举例
  2.1main启动:
     通过com.alibaba.dubbo.container.Main.main(args)进行main启动的默认加载的spring配置文件是resources/META-INF/spring/下的，
     rest服务的发布使用了内置tomcat容器。
  2.2通过tomcat容器启动, rest服务的发布使用了外置tomcat容器。
3.dubbo-consumer为消费者
4.dubbo-api为服务暴露接口
二.导出jar启动
1.dubbo-provider-01模块依赖了dubbo-api,所以先执行dubbo-api模块的maven install;
2.执行dubbo-provider-01模块的maven install
3.拷贝dubbo-provider-01/target下的zip
