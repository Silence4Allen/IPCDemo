package com.allen.demo.ipcdemo;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

import java.util.List;

/**
 * Created by Allen on 2017/4/8.
 */

public interface IBookManagerNew extends IInterface {
    static final String DESCRIPTOR = "com.allen.demo.ipcdemo.IBookManagerNew";
    static final int TRANSACTION_getBookList = IBinder.FIRST_CALL_TRANSACTION + 0;
    static final int TRANSACTION_addBook = IBinder.FIRST_CALL_TRANSACTION + 1;

    public List<Book> getBookList() throws RemoteException;

    public void addBook(Book book) throws RemoteException;

}
