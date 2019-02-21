# springcloudDemo 这是spring微服务实战的实例代码
##  来自https://blog.csdn.net/ITTechnologyHome/article/details/73824784 的图文教程
| 模块名称 | 模块说明 | 访问地址 |
| ------ | ------ | ------ |
| springcloud-eureka-server | 分布式服务注册中心(单点) | http://127.0.0.1:9999 |
| springcloud-eureka-server-ha | 分布式服务注册中心(高可用版本) | http://127.0.0.1:9998 http://127.0.0.1:9997 |
| springcloud-provider-user-service | 用户服务提供者 | http://127.0.0.1:9996/list http://127.0.0.1:9995/list |
| springcloud-consumer-h5 | 用户服务调用者,采用原始的RestTemplate调用 | http://127.0.0.1:9991/user/get/4 | 
| springcloud-consumer-h5-ribbon-hystrix | 用户服务调用者，采用ribbon做客户端负载均衡 | http://127.0.0.1:9994/springcloud-provider-user-service | 
| springcloud-consumer-h5-feign | feign声明式服务调用者 | http://127.0.0.1:9993/list | 
| springcloud-gateway | 网关服务 | http://127.0.0.1:9992/api-a/list | 
| springcloud-config-server | 配置中心 | 待定 | 

----

SpringCloud是基于SpringBoot之上的用来快速构建微服务系统的工具集，拥有功能完善的轻量级微服务组件

---

* 服务治理(Eureka):

 等于像中介一样的性质，给买房和卖方提供一个平台。消费者去注册中心获取服务，生产者则去注册服务

----

* 客户端负载均衡(Ribbon):

Ribbon可以基于负载均衡算法(例如轮询、随机)自动的帮助消费者去请求。和eureka搭配实现负载均衡，让消费者通过调用生产者在eureka中注册的springapplicationname( 用户微服务的虚拟主机名)即可

----

* 声明式REST调用(Feign)：

实现restful的声明格式，即在类上写上访问的地址，方法上写上访问的路径
```
@FeignClient(value = "springcloud-provider-user-service")
public interface UserFeignClient {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    List<User> list();

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    User login(@RequestParam("name")  String name, @RequestParam("password") String password);

}
```
----

* 服务容错(Hystrix) ：

即在没有调用到或者生产者服务器关闭的时候，能提供一些默认的参数，从而避免报错或返回空页面
