package com.example.jordy.to_dolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] list = new String[] {
            "pancake",
            "powdersucker",
            "poofers"
    };
    EditText user_input;
    Button button;
    ListView todolist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listview = (ListView) findViewById(R.id.todolist);


        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);

        listview.setAdapter(adapter);
    }

    public void addToListView(){
        return;
    }
}
