package com.ocr.anthony;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix Menu ");
        System.out.println("1- Poulet");
        System.out.println("2- Boeuf");
        System.out.println("3- Vegetarien");
    }
    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        System.out.println("Vous avez choisi le menu " + nbMenu);
    }
}