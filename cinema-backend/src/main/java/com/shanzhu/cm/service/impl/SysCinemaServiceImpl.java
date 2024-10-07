package com.shanzhu.cm.service.impl;

import com.shanzhu.cm.domain.SysCinema;
import com.shanzhu.cm.mapper.SysCinemaMapper;
import com.shanzhu.cm.service.SysCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 电影院服务层接口实现类
 *
 * @author: ShanZhu
 * @date: 2023-12-11
 */
@Service
public class SysCinemaServiceImpl implements SysCinemaService {

    @Autowired
    private SysCinemaMapper sysCinemaMapper;

    @Override
    public SysCinema findCinema() {
        return sysCinemaMapper.findCinema();
    }

    @Override
    public int updateCinema(SysCinema sysCinema) {
        return sysCinemaMapper.updateCinema(sysCinema);
    }

    @Override
    public SysCinema findCinemaById(Long id) {
        return sysCinemaMapper.findCinemaById(id);
    }
}
