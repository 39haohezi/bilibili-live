package cn.zengjiandong.service.impl;

import cn.zengjiandong.dao.MyDao;
import cn.zengjiandong.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    /**
     * 使用xml中定义，属性注入需要写setter方法
     *
     * 否则报错：Caused by: org.springframework.beans.NotWritablePropertyException: Invalid property 'myDao' of bean class [cn.nihaopiaoliang.service.impl.MyServiceImpl]:
     * Bean property 'myDao' is not writable or has an invalid setter method.
     * Does the parameter type of the setter match the return type of the getter?
     *
     * 使用注解注入不需要写setter方法
     *
     */

    @Autowired
    private MyDao myDao;
    /*
    public void setMyDao(MyDao myDao) {
        this.myDao = myDao;
    }
    */

    @Override
    public void doStuff() {
        System.out.println("我在工作ing..");
        System.out.println("保存成功：" + myDao.save());

//        MyDao myDao1 = (MyDao) ApplicationUtil.getApplicationContext().getBean("myDaoImpl");
//        int i = myDao1.save();

    }

}
