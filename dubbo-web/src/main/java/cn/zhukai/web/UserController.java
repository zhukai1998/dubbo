package cn.zhukai.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author zhukai
 * @date 2022/4/23 16:16
 **/

@RestController
@RequestMapping("/zhukai/user")
public class UserController {

    @GetMapping("init")
    public String init() {
        return UserService.INSTANCE.init();
    }

    @GetMapping("one/{key}")
    public String one(@PathVariable(value = "key")String key) {
        return UserService.INSTANCE.user(key).toString();
    }


}
