package com.nehvin.starbuzz;

/**
 * Created by Vineet K Jain on 8/4/2016.
 */
public class Drink {

    private String name;
    private String description;
    private int imageResourceID;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, steamed milk, and Milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    private Drink(String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getDescription ()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public int getImageResourceID()
    {
        return imageResourceID;
    }

    public String toString()
    {
        return this.name;
    }
}
