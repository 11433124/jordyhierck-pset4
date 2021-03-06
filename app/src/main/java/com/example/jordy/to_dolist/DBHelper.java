package com.example.jordy.to_dolist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Jordy on 25-11-2016.
 */

public class DBHelper extends SQLiteOpenHelper {

        // Table Name
        public static final String TABLE_NAME = "COUNTRIES";

        // Table columns
        public static final String _ID = "_id";
        public static final String SUBJECT = "subject";
        public static final String DESC = "description";

        // Database Information
        static final String DB_NAME = "JOURNALDEV_COUNTRIES.DB";

        // database version
        static final int DB_VERSION = 1;

        // Creating table query
        private static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" + _ID
                + " INTEGER PRIMARY KEY AUTOINCREMENT, " + SUBJECT + " TEXT NOT NULL, " + DESC + " TEXT);";

        public DBHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(db);
        }
}