package com.learn.community.service;

import com.learn.community.dao.DiscussPostMapper;
import com.learn.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> selectDiscussPosts(int userId, int offset, int pageSize){
        return discussPostMapper.selectDiscussPosts(userId, offset, pageSize);
    }

    public int selectPostsRows(int userId){
        return discussPostMapper.selectDiscussPostsRows(userId);
    }
}
