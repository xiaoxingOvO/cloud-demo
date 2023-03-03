package cn.xx.user.mapper;

import cn.xx.user.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author xiaoxing
* @description 针对表【tb_user】的数据库操作Mapper
* @createDate 2023-03-01 14:01:29
* @Entity cn.xx.user.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




