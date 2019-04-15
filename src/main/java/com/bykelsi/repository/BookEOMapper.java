package com.bykelsi.repository;

import com.bykelsi.entity.BookEO;

import java.util.List;

public interface BookEOMapper {
    int deleteByExample(BookEOExample example);

    int insert(BookEO record);

    int insertSelective(BookEO record);

    List<BookEO> selectByExample(BookEOExample example);
}