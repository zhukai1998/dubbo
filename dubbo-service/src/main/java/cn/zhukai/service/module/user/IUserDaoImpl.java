package cn.zhukai.service.module.user;

import cn.zhukai.service.module.user.IUserDao;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author zhukai
 * @date 2022/4/23 17:32
 **/

@DubboService
public class IUserDaoImpl implements IUserDao {
    @Override
    public String init() {return "hello world";}

    @Override
    public User user(String key) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new User
                .Builder(key)
                .setID(key)
                .setAccount(key)
                .setPassword(key)
                .build();
    }

}
