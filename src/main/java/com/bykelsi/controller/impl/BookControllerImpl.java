package com.bykelsi.controller.impl;

import com.bykelsi.Service.IBookService;
import com.bykelsi.controller.IBookController;
import com.bykelsi.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/book")
@Controller
public class BookControllerImpl implements IBookController {

    @Autowired
    private IBookService bookService ;

    @RequestMapping("findBookInfo")
    public Book findBookInfo(){
       return bookService.findBookInfo();
    }
}
