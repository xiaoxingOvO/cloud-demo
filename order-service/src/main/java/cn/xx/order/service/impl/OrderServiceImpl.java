package cn.xx.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.xx.order.model.dto.OrderDTO;
import cn.xx.order.service.OrderService;
import cn.xx.order.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
* @author xiaoxing
* @description 针对表【tb_order】的数据库操作Service实现
* @createDate 2023-03-01 14:01:40
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderDTO>
    implements OrderService{

    private OrderMapper orderMapper;

    public OrderServiceImpl(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Override
    public OrderDTO findById(String orderId) {
        return Optional.ofNullable(orderMapper.selectById(orderId)).orElse(null);
    }
}




