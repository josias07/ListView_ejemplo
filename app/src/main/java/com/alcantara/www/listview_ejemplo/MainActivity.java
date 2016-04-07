package com.alcantara.www.listview_ejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listafrutas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listafrutas = (ListView) findViewById(R.id.listView);

        String[] datos={"Manzana","Pera","Lucuma","Uva","Melon","Papaya","Mango","Cereza","Piña","Granadilla","Coco"};
        ArrayAdapter lista_frutas = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_activated_1, datos);

        listafrutas.setAdapter(lista_frutas);
    }
}
