package com.example.service;

import com.example.po.User;

public interface UserService extends BaseService<User, Integer>{
	
	 /**
     * 用户注册,
     * @param user
     */
    void register(User user);

    /**
     * 根据激活码code查询用户，之后再进行修改状态
     * @param code
     * @return
     */
    User checkCode(String code);

    /**
     * 激活账户，修改用户状态为“1”
     * @param user
     */
    void updateUserStatus(User user);

    /**
     * 登录
     * @param user
     * @return
     */
    User loginUser(User user);

    
    User selectByEmail(String email);
}
