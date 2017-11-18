package com.example.wh.cart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopCartActivity extends AppCompatActivity {

    private ListView mLv_cart;
    private ArrayList<CartList> mCartLists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_cart);

        mLv_cart = findViewById(R.id.lv_cart);

        //初始化数据
        initData();
        ListCartAdapter adapter = new ListCartAdapter(ShopCartActivity.this, R.layout.cart_item, mCartLists);
        mLv_cart.setAdapter(adapter);


    }

    private void initData() {
        /*  private boolean isCheck;
            private int image;
            private String thingName;
            private String thingColor;
            private String price;
            private int count;*/
        for (int i = 0; i < 30; i++) {
            CartList cartItem = new CartList(true, R.mipmap.ic_launcher, "上档次hen帅气的T恤", "黑色", "599", "2");
            mCartLists.add(cartItem);

        }


    }
}
