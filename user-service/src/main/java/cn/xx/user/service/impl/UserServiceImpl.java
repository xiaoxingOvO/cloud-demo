package cn.xx.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.xx.user.pojo.User;
import cn.xx.user.service.UserService;
import cn.xx.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
* @author xiaoxing
* @description 针对表【tb_user】的数据库操作Service实现
* @createDate 2023-03-01 14:01:29
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findById(String id) {
        return Optional.ofNullable(userMapper.selectById(id)).orElse(null);
    }
}




