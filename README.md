# dubbo-demo
一.模块说明
1.dubbo-provider-01为服务提供者,启动方式为main<br>
2.dubbo-provider-02为服务提供者,启动方式为(包含了main启动和外置tomcat容器启动),该模快使用了dubbo协议和rest协议举例<br>
  2.1main启动:<br>
     通过com.alibaba.dubbo.container.Main.main(args)进行main启动的默认加载的spring配置文件是resources/META-INF/spring/下的，<br>
     rest服务的发布使用了内置tomcat容器。<br>
  2.2通过tomcat容器启动, rest服务的发布使用了外置tomcat容器。<br>
3.dubbo-provider-03为服务提供者,启动方式为main<br>
4.dubbo-consumer为消费者<br>
5.dubbo-api为服务暴露接口<br>
二.导出jar启动<br>
 1.不包含第三方依赖<br>
	 1.1dubbo-provider-01模块依赖了dubbo-api,所以先执行dubbo-api模块的mvn install;<br>
	 1.2执行dubbo-provider-01模块的mvn install<br>
	 1.3拷贝dubbo-provider-01/target下的zip <br>
 2.包含第三方依赖<br>
     2.1 执行dubbo-provider-03模块的mvn package,导出的jar在target目录下