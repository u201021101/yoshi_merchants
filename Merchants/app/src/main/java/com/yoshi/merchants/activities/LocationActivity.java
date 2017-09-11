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
import com.yoshi.merchants.adapters.LocationAdapter;
import com.yoshi.merchants.models.Location;
import com.yoshi.merchants.models.LocationService;

import java.util.List;

public class LocationActivity extends AppCompatActivity {
    List<Location> location;
    RecyclerView.LayoutManager locationLayoutManager;
    RecyclerView locationRecyclerView;
    LocationAdapter locationAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity( new Intent(view.getContext(), RegisterLocationActivity.class));
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        LocationService service = new LocationService(this);
        location = service.getLocation();
        locationLayoutManager = new LinearLayoutManager(this);
        locationAdapter = new LocationAdapter();
        locationAdapter.setLocation(location);
        locationRecyclerView = (RecyclerView) findViewById(R.id.locationRecyclerView);
        locationRecyclerView.setLayoutManager(locationLayoutManager);
        locationRecyclerView.setAdapter(locationAdapter);
    }

}
