package com.yoshi.merchants.adapters;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yoshi.merchants.R;
import com.yoshi.merchants.models.SportField;
import java.util.List;

/**
 * Created by Multiplica on 10/09/2017.
 */

public class SportFieldAdapter extends RecyclerView.Adapter<SportFieldAdapter.ViewHolder> {

    List<SportField> sportField;
    public void setSportField(List<SportField> sportField) { this.sportField = sportField; }

    @Override
    public SportFieldAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new ViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.card_sport_field, parent, false));
    }

    @Override
    public void onBindViewHolder(SportFieldAdapter.ViewHolder holder, int position) {
        holder.nameTextView.setText(sportField.get(position).getName());
        holder.quantityPlayerTextView .setText(sportField.get(position).getQuantityPlayer());
        /*
        holder.SportFieldCardView.setOnClickListener(new View.OnClickListener() {
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
        return sportField.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView sportFieldCardView;
        TextView nameTextView;
        TextView quantityPlayerTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            sportFieldCardView= (CardView)itemView.findViewById(R.id.sportFieldCardView );
            nameTextView= (TextView)itemView.findViewById(R.id.nameTextView);
            quantityPlayerTextView= (TextView)itemView.findViewById(R.id.quantitySportFieldTextView);
        }
    }
}
