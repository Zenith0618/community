package com.learn.community;

import com.learn.community.dao.DiscussPostMapper;
import com.learn.community.dao.UserMapper;
import com.learn.community.entity.DiscussPost;
import com.learn.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DiscussPostMapper discussPostMapper;
    @Test
    public void testSelect(){
        User user = userMapper.selectById(101);
        System.out.println(user);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("abcd123");
    }

    @Test
    public void testSelectPosts(){
        List<DiscussPost> posts = discussPostMapper.selectDiscussPosts(149, 0, 10);
        for (DiscussPost post : posts) {
            System.out.println(post.toString());
        }

        int rows = discussPostMapper.selectDiscussPostsRows(149);
        System.out.println(rows);
    }


}
