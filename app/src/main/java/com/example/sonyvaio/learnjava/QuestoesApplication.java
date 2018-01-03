package com.example.sonyvaio.learnjava;

import android.app.Application;

import com.example.sonyvaio.learnjava.database.DBController;
import com.example.sonyvaio.learnjava.entidades.Pergunta;
import com.example.sonyvaio.learnjava.entidades.Resposta;

import java.util.List;

/**
 * Created by sony vaio on 27/04/2016.
 */
public class QuestoesApplication extends Application {
    DBController dbController;

    @Override
    public void onCreate() {
        super.onCreate();
        dbController = new DBController(getBaseContext());
    }

    public List<Pergunta> getPerguntaTipo(String tipo) {
        return dbController.getPerguntaTipo(tipo);

    }
}
