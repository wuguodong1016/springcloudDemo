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
