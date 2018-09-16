package cn.xxm.mybatisplus.service.impl;

import cn.xxm.mybatisplus.pojo.User;
import cn.xxm.mybatisplus.dao.UserDao;
import cn.xxm.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Xxm123
 * @since 2018-09-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

}
