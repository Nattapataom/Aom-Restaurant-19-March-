package rru.aomsin.aomrestaurant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by User on 20/3/2559.
 */
public class FoodAdapter extends BaseAdapter {

    //Explicit
    private Context context;
    private  String[]urlIconStrings, nameFoodStrings, priceStrings;

    public FoodAdapter(Context context,
                       String[] nameFoodStrings,
                       String[] priceStrings,
                       String[] urlIconStrings) {
        this.context = context;
        this.nameFoodStrings = nameFoodStrings;
        this.priceStrings = priceStrings;
        this.urlIconStrings = urlIconStrings;
    }

    @Override
    public int getCount() {
        return urlIconStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view1 = layoutInflater.inflate(R.layout.food_listview, viewGroup, false);

        //For Image
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView2);
        Picasso.with(context).load(urlIconStrings[i]).resize(120, 120).into(iconImageView);
        //For Text
        TextView foodNameTextView = (TextView) view1.findViewById(R.id.textView2);
        foodNameTextView.setText(nameFoodStrings[i]);

        TextView priceTextView = (TextView) view1.findViewById(R.id.textView3);
        priceTextView.setText(priceStrings[i]);
        return view1;
    }
}//Main Class
