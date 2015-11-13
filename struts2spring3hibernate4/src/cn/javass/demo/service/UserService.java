package cn.javass.demo.service;

import cn.javass.common.pagination.Page;
import cn.javass.common.service.IBaseService;
import cn.javass.demo.model.UserModel;
import cn.javass.demo.model.UserQueryModel;

/**
 * User: Zhang Kaitao
 * Date: 12-1-4 上午10:13
 * Version: 1.0
 */
public interface UserService extends IBaseService<UserModel, Integer> {

    Page<UserModel> query(int pn, int pageSize, UserQueryModel command);
}
