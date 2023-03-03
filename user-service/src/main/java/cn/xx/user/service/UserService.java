package cn.xx.user.service;

import cn.xx.user.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author xiaoxing
* @description 针对表【tb_user】的数据库操作Service
* @createDate 2023-03-01 14:01:29
*/
public interface UserService extends IService<User> {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User findById(String id);

}
