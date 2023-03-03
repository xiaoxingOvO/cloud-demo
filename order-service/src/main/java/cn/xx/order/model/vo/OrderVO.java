package cn.xx.order.model.vo;

import cn.xx.order.model.dto.OrderDTO;
import cn.xx.order.model.dto.UserDTO;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class OrderVO implements Serializable {
    /**
     * 订单id
     */
    @TableId
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品数量
     */
    private Integer num;

    public UserDTO user;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    public String getId() {
        return id;
    }

    /**
     * 订单id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 商品数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 商品数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public static OrderVO buildApiVO(OrderDTO orderDTO){
        OrderVO orderVO = new OrderVO();
        orderVO.setId(orderDTO.getId());
        orderVO.setName(orderDTO.getName());
        orderVO.setNum(orderDTO.getNum());
        orderVO.setPrice(orderDTO.getPrice());
        orderVO.setUserId(orderDTO.getUserId());
        return orderVO;
    }


}
