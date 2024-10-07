package com.shanzhu.cm.mapper;

import com.shanzhu.cm.domain.SysSession;
import com.shanzhu.cm.domain.vo.SysSessionVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SysSessionMapper {

    List<SysSession> findByVo(SysSessionVo sysSessionVo);

    List<SysSession> findSessionByMovieIdOrHallId(SysSession sysSession);

    SysSession findSessionById(Long id);

    SysSession findOneSession(Long id);

    int addSession(SysSession sysSession);

    int updateSession(SysSession sysSession);

    int deleteSession(Long id);

    List<SysSession> findSessionByMovieId(Long movieId);

}
