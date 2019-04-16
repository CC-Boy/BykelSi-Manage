package com.bykelsi.repository ;

import com.bykelsi.entity.BookEO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


@Component
@Mapper
public interface BookEOMapper {
//   public  int insert(BookEO record);
//
//   public  int insertSelective(BookEO record);

    @Select("select * from BookEO ")
   public  BookEO getBookEOPages();
}