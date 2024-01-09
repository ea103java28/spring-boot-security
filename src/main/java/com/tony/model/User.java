package com.tony.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    private String id;
    private String email;
    private String password;
    private UserAuthority authority;

    public static User getTestAdminUser() {
        var user = new User();
        user.id = "myadmin";
        user.email = "myadmin@gmail.com";
        user.password = "1234";
        user.authority = UserAuthority.ADMIN;

        return user;
    }

    public static User getTestNormalUser() {
        var user = new User();
        user.id = "mynormal";
        user.email = "mynormal@gmail.com";
        user.password = "1234";
        user.authority = UserAuthority.NORMAL;

        return user;
    }

    public static User getTestGuestUser() {
        var user = new User();
        user.id = "mytest";
        user.email = "mytest@gmail.com";
        user.password = "1234";
        user.authority = UserAuthority.GUEST;

        return user;
    }


}
