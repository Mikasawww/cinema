package com.shanzhu.cm.mapper;

import com.shanzhu.cm.domain.SysCinema;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SysCinemaMapper {

    SysCinema findCinema();

    int updateCinema(SysCinema sysCinema);

    SysCinema findCinemaById(Long id);

}
