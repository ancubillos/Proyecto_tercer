package com.example.usuario.proyecto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void env(View view){
        Intent j = new Intent(this,Naruto.class);
        startActivity(j);

    }
    public void envi(View view){
        Intent j = new Intent(this,Dragon.class);
        startActivity(j);

    }
    public void envir(View view){
        Intent j = new Intent(this,Bleach.class);
        startActivity(j);

    }
    public void enviar(View view){
        Intent j = new Intent(this,One_Piece.class);
        startActivity(j);

    }
}
