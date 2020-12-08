package com.learn.community.dao;

import com.learn.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int pageSize);

    // 若方法只有一个参数，并且在<if>中使用，必须使用@Param注解为参数加别名
    int selectDiscussPostsRows(@Param("userId") int userId);

}
