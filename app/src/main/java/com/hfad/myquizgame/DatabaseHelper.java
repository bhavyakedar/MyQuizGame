package com.hfad.myquizgame;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static String DB_NAME = "Database";
    public static int DB_VERSION = 0;

    DatabaseHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE BESTSCORE(INTEGER BESTSCORE)");
    }

    public void onUpgrade(SQLiteDatabase db,int oldversion,int newversion){

    }

}
