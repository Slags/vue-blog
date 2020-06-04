package com.willis.service.impl;

import com.willis.entity.Blog;
import com.willis.mapper.BlogMapper;
import com.willis.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author willis
 * @since 2020-06-03
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
