package main;

import clase.Client;
import clase.IClient;
import clase.IRestaurant;
import clase.Restaurant;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Foden");
        Client client2 = new Client("Marmoush");

        IRestaurant restaurant = new Restaurant("Monza");

        restaurant.aboneazaClient(client1);
        restaurant.aboneazaClient(client2);

        ((Restaurant)restaurant).trimiteNouMeniu();
        restaurant.dezaboneazaClient(client2);
        System.out.println("--------------");
        ((Restaurant) restaurant).trimiteOfertaPret();
    }
}