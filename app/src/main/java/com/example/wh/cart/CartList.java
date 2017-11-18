package com.example.wh.cart;

;

/**
 * Created by weihao on 2017/11/17.
 */

public class CartList {


    //初始状态
    private boolean isCheck;
    private int image;
    private String thingName;
    private String thingColor;
    private String price;
    private String count;

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getThingName() {
        return thingName;
    }

    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    public String getThingColor() {
        return thingColor;
    }

    public void setThingColor(String thingColor) {
        this.thingColor = thingColor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public CartList(boolean isCheck, int image, String thingName, String thingColor, String price, String count) {
        this.isCheck = isCheck;
        this.image = image;
        this.thingName = thingName;
        this.thingColor = thingColor;
        this.price = price;
        this.count = count;
    }
}








