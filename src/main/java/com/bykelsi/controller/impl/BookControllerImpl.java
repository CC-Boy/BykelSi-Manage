package com.bykelsi.controller.impl;

import com.bykelsi.service.IBookService;
import com.bykelsi.controller.IBookController;
import com.bykelsi.entity.BookEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookControllerImpl implements IBookController {


    @Autowired
    IBookService bookService ;

    @Override
    @RequestMapping("findAllBooks")
    public List<BookEO> findAllBooks(){
        return bookService.getBookAll() ;
    }

}
