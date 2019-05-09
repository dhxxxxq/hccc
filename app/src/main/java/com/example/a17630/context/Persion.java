package com.example.a17630.context;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by 17630 on 2019/4/26.
 */

public class Persion implements Parcelable {
    private String name;
    private int age;
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);//写出name
        parcel.writeInt(age);//写出age

    }
    public static final Parcelable.Creator<Persion> CREATOR=new Parcelable.Creator<Persion>(){

        public Persion createFromParcel(Parcel source){
            Persion persion=new Persion();
            persion.name=source.readString();//读取name
            persion.age=source.readInt();//读取age
            return persion;
        }
        public Persion[] newArray(int size){
            return new Persion[size];
        }
    };
}
