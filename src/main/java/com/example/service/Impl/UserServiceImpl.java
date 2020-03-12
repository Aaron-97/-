package com.example.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Mapper.UserMapper;
import com.example.po.User;
import com.example.service.MailService;
import com.example.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
          * 注入邮件接口
     */
    @Autowired
    private MailService mailService;

    /**
          * 用户注册，同时发送一封激活邮件
     * @param user
     */
    @Override
    public void register(User user) {
    	
    	userMapper.register(user);
        //获取激活码
        String code = user.getCode();
        System.out.println("code:"+code);
        //主题
        String subject = "激活邮件";
        //user/checkCode?code=code(激活码)是我们点击邮件链接之后根据激活码查询用户，如果存在说明一致，将用户状态修改为“1”激活
        //把激活码发送到用户注册邮箱
        String context = "<a href=\"http://localhost:8080/checkCode?code="+code+"\">点击本链接激活登录</a>";
        //发送激活邮件
        mailService.sendHtmlMail (user.getEmail(),subject,context);
    }

    /**
          * 根据激活码code进行查询用户，之后再进行修改状态
     */
    @Override
    public User checkCode(String code) {

        return userMapper.checkCode(code);
    }

    /**
     * 激活账户，修改用户状态
     * @param user
     */
    @Override
    public void updateUserStatus(User user) {
        userMapper.updateUserStatus(user);
    }

    /**
     * 登录
     * @param user
     * @return
     */
    @Override
    public User loginUser(User user) {
        User user1 = userMapper.loginUser(user);
        if (user1 !=null){
            return user1;
        }
        return null;
    }

	@Override
	public void insert(User t) {
		// TODO Auto-generated method stub
		userMapper.insert(t);
	}

	@Override
	public void update(User t) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(t);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userMapper.selectByExample(null);
	}

	@Override
	public User selectByEmail(String email) {
		// TODO Auto-generated method stub
		return userMapper.selectByEmail(email);
	}
}
