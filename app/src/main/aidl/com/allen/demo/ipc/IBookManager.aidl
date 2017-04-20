// IBookManager.aidl
package com.allen.demo.ipcdemo;

// Declare any non-default types here with import statements
//尽管在同一个包下，仍然需要导入Book类
import com.allen.demo.ipcdemo.Book;

interface IBookManager {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
         List<Book> getBookList();
    void addBook(in Book book);
}
