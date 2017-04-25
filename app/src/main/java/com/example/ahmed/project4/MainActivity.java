package com.example.ahmed.project4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<student> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.text);

        arrayList.add(new student(1,"ahmed","50","tanta"));
        arrayList.add(new student(2,"eslam","90","cairo"));
        arrayList.add(new student(3,"mohamed","60","tanta"));
        arrayList.add(new student(4,"ali","70","tanta"));
        arrayList.add(new student(5,"osama","80","tanta"));


        for (int i=0;i<arrayList.size();i++){

            student s=arrayList.get(i);
            textView.append(s.getName()+"\n");
            textView.append(s.getAddress()+"\n");
            textView.append(s.getDegree()+"\n");
            textView.append("--------------------------------------------\n");

        }



    }




}
