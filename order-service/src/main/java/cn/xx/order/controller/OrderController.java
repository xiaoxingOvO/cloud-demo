package cn.xx.order.controller;

import cn.xx.order.client.UserClient;
import cn.xx.order.model.dto.OrderDTO;
import cn.xx.order.model.dto.UserDTO;
import cn.xx.order.model.vo.OrderVO;
import cn.xx.order.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("order")
@Api(value = "订单接口管理",tags = "订单接口管理")
//@ShenyuSpringCloudClient("/order/**")
public class OrderController {

   private OrderService orderService;
   private RestTemplate restTemplate;
   private UserClient userClient;

    public OrderController(OrderService orderService, RestTemplate restTemplate,UserClient userClient) {
        this.orderService = orderService;
        this.restTemplate = restTemplate;
        this.userClient = userClient;
    }

    @ApiOperation("根据id查询订单 ")
    @GetMapping("{orderId}")
    public OrderVO findById(@PathVariable("orderId") String orderId) {
        // 根据id查询订单并返回
        OrderDTO orderDTO = orderService.findById(orderId);
        //远程调用获取user信息
//        String url = "http://localhost:8081/user/"+orderDTO.getUserId();
        String url = "http://userservice/user/"+orderDTO.getUserId();
        //使用restTemplate
//        UserDTO user = restTemplate.getForObject(url, UserDTO.class);

        UserDTO user = userClient.findById(orderDTO.getUserId());
        OrderVO orderVO = OrderVO.buildApiVO(orderDTO);
        orderVO.setUser(user);
        return orderVO;
    }
}
