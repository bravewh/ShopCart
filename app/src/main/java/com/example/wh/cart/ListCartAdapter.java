package com.example.wh.cart;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weihao on 2017/11/17.
 */

public class ListCartAdapter extends ArrayAdapter {

    private ViewHodler mHodler;
    private View mView;
    private ArrayList<CartList> mCartLists = new ArrayList<>();

    public ListCartAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        mCartLists = (ArrayList<CartList>) objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CartList cartList = mCartLists.get(position);
        if (convertView == null) {
            mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_item, null);
            mHodler = new ViewHodler();
            mHodler.mCheckBox = mView.findViewById(R.id.lv_cb);
            mHodler.mImageView = mView.findViewById(R.id.lv_iamge);
            mHodler.mThingName = mView.findViewById(R.id.lv_thingName);
            mHodler.mThingColor = mView.findViewById(R.id.lv_thingColor);
            mHodler.mPrice = mView.findViewById(R.id.lv_price);
            mHodler.mCount = mView.findViewById(R.id.lv_count);

            mView.setTag(mHodler);
        } else {
            mView = convertView;
            mHodler = (ViewHodler) mView.getTag();

        }
        mHodler = (ViewHodler) mView.getTag();
        mHodler.mCheckBox.setChecked(false);
        mHodler.mImageView.setImageResource(cartList.getImage());
        mHodler.mThingName.setText(cartList.getThingName());
        mHodler.mThingColor.setText(cartList.getThingColor());
        mHodler.mPrice.setText(cartList.getPrice());
        mHodler.mCount.setText(cartList.getCount());
        return mView;

    }

    class ViewHodler {

        CheckBox mCheckBox;
        ImageView mImageView;
        TextView mThingName;
        TextView mThingColor;
        TextView mPrice;
        TextView mCount;


    }


}
