package cn.heweiming.project.novelty.mybatis;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.heweiming.project.novelty.mapper.SysUserMapper;
import cn.heweiming.project.novelty.model.SysUser;
import cn.heweiming.project.novelty.model.SysUserCriteria;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatis3Test {

    @Autowired
    private SysUserMapper userMapper;

    @Test
    public void testMyBatis() {
        System.out.println(userMapper);
    }

    @Test
    public void testUserMapper() {
//                for (int i = 100; i < 200; i++) {
//                    SysUser user = new SysUser();
//                    user.setMobile(i + "");
//                    user.setRealName("realName" + i);
//                    user.setUsername("username" + i);
//                    user.setActivity(i % 2 == 0 ? true : false);
//                    user.setCreateTime(new Date());
//                    int insert = userMapper.insert(user);
//                    System.out.println(user);
//        
//                }
//        long l = userMapper.countByExample(new SysUserCriteria());
//        System.out.println(l);
        

        SysUserCriteria criteria = null;
        RowBounds rowBounds = new RowBounds(0, 25);
        List<SysUser> users = userMapper.selectByExampleWithRowbounds(criteria, rowBounds);
        for (SysUser user : users) {
            System.out.println(user);
        }
    }

}
