package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    //recycler view for order history
       private RecyclerView recyclerView;
       RecyclerView.LayoutManager layoutManager;
       RecyclerViewAdapter recyclerViewAdapter;

     int []arr={R.drawable.casing, R.drawable.cpu, R.drawable.graphiccard, R.drawable.keyboard, R.drawable.monitor, R.drawable.mouse, R.drawable.power, R.drawable.ram};

    //end here


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //recycler view for order history
        recyclerView=findViewById(R.id.recyclerView);
         layoutManager=new GridLayoutManager(this,2);
         recyclerView.setLayoutManager(layoutManager);
         recyclerViewAdapter=new RecyclerViewAdapter(arr);

          recyclerView.setAdapter(recyclerViewAdapter);
          recyclerView.setHasFixedSize(true);

        //end here




    }
}