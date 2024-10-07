package com.shanzhu.cm.service;

import com.shanzhu.cm.domain.SysMovieCategory;
import com.shanzhu.cm.domain.SysMovieToCategory;

import java.util.List;

/**
 * 电影分类服务层
 *
 * @author: ShanZhu
 * @date: 2023-12-11
 */
public interface SysMovieCategoryService {

    List<SysMovieCategory> findAllCategorys();

    SysMovieCategory findCategoryById(Long id);

    int addCategory(SysMovieCategory sysMovieCategory);

    int updateCategory(SysMovieCategory sysMovieCategory);

    int deleteCategory(Long[] ids);

    int addMovieToCategory(SysMovieToCategory sysMovieToCategory);

    int deleteMovieToCategory(SysMovieToCategory sysMovieToCategory);


}
