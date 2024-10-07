package com.shanzhu.cm.mapper;

import com.shanzhu.cm.domain.LoginUser;
import com.shanzhu.cm.domain.SysUser;
import com.shanzhu.cm.domain.vo.SysUserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SysUserMapper {

    List<SysUser> findAllUsers(SysUser sysUser);

    SysUser findUserById(Long id);

    SysUser findUserByName(String userName);

    int addUser(SysUser sysUser);

    int updateUser(SysUser sysUser);

    int deleteUser(Long id);

    LoginUser findLoginUser(SysUserVo sysUserVo);

    List<Long> checkUserNameUnique(String userName);
}
