package com.yoshi.merchants.models;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Multiplica on 11/09/2017.
 */

public class LocationService {
    private List<Location> location;
    public List<Location> getLocation() { return location; }

    public LocationService(Context context){
        location = new ArrayList<>();
        location.add(new Location("Surquillo", "","", "4 Canchas" ));
        location.add(new Location("San miguel", "","", "3 Canchas" ));
        location.add(new Location("Chorrillo", "","", "5 Canchas" ));
    }
}
