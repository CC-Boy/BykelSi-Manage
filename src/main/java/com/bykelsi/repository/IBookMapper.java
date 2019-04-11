package com.bykelsi.repository;

import com.bykelsi.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookMapper {

    public  List<Book> findBookInfo() ;
}
