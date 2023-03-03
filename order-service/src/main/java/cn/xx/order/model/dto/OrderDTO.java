package cn.xx.order.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @TableName tb_order
 */
@TableName(value ="tb_order")
public class OrderDTO implements Serializable {
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OrderDTO other = (OrderDTO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
