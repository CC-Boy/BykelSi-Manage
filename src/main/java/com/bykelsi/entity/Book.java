package com.bykelsi.entity;

public class Book {
    private Integer id ;
    private String bookIndex ;
    private String bookName ;
    private String bookAuther ;
    private String bookSize ;
    private boolean complete ;
    private String systemCode ;
    private String systemName ;
    private boolean readable ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookIndex() {
        return bookIndex;
    }

    public void setBookIndex(String bookIndex) {
        this.bookIndex = bookIndex;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuther() {
        return bookAuther;
    }

    public void setBookAuther(String bookAuther) {
        this.bookAuther = bookAuther;
    }

    public String getBookSize() {
        return bookSize;
    }

    public void setBookSize(String bookSize) {
        this.bookSize = bookSize;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public boolean isReadable() {
        return readable;
    }

    public void setReadable(boolean readable) {
        this.readable = readable;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", bookIndex='" + bookIndex + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuther='" + bookAuther + '\'' +
                ", bookSize='" + bookSize + '\'' +
                ", complete=" + complete +
                ", systemCode='" + systemCode + '\'' +
                ", systemName='" + systemName + '\'' +
                ", readable=" + readable +
                '}';
    }
}
