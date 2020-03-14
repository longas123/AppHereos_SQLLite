package com.example.appherois;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class HeroiDAO {

    public  static void inserir(Context context, Heroi heroi){
        Banco banco = new Banco(context);

        ContentValues valores = new ContentValues();
        valores.put("nome", heroi.getNome());
        valores.put("grupo", heroi.getGrupo());


        SQLiteDatabase db = banco.getWritableDatabase();
        db.insert("heroes", null, valores);
    }

}
