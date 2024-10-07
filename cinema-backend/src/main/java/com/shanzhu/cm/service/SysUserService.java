package com.shanzhu.cm.service;

import com.shanzhu.cm.domain.LoginUser;
import com.shanzhu.cm.domain.SysUser;
import com.shanzhu.cm.domain.vo.SysUserVo;

import java.util.List;

/**
 * 用户相关 服务层
 *
 * @author: ShanZhu
 * @date: 2023-12-11
 */
public interface SysUserService {

    List<SysUser> findAllUsers(SysUser sysUser);

    SysUser findUserById(Long id);

    SysUser findUserByName(String userName);

    int addUser(SysUser sysUser);

    int updateUser(SysUser sysUser);

    int deleteUser(Long[] ids);

    LoginUser login(SysUserVo sysUserVo);

    LoginUser findLoginUser(SysUserVo sysUserVo);

    boolean isUserNameUnique(String userName, Long userId);
}
