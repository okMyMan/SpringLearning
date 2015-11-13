package cn.javass.demo.dao;

import java.util.List;

import cn.javass.common.dao.IBaseDao;
import cn.javass.demo.model.UserModel;
import cn.javass.demo.model.UserQueryModel;


public interface UserDao extends IBaseDao<UserModel, Integer> {
    
    List<UserModel> query(int pn, int pageSize, UserQueryModel command);

    int countQuery(UserQueryModel command);

}
