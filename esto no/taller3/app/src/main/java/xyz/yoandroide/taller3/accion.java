package xyz.yoandroide.taller3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class accion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorias);
    }

    //Metodo del boton 'Siguiente'
    public void Siguientedbz(View view){
        Intent siguientedbz = new Intent(this, DragonActivity.class);
        startActivity(siguientedbz);
    }

    public void Siguientewar(View view){
        Intent siguientewar = new Intent(this, warzon.class);
        startActivity(siguientewar);
    }


}
