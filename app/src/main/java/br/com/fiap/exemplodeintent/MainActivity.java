package br.com.fiap.exemplodeintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrir(View v){
        Intent it = new Intent(this, OtherActivity.class);
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fernando Mazola");
        pessoa.setIdade(20);
        pessoa.setDeficiente(false);


        //it.putExtra("nome", "Fernando Mazola");
        //it.putExtra("idade", 20);
        //it.putExtra("deficiente", false);
        startActivity(it);
    }
}
