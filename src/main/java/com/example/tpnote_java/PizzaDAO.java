package com.example.tpnote_java;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PizzaDAO {
    public static List<Pizza> getPizza() {
        List<Pizza> pizza = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jbdc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/neffati3u_tpNoteJava", "neffati3u_appli", "32225223");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from pizza");
            while (rs.next()) {
                pizza.add(new Pizza(rs.getString(2), rs.getInt(3), rs.getInt(4)));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return pizza;
    }

    public static void ajouterPizza(Pizza pizza) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/neffati3u_tpNoteJava", "neffati3u_appli", "32225223");

            PreparedStatement statement = con.prepareStatement("INSERT INTO pizza(nom,prix,nb_ing) VALUES(?,?,?);");
            statement.setString(1, pizza.getNom());
            statement.setInt(2, pizza.getPrix());
            statement.setInt(3, pizza.getNb_ing());

            statement.executeUpdate();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void supprimerPizza(int id){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/neffati3u_tpNoteJava", "neffati3u_appli", "32225223");

            PreparedStatement statement = con.prepareStatement("DELETE  FROM pizza WHERE id = ?;");
            statement.setInt(1, id);

            statement.executeUpdate();

            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }

}