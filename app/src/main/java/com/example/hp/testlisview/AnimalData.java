package com.example.hp.testlisview;

import com.example.hp.testlisview.model.Animal;

import java.util.ArrayList;

/**
 * Created by HP on 29/10/2560.
 */

public class AnimalData {

    private static AnimalData sInstance;


    public ArrayList<Animal> animalList;



    public static AnimalData getsInstance(){
        if(sInstance == null){
            sInstance = new AnimalData();
        }

        return sInstance;
    }
}
