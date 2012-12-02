package com.example.project381;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {

	
	private static final String KEY_LANGUAGE = "language";
	private static final String KEY_FILE_NAME = "file_name";
	
	private static final int DATABASE_VERSION = 1;
	private static final String DICTIONARY_TABLE_NAME = "files";
	private static final String DICTIONARY_TABLE_CREATE = "CREATE TABLE " + DICTIONARY_TABLE_NAME +
			"(" + KEY_FILE_NAME + " TEXT" + ")";
	
	public DatabaseHandler(Context context) {
        super(context, DICTIONARY_TABLE_NAME, null, DATABASE_VERSION);
    }
	
	public DatabaseHandler(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DICTIONARY_TABLE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + DICTIONARY_TABLE_NAME);
		onCreate(db);
	}

	public void addDocument(ProjectTextView document) {
		SQLiteDatabase db = this.getWritableDatabase();
		
		ContentValues values = new ContentValues();
		values.put(KEY_FILE_NAME, document.getFileName());
		
		db.insert(DICTIONARY_TABLE_NAME, null, values);
		db.close();
	}
	
	public void deleteDocument(ProjectTextView document) {
		SQLiteDatabase db = this.getWritableDatabase();
		
		db.delete(DICTIONARY_TABLE_NAME, KEY_FILE_NAME + " = ?", new String[] { String.valueOf(document.getFileName()) } );
	}
	
}
