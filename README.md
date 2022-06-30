# 怎么才能写个完整的后台项目?
### 读代码
1. 注解可以自己写, 我要确定一下, 注解自己写怎么操作
2. 从 controller 层开始 -> 到 serviceImpl(实现了接口) -> mapper 层 -> 而mapper(接口) 则和 mybatis的 xml配置文件一一映射
3. 如果我想写

### day1 2022/6/30
> 如果我想实现一个登录功能
1. 首先我需要一个 `Controller`, -> 一个注解搞定
2. `controller` 回去 通过 impl 去查数据库, 返回一个 `resultVO`
3. impl 需要继承自一个接口 -> `service` 接口
4. 需要定义一个标准返回vo
5. 查数据库需要一个`pojo`(数据原型), 一个`Mapper`接口(对接`mybatis`的xml)
6. 而和`mybatis`交互, 就需要看怎么将[spring和mybatis融合](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/), 以及怎么配置 xml
