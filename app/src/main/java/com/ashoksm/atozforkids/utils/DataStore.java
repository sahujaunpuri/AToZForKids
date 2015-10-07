package com.ashoksm.atozforkids.utils;

import com.ashoksm.atozforkids.R;
import com.ashoksm.atozforkids.dto.ItemsDTO;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static DataStore ourInstance = new DataStore();
    private List<ItemsDTO> alphabets = null;

    public static DataStore getInstance() {
        return ourInstance;
    }

    private DataStore() {
    }

    public List<ItemsDTO> getAlphabets () {
        if(alphabets == null) {
            alphabets = new ArrayList<>();
            alphabets.add(new ItemsDTO("Apple", R.drawable.apple));
            alphabets.add(new ItemsDTO("Ball", R.drawable.ball));
            alphabets.add(new ItemsDTO("Cat", R.drawable.cat));
            alphabets.add(new ItemsDTO("Dog", R.drawable.dog));
            alphabets.add(new ItemsDTO("Elephant", R.drawable.elephant));
            alphabets.add(new ItemsDTO("Fish", R.drawable.fish));
            alphabets.add(new ItemsDTO("Goat", R.drawable.goat));
            alphabets.add(new ItemsDTO("Horse", R.drawable.horse));
            alphabets.add(new ItemsDTO("Igloo", R.drawable.igloo));
            alphabets.add(new ItemsDTO("Juice", R.drawable.juice));
            alphabets.add(new ItemsDTO("Kite", R.drawable.kite));
            alphabets.add(new ItemsDTO("Lion", R.drawable.lion));
            alphabets.add(new ItemsDTO("Mango", R.drawable.mango));
            alphabets.add(new ItemsDTO("Nest", R.drawable.nest));
            alphabets.add(new ItemsDTO("Owl", R.drawable.owl));
            alphabets.add(new ItemsDTO("Pig", R.drawable.pig));
            alphabets.add(new ItemsDTO("Queen", R.drawable.queen));
            alphabets.add(new ItemsDTO("Rabbit", R.drawable.rabbit));
            alphabets.add(new ItemsDTO("Swan", R.drawable.swan));
            alphabets.add(new ItemsDTO("Truck", R.drawable.truck));
            alphabets.add(new ItemsDTO("Umbrella", R.drawable.umbrella));
            alphabets.add(new ItemsDTO("Violin", R.drawable.violin));
            alphabets.add(new ItemsDTO("Watermelon", R.drawable.watermelon));
            alphabets.add(new ItemsDTO("Xylophone", R.drawable.xylophone));
            alphabets.add(new ItemsDTO("Yoyo", R.drawable.yoyo));
            alphabets.add(new ItemsDTO("Zebra", R.drawable.zebra));
        }
        return alphabets;
    }
}
