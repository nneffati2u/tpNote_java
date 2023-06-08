package com.example.tpnote_java;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nom.setCellValueFactory(new PropertyValueFactory<Pizza, String>("nom"));
        prix.setCellValueFactory(new PropertyValueFactory<Pizza, Float>("prix"));
        nb_ing.setCellValueFactory(new PropertyValueFactory<Pizza, Integer>("nb_ing"));

        var donnee = PizzaDAO.getPizza();
        for (int i=0; i<donnee.size();i++){
            ajouterPizzaDansTableau(donnee.get(i).getNom(), donnee.get(i).getPrix(), donnee.get(i).getNb_ing());
        }



    }
    public void ajouterPizzaDansTableau(String nom, Integer prix, Integer nb_ing) {
        Pizza pizza = new Pizza(nom, prix, nb_ing);
        pizza.setNom(nom);
        pizza.setPrix(prix);
        pizza.setNb_ing(nb_ing);

        ObservableList<Pizza> pizza_list = tableau.getItems();
        pizza_list.add(pizza);
        tableau.setItems(pizza_list);
    }



//    new PizzaDAO().ajouterPizza(new Pizza("test", 2,2, 3));

 /*
    private static void afficherPizza() {
        List<Pizza> eleves = new PizzaDAO().getPizza();
        eleves.stream().forEach(pizza -> System.out.println(pizza.toString()));
    }*/

    @FXML
    private TableColumn nom;
    @FXML
    private TableColumn prix;
    @FXML
    private TableColumn nb_ing;
    @FXML
    private Button btnAjouter;
    @FXML
    private Button btnVider;
    @FXML
    private TableView tableau;
    @FXML
    private TextField nbIng_text;
    @FXML
    private TextField recette_text;
    @FXML
    private TextField prix_text;
    @FXML
    private void ajouterPizza() {

ajouterPizzaDansTableau(recette_text.getText(), Integer.parseInt(prix_text.getText()), Integer.parseInt(nbIng_text.getText()));
        PizzaDAO.ajouterPizza(new Pizza(
                recette_text.getText(),
                Integer.parseInt(prix_text.getText()),
                Integer.parseInt(nbIng_text.getText()))
        );


    }

}