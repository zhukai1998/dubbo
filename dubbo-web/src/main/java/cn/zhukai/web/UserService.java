package cn.zhukai.web;


import cn.zhukai.service.module.user.IUserDao;
import cn.zhukai.service.module.user.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * <p>
 *
 * </p>
 *
 * @author zhukai
 * @date 2022/4/23 16:11
 **/
public enum UserService {
    INSTANCE;

    private IUserDao iUserDao;
    @Component
    private static class UserServiceHolder {

        @DubboReference
        private IUserDao iUserDao;

        @PostConstruct
        public void postConstruct() {
            UserService.values()[0].setInstance(iUserDao);
        }
    }

    private void setInstance(IUserDao iUserDao) {
        this.iUserDao = iUserDao;
    }

    public String init() {
        return iUserDao.init();
    }

    public User user(String key) {
        return iUserDao.user(key);
    }

}
