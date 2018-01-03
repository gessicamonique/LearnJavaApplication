package com.example.sonyvaio.learnjava.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by sony vaio on 26/04/2016.
 */
public class DBCore extends SQLiteOpenHelper{

    private static final String DBNAME ="LearnJavaDB";
    private static final int DBVERSION = 1;

    private DBCode code;

    public DBCore (Context context){
        super(context,DBNAME,null,DBVERSION);
        code = new DBCode();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        for (String s : code.createTables()){
            db.execSQL("CREATE TABLE " + s);
        }

        for (String s : code.insertTables()){
            db.execSQL("INSERT INTO " + s);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE pergunta");
        db.execSQL("DROP TABLE resposta");
    }
}
