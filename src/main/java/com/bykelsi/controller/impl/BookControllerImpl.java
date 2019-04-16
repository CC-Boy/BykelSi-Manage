package com.bykelsi.controller.impl;

import com.bykelsi.controller.IBookController;
import com.bykelsi.entity.BookEO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookControllerImpl implements IBookController {

    @ResponseBody
    @RequestMapping("findAllBooks")
    public BookEO findAllBooks(){
        return null ;
    }

}
