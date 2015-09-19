/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexjalg.gson_google;

import com.alexjalg.gson_google.entidad.Animal;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Type;

/**
 *
 * @author LAB_SB_309_PC19
 */
public class Ejecutar {

    public static void main(String[] args) {
        
        ArrayList<Animal> listAnimal = new ArrayList<Animal>();
        Animal animal = new Animal();
        animal.setRaza("mamifero");
        animal.setNombre("ballena");
        listAnimal.add(animal);
        Animal gato = new Animal();
        gato.setRaza("mamifero");
        gato.setNombre("gato");
        listAnimal.add(gato);
        Animal perro = new Animal();
        perro.setRaza("mamifero");
        perro.setNombre("perro");
        listAnimal.add(perro);
        Animal paloma = new Animal();
        paloma.setRaza("ave");
        paloma.setNombre("paloma");
        listAnimal.add(paloma);

        Gson g = new Gson();

        String json = g.toJson(listAnimal);
        System.out.println(json);

        ArrayList<Animal> listita = new ArrayList<Animal>();
        Type listType = new TypeToken<ArrayList<Animal>>() {
        }.getType();
        listita = new Gson().fromJson(json, listType);

        System.out.println("" + listita.size());

        for (Animal a : listita) {
            System.out.println("");
            System.out.println("" + a.getNombre());
            System.out.println("" + a.getRaza());
        }
        
    }

}
