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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weihao on 2017/11/17.
 */

public class ListCartAdapter extends ArrayAdapter {

    private ViewHodler mHodler;
    private View mView;
    private ArrayList<CartList> mCartLists = new ArrayList<>();
    public static boolean isChecked = true;
    public static boolean  mChecked1 ;


    public ListCartAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        mCartLists = (ArrayList<CartList>) objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
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

        CartList cartList = mCartLists.get(position);

        mHodler.mCheckBox.setChecked(false);
        mHodler.mImageView.setImageResource(cartList.getImage());
        mHodler.mThingName.setText(cartList.getThingName());
        mHodler.mThingColor.setText(cartList.getThingColor());
        mHodler.mPrice.setText(cartList.getPrice());
        mHodler.mCount.setText(cartList.getCount());

        //勾选商品
        mHodler.mCheckBox.setOnClickListener(new View.OnClickListener() {






            @Override
            public void onClick(View view) {


                mChecked1 = mHodler.mCheckBox.isChecked();
                if (!mChecked1) {
                    Toast.makeText(getContext(), "勾选", Toast.LENGTH_SHORT).show();
                    mChecked1 = true;
                } else {
                    Toast.makeText(getContext(), "未勾选", Toast.LENGTH_SHORT).show();
                    mChecked1 = false;
                }


/*                //勾选
                if (isChecked) {
                    Toast.makeText(getContext(), "勾选了", Toast.LENGTH_SHORT).show();

                        isChecked = false;

                    //不勾选
                } else {

                    Toast.makeText(getContext(), "没有勾选", Toast.LENGTH_SHORT).show();
                    isChecked = true;
                }*/
            }


        });


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
