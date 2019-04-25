package com.example.boot;

import com.BootApplication;
import com.imooc.entity.User;
import com.imooc.mapper.UserMapper;
import com.imooc.model.MyPage;
import com.imooc.utils.JsonUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplication.class)
@WebAppConfiguration
public class BootApplicationTests {


    @Resource
    private UserMapper userMapper;


    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void tt() {

        Random r = new Random();
        System.out.println(r.nextInt(1));
        /**
         *测试redis缓存
         */
//        User u3 = new User();
//        u3.setUserName("aa");
//        u3.setUserPassword("aaa");
//        u3.setId(1);
//        stringRedisTemplate.opsForValue().set("user", JsonUtils.objectToJson(u3));
//        System.out.println(JsonUtils.jsonToPojo(stringRedisTemplate.opsForValue().get("user"), User.class));


//        System.out.println("----- 自定义 XML 分页 ------");
        // MyPage<User> myPage = new MyPage<User>(1, 5);
        //.setSelectInt(20).setSelectStr("Jack");
//        ParamSome paramSome = new ParamSome(20, "Jack");
//        User user = new User();
//
//
////
//        MyPage<User> userMyPage = userMapper.mySelectPage(myPage, null);
//        Assert.assertSame(myPage, userMyPage);
//        System.out.println("总条数 ------> " + userMyPage.getTotal());
//        System.out.println("当前页数 ------> " + userMyPage.getCurrent());
//        System.out.println("当前每页显示数 ------> " + userMyPage.getSize());
//        print(userMyPage.getRecords());
//        System.out.println("----- 自定义 XML 分页 ------");
    }

    private <T> void print(List<T> list) {
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(System.out::println);
        }
    }

}
