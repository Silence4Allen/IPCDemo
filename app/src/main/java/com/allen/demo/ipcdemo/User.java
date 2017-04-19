package com.allen.demo.ipcdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Allen on 2017/4/4.
 */

public class User implements Parcelable {
    public int userId;
    public String userName;
    public boolean isMale;

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }

    private User(Parcel in) {
        userId = in.readInt();
        userName = in.readString();
        isMale = in.readInt()==1;

    }
}
