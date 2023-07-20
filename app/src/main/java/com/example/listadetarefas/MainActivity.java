package com.example.listadetarefas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


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

                fillTaks();


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

    public void createTask() {
        LinearLayout linearLayout = findViewById(R.id.container_fundo);
        TaskActivity task = new TaskActivity();
        View include = LayoutInflater.from(MainActivity.this).inflate(R.layout.layout_task, linearLayout, false);
        include.setTag(gerarId());
        linearLayout.addView(include);
    }


    public void fillTaks() {
        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
        View popupView = inflater.inflate(R.layout.fill_task_pop_up, null);
        PopupWindow popupWindow = new PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        popupWindow.setFocusable(true);
        popupWindow.setTouchable(true);
        popupWindow.setOutsideTouchable(true);


        Animation fadeIn = AnimationUtils.loadAnimation(MainActivity.this, R.animator.fade_in);
        popupView.startAnimation(fadeIn);


        popupWindow.showAtLocation(popupView, Gravity.CENTER, 0, 0);

        Calendar calendar = Calendar.getInstance();
        DatePicker datePicker = popupView.findViewById(R.id.select_date);
        LinearLayout select_date = popupView.findViewById(R.id.selected_date_container);
        TextView selected_date_text = popupView.findViewById(R.id.selected_date_text);
        selected_date_text.setText(String.format("%S/%S/%S", datePicker.getDayOfMonth(), datePicker.getMonth()+1, datePicker.getYear()));
        datePicker.setVisibility(View.GONE);

        select_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.setVisibility(View.VISIBLE);
            }
        });


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
                @Override
                public void onDateChanged(DatePicker datePicker, int year, int month, int day) {
                    datePicker.setVisibility(View.GONE);
                    selected_date_text.setText(String.format("%S/%S/%S", datePicker.getDayOfMonth(), datePicker.getMonth()+1, datePicker.getYear()));

                }
            });
        }

    }

    public void blur() {


    }


    public String gerarId() {
        int taskId_index = (task_list.size()+1);
        String taskId = "task" + taskId_index;
        return taskId;
    }

    public void formatDate(){

    }
}


