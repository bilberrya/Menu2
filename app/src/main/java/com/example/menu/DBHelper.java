package com.example.menu;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "McDonaldsDb";
    public static final String TABLE_MENU = "Menu";

    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_PRICE = "price";

    public DBHelper(MainActivity context) { super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DBHelper(MainActivity2 context) { super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_MENU + " (" +
                KEY_ID + " integer primary key," +
                KEY_NAME + " text," +
                KEY_PRICE + " float" + ")");
        }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists " + TABLE_MENU);
        onCreate(db);
    }
}
