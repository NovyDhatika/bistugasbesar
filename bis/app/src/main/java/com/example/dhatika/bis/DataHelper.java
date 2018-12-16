package com.example.dhatika.bis;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "catatanku.db";
    private static final int DATABASE_VERSION = 1;

    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//	TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//	TODO Auto-generated method stub
      /*  String sql = "create table pasien(id_pasien integer primary key,nama text null, keluhan text null,id_dokter integer not null ,foreign key(id_dokter) references dokter(id_dokter));";
        Log.d("Data Pasien", "onCreate: " + sql);
        db.execSQL(sql);*/
        String sql2 = "create table catatan(id_catatan integer primary key,tgl_catatan text, judul_catatan text, isi_catatan text not null);";
        Log.d("Data Catatan", "onCreate: " );
        db.execSQL(sql2);
        String sql3 = "INSERT INTO catatan(id_catatan, tgl_catatan, judul_catatan, isi_catatan)VALUES ('1', '2018-12-17','Tugasku', 'Lakukan amanah orang tua' );";
        db.execSQL(sql3);
    /*    String sql4 = "INSERT INTO pasien(id_pasien,nama,keluhan,id_dokter) VALUES ('1', 'Rahmat','Pusing','1'),('2', 'Jaenal','Gatal','2');";
        db.execSQL(sql4);*/
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2)
    {
//	TODO Auto-generated method stub
    }
}
