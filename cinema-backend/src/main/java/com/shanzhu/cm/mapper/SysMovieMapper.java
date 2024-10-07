package com.shanzhu.cm.mapper;

import com.shanzhu.cm.domain.SysMovie;
import com.shanzhu.cm.domain.vo.SysMovieVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SysMovieMapper {

    List<SysMovie> findAllMovies(SysMovieVo sysMovieVo);

    SysMovie findMovieById(Long id);

    SysMovie findOneMovie(Long id);

    int addMovie(SysMovie sysMovie);

    int updateMovie(SysMovie sysMovie);

    int deleteMovie(Long id);

    List<SysMovie> findMovieByCinemaId(Long id);

    List<SysMovie> totalBoxOfficeList();

    List<SysMovie> domesticBoxOfficeList();

    List<SysMovie> foreignBoxOfficeList();

}
