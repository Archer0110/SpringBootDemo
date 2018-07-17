package llx.example.demo01.service.impl;

import llx.example.demo01.dao.AreaDao;
import llx.example.demo01.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceImplTest {
    //通过spring容器注入Dao的实现类
    @Autowired
    private AreaDao areaDao;
    @Test
    public void getAreaList() {
        List<Area> areaList = areaDao.queryArea();
        // 验证预期值和实际值是否相符
        assertEquals(2, areaList.size());
    }

    @Test
    public void getAreaById() {
    }

    @Test
    public void addArea() {
    }

    @Test
    public void modifyArea() {
    }

    @Test
    public void deleteArea() {
    }
}