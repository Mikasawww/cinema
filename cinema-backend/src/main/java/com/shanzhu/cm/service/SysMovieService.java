package com.shanzhu.cm.service;

import com.shanzhu.cm.domain.SysMovie;
import com.shanzhu.cm.domain.vo.SysMovieVo;

import java.util.List;

/**
 * 电影服务层
 *
 * @author: ShanZhu
 * @date: 2023-12-11
 */
public interface SysMovieService {

    List<SysMovie> findAllMovies(SysMovieVo sysMovieVo);

    SysMovie findMovieById(Long id);

    SysMovie findOneMovie(Long id);

    int addMovie(SysMovie sysMovie);

    int updateMovie(SysMovie sysMovie);

    int deleteMovie(Long[] ids);

    List<SysMovie> totalBoxOfficeList();

    List<SysMovie> domesticBoxOfficeList();

    List<SysMovie> foreignBoxOfficeList();

}
