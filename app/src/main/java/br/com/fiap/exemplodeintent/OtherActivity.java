package br.com.fiap.exemplodeintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Intent it = getIntent();
        Pessoa pessoa = (Pessoa)it.getSerializableExtra("pessoa");

        //String nome = it.getStringExtra("nome");
        //int idade = it.getIntExtra("idade", 0);
        //boolean deficiente = it.getBooleanExtra("deficiente", false);


        TextView txtNome = (TextView)findViewById(R.id.txtNome);
        txtNome.setText(pessoa.getNome());
        TextView txtIdade = (TextView)findViewById(R.id.txtIdade);
        txtIdade.setText("Idade: " + pessoa.getIdade());
        TextView txtDef = (TextView)findViewById(R.id.txtDeficiente);


        /*OPERADOR TERNARIO*/
        String strDef = (pessoa.isDeficiente()) ? "A pessoa possui deficiencia":"A pessoa não possui deficiencia";
        txtDef.setText(strDef);

       /*
       FAZENDO COMPARAÇÃO COM IF
       if(deficiente == false){
            txtDef.setText("Não é deficiente");
        }else{
            txtDef.setText("Você é deficiente");
        }*/


    }
}
