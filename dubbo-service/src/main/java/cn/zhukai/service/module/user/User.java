package cn.zhukai.service.module.user;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zhukai
 * @date 2022/4/23 18:10
 **/


public class User implements Serializable {
    private final String group;
    private final String id;
    private final String account;
    private final String password;

    private User(Builder builder) {
        group = builder.group;
        id = builder.id;
        account = builder.account;
        password = builder.password;
    }

    @Override
    public String toString() {
        return "User{" +
                "group='" + group + '\'' +
                ", id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder {
        private final String group;
        private String id;
        private String account;
        private String password;

        public Builder(String group) {
            this.group = group;
        }

        public Builder setID(String id) {
            this.id = id;
            return this;
        }
        public Builder setAccount(String account) {
            this.account = account;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
