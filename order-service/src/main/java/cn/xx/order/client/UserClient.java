package cn.xx.order.client;

import cn.xx.order.model.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author xx
 * @date 2023/3/3
 */
@FeignClient("userservice")
public interface UserClient {
    @GetMapping("/user/findById/{id}")
    UserDTO findById(@PathVariable("id") String id);
}
