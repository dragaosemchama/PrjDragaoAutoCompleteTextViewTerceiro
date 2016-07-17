// Dragão sem Chama: http://dragaosemchama.com.br/2016/07/android-autocompletetextview/
//Código: Segundo Exemplo do componente AutoCompleteTextView
//Autor: Márcio Albuquerque
//Email: o.marcio.albu@gmail.com
//Data: Junho/2016
package com.dragao.sem.chama;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Colocar o ícone (ic_launcher) na action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Variável da estrutura layout uma lista simples (android.R.layout.simple_list_item_1)
        int tipoLayoutId = android.R.layout.simple_list_item_1;

        //Criação de um vetor com todos os meses do ano,
        // usando os valores contido no arquivo strings.xml.
        List<String> MesesVetor =
                Arrays.asList(getResources().getStringArray(R.array.MesesLista));

        //Chamada da estrutura AutoCompleteTextView do Layout para um objeto.
        AutoCompleteTextView acObjText =
                (AutoCompleteTextView) findViewById(R.id.acTexto);

        // Criação de um ArrayAdapter, para que possa mostrar
            // a lista de sugestões para o usuário
        // ArrayAdapter:
        //   -> Do tipo string;
        //   -> É aplicado nessa classe (this);
        //   -> É colocado o vetor que se deseja se aplicado no adapter (MesesVetor)
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, tipoLayoutId, MesesVetor );
        acObjText.setAdapter(adapter);

    }
}// Fim da classe MainActivity
