package cn.zhukai.service.module.user;


/**
 * <p>
 *
 * </p>
 *
 * @author zhukai
 * @date 2022/4/23 17:32
 **/
public interface IUserDao {
    String init();
    User user(String key);
}
