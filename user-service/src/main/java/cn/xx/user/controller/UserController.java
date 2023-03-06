package cn.xx.user.controller;

import cn.xx.user.pojo.User;
import cn.xx.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.shenyu.client.springcloud.annotation.ShenyuSpringCloudClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
@RequestMapping("/user")
@Api(value = "用户接口管理",tags = "用户接口管理")
//@RefreshScope
@ShenyuSpringCloudClient
public class UserController {

    @Autowired
    private UserService userService;

//    @Value("${pattern.dataformat}")
//    private String dateformat;
//
//    @Value("${pattern.envSharedValue}")
//    private String envSharedValue;

    /**
     * @param id 用户id
     * @return 用户
     */
    @ApiOperation("根据id查询用户")
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") String id) {
        return userService.findById(id);
    }

//    @ApiOperation("返回当前时间")
//    @GetMapping("/now")
//    public String now() {
//        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
//    }
//
//
//    @ApiOperation("返回共享属性值")
//    @GetMapping("/prop")
//    public String prop(){
//        return envSharedValue;
//    }

}
