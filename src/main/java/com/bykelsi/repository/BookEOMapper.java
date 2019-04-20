package com.bykelsi.repository;

import com.bykelsi.entity.BookEO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BookEOMapper {
    int insert(BookEO record);

    int insertSelective(BookEO record);

    @Select("select * from book")
    public List<BookEO> getBookEOAll();
}