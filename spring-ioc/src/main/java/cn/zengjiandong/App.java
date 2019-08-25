package cn.zengjiandong;

import cn.zengjiandong.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 欢迎来到逍遥哥哥的直播间
 * <p>
 * 本示例演示Spring ioc，让我们一步一步 debug ，学习 Spring。
 */
//@Component
public class App {

    public static void main(String[] args) {

        // 创建Spring容器有2个方式：1、使用xml文件 2、使用注解方式
        // 第一种 xml

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContent.xml");

        String beanPath = "E:\\IdeaProjects\\bilibili-live\\spring-ioc\\src\\main\\webapp\\WEB-INF\\applicationContent.xml";
        ApplicationContext context = new FileSystemXmlApplicationContext(beanPath);

        // 获得Spring容器中的对象
        MyService myService1 = context.getBean(MyService.class);
        // 执行该对象的方法
        myService1.doStuff();

        /////////////////////////////////////////////////////////////////

        // 第二种 注解
        // 创建Spring容器对象，基于注解的方式
       /* AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.scan("cn");
        // 获得Spring容器中的对象
        MyService myService2 = myService;
        // 执行该对象的方法
        myService2.doStuff();*/

    }

}
