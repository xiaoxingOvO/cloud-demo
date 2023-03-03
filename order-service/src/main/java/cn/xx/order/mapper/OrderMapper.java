package cn.xx.order.mapper;

import cn.xx.order.model.dto.OrderDTO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author xiaoxing
* @description 针对表【tb_order】的数据库操作Mapper
* @createDate 2023-03-01 14:01:40
* @Entity cn.xx.order.pojo.Order
*/
@Mapper
public interface OrderMapper extends BaseMapper<OrderDTO> {

}




