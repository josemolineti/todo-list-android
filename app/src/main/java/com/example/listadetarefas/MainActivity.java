package com.example.listadetarefas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<TaskActivity> task_list = new ArrayList<TaskActivity>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ImageView botaoAdd = findViewById(R.id.floatingActionButton);

        botaoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout linearLayout = findViewById(R.id.container_fundo);
                TaskActivity task = new TaskActivity();
                View include = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_task, linearLayout, false);
                include.setTag(gerarId());
                linearLayout.addView(include);

            }

        });


        ImageButton btnOptions = findViewById(R.id.botao_more);
        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnOptions);
                popupMenu.getMenu().add("Sair");
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getTitle().toString()) {
                            case "Sair":
                                finish();
                                return true;

                            default:
                                return false;
                        }
                    }
                });


            }
        });

    }


    public String gerarId() {
        int taskId_index = (task_list.size()+1);
        String taskId = "task" + taskId_index;
        return taskId;
    }
}


    //#LinearLayout linearLayout = findViewById(R.id.container_fundo);
    //View remove = findViewById(R.id.task1);
      //          linearLayout.removeView(remove);
        //                Toast.makeText(MainActivity.this, "Aaaaaaaaaaaaaa", Toast.LENGTH_SHORT).show();