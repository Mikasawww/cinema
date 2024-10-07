package com.shanzhu.cm.service;

import com.shanzhu.cm.domain.SysHall;

import java.util.List;

/**
 * 观影排座服务层
 *
 * @author: ShanZhu
 * @date: 2023-12-11
 */
public interface SysHallService {

    List<SysHall> findAllHalls(SysHall sysHall);

    SysHall findHallById(SysHall sysHall);

    int addHall(SysHall sysHall);

    int updateHall(SysHall sysHall);

    int deleteHall(SysHall[] sysHall);
}
