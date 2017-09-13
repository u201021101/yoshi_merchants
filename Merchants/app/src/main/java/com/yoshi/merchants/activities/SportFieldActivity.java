package com.yoshi.merchants.activities;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.yoshi.merchants.R;
import com.yoshi.merchants.adapters.SportFieldAdapter;
import com.yoshi.merchants.models.SportField;
import com.yoshi.merchants.models.SportFieldService;

import java.util.List;

import static com.yoshi.merchants.R.id.sportFieldRecyclerView;

public class SportFieldActivity extends AppCompatActivity {
    List<SportField> sportField;
    RecyclerView.LayoutManager sportFieldLayoutManager;
    RecyclerView sportFieldRecyclerView;
    SportFieldAdapter sportFieldAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_field);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity( new Intent(view.getContext(), RegisterSportFieldActivity.class));
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        SportFieldService service = new SportFieldService(this);
        sportField = service.getSportField();
        sportFieldLayoutManager = new LinearLayoutManager(this);
        sportFieldAdapter = new SportFieldAdapter();
        sportFieldAdapter.setSportField(sportField);
        sportFieldRecyclerView = (RecyclerView) findViewById(R.id.sportFieldRecyclerView);
        sportFieldRecyclerView.setLayoutManager(sportFieldLayoutManager);
        sportFieldRecyclerView.setAdapter(sportFieldAdapter);
    }
}
