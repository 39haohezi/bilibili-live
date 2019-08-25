package cn.zengjiandong.dao.impl;

import cn.zengjiandong.dao.MyDao;
import org.springframework.stereotype.Repository;

@Repository
public class MyDaoImpl implements MyDao {

    @Override
    public int save() {
        System.out.println("保存数据中ing");
        return 1;
    }

}
