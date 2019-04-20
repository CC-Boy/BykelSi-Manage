package com.bykelsi.service.impl;

import com.bykelsi.service.IBookService;
import com.bykelsi.entity.BookEO;
import com.bykelsi.repository.BookEOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    public  BookEOMapper bookEOMapper ;

    @Override
    public List<BookEO> getBookAll(){
        return  bookEOMapper.getBookEOAll();
    }
}
