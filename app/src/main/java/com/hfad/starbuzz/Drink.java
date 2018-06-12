package com.hfad.starbuzz;

public class Drink {
    private  String name;
    private  String description;
    private int imageResouceId;

    public static  final Drink[] drinks = {
      new Drink("Latte","A coupole of espresso shots with steamed milk.",R.drawable.latte),
      new Drink("Cappuccino","Espresso, hot mike, and a steamed milk foam.",R.drawable.cappuccino),
      new Drink("Filter","Highest quality beans roasted and brewed fresh.",R.drawable.filter),
    };

    private Drink(String name, String description, int imageResouceId) {
        this.name=name;
        this.description=description;
        this.imageResouceId=imageResouceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResouceId() {
        return imageResouceId;
    }
}
