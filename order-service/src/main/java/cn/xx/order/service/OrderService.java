package cn.xx.order.service;

import cn.xx.order.model.dto.OrderDTO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author xiaoxing
* @description 针对表【tb_order】的数据库操作Service
* @createDate 2023-03-01 14:01:40
*/
public interface OrderService extends IService<OrderDTO> {

    /**
     * 根据id查询订单
     * @param orderId
     * @return
     */
    OrderDTO findById(String orderId);

}
