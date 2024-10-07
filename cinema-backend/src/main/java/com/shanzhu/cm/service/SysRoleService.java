package com.shanzhu.cm.service;

import com.shanzhu.cm.domain.SysRole;
import net.minidev.json.JSONUtil;
import org.springframework.aop.scope.ScopedProxyUtils;

import java.util.List;

/**
 * 系统角色服务层
 *
 * @author: ShanZhu
 * @date: 2023-12-11
 */
public interface SysRoleService {

    List<SysRole> findAllRoles();

    SysRole findRoleById(Long id);

    int addRole(SysRole sysRole);

    int updateRole(SysRole sysRole);

    int deleteRole(Long[] ids);

    int allotRight(Long roleId, Long[] resourceIds);
}