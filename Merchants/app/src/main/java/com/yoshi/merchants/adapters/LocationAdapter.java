package com.yoshi.merchants.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yoshi.merchants.R;
import com.yoshi.merchants.models.Location;
import java.util.List;

/**
 * Created by Multiplica on 10/09/2017.
 */

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {

    List<Location> location;
    public void setLocation(List<Location> location) { this.location = location; }

    @Override
    public LocationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.card_location, parent, false));
    }

    @Override
    public void onBindViewHolder(LocationAdapter.ViewHolder holder, int position) {
        holder.nameTextView.setText(location.get(position).getName());
        holder.quantitySportFieldTextView.setText(location.get(position).getQuantitySportField());
        /*
        holder.locationCardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Bundle bundle = new Bundle();
            bundle.putInt("currentPosition", position);
            Intent iconIntent = new Intent(view.getContext(), IconActivity.class);
            iconIntent.putExtras(bundle);
            view.getContext().startActivity(iconIntent);
        }
         */
    }

    @Override
    public int getItemCount() {
        return location.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView locationCardView;
        TextView nameTextView;
        TextView quantitySportFieldTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            locationCardView= (CardView)itemView.findViewById(R.id.locationCardView );
            nameTextView= (TextView)itemView.findViewById(R.id.nameTextView);
            quantitySportFieldTextView= (TextView)itemView.findViewById(R.id.quantitySportFieldTextView);
        }
    }
}
