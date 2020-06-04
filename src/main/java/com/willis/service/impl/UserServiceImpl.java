package com.willis.service.impl;

import com.willis.entity.User;
import com.willis.mapper.UserMapper;
import com.willis.service.UserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
