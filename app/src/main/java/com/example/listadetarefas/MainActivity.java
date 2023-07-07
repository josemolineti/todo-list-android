package com.example.listadetarefas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView botaoAdd = findViewById(R.id.floatingActionButton);

        botaoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linearLayout = findViewById(R.id.container_fundo);
                View remove = findViewById(R.id.task1);
                linearLayout.removeView(remove);
                Toast.makeText(MainActivity.this, "Aaaaaaaaaaaaaa", Toast.LENGTH_SHORT).show();
            }

        });




    }
}