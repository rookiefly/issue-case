package com.rookiefly.issue.mybatiscase;

import com.rookiefly.issue.mybatiscase.mapper.GorderMapper;
import com.rookiefly.issue.mybatiscase.model.Gorder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisCaseApplicationTests {

    @Autowired
    private GorderMapper gorderMapper;

    @Test
    public void contextLoads() {

    }

    @Test
    public void testMybatisNestedMap(){
        List<Gorder> gorderList = gorderMapper.gorderListNested("rookiefly@163.com");
        Assert.assertEquals(1, gorderList.size());
        Gorder gorder = gorderList.get(0);
        Assert.assertEquals(2, gorder.getOrderList().size());
    }
}
