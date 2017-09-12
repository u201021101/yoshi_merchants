package com.yoshi.merchants.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yoshi.merchants.R;


public class MapFragment extends Fragment {

    /**
     * Created by SysteMagic on 12/09/2017.
     */

    public MapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.content_register_location, container, false);
    }

}