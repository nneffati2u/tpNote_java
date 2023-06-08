package com.example.demo;

import com.example.tpnote_java.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizaTest {
    @Test
    void verficationGetter() {

        Pizza piza1 = new Pizza ("n", 10,5 ) ;

        String nom1 = piza1.getNom();
        int nb_ing1 = piza1.getNb_ing();
        float prix1= piza1.getPrix();


        // verfication getter et la construction
        assertEquals("n",nom1);
        assertEquals(5,nb_ing1);
        assertEquals(10,prix1);


    }
    @Test
    void verficationSetterGetter() {

        Pizza piza2 = new Pizza ("s", 15 , 3);



        piza2.setNom("h");
        piza2.setNb_ing(10);
        piza2.setPrix(100);

        String nom1 = piza2.getNom();
        int nb_ing1 = piza2.getNb_ing();
        float prix1= piza2.getPrix();


        // verfication getter & setter
        assertEquals("h",nom1);
        assertEquals(10,nb_ing1);
        assertEquals(100,prix1);



    }
    @Test
    void verficationGetterConstructor() {

        Pizza piza2 = new Pizza ("s", 15 , 3);


        String nom2 = piza2.getNom();
        int nb_ing2= piza2.getNb_ing();
        float prix2= piza2.getPrix();



        // verfication getter & constructor
        assertEquals("s",nom2);
        assertEquals(3,nb_ing2);
        assertEquals(15,prix2);


    }

}