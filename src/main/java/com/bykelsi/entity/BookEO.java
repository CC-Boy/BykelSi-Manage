package com.bykelsi.entity;

public class BookEO {
    private Integer id;

    private String bookindex;

    private String bookname;

    private String bookauther;

    private Double booksize;

    private String complete;

    private String systemcode;

    private String systemname;

    private String readable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookindex() {
        return bookindex;
    }

    public void setBookindex(String bookindex) {
        this.bookindex = bookindex == null ? null : bookindex.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getBookauther() {
        return bookauther;
    }

    public void setBookauther(String bookauther) {
        this.bookauther = bookauther == null ? null : bookauther.trim();
    }

    public Double getBooksize() {
        return booksize;
    }

    public void setBooksize(Double booksize) {
        this.booksize = booksize;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete == null ? null : complete.trim();
    }

    public String getSystemcode() {
        return systemcode;
    }

    public void setSystemcode(String systemcode) {
        this.systemcode = systemcode == null ? null : systemcode.trim();
    }

    public String getSystemname() {
        return systemname;
    }

    public void setSystemname(String systemname) {
        this.systemname = systemname == null ? null : systemname.trim();
    }

    public String getReadable() {
        return readable;
    }

    public void setReadable(String readable) {
        this.readable = readable == null ? null : readable.trim();
    }
}