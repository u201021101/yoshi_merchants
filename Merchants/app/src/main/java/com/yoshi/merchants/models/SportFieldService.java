package com.yoshi.merchants.models;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Multiplica on 12/09/2017.
 */

public class SportFieldService {
    private List<SportField> sportField;
    public List<SportField> getSportField() { return sportField; }

    public SportFieldService(Context context){
        sportField = new ArrayList<>();
        sportField.add(new SportField("Cancha A 4x4", 8));
        sportField.add(new SportField("Cancha 6x6", 12));
        sportField.add(new SportField("Cancha 8x8", 16));
        sportField.add(new SportField("Cancha B 4x4", 8));
    }
}
