package objects;

import objects.Drink.drinkTypeEnum;

public class Menu {
    MenuItem[] getMenu(){
        return new MenuItem[]{
            new Drink(80, "Black tea", "Ceylon black tea", 0, drinkTypeEnum.BLACK_TEA),
            new Drink(160, "Coffee", "Coffee", 0, drinkTypeEnum.COFFEE),
            new Drink(80, "Green tea", "Chineese green tea", 0, drinkTypeEnum.GREEN_TEA),
            new Drink(50, "Juice", "Apple Juice", 0, drinkTypeEnum.JUICE),
            new Drink(50, "Milk", "Milk 3.2%", 0, drinkTypeEnum.MILK),
            new Drink(70, "Soda", "Soda", 0, drinkTypeEnum.SODA),
            new Drink(50, "Water", "Water 0.7",0, drinkTypeEnum.WATER),
            new Dish(500, "Pizza", "Pepperoni"),
            new Dish(500, "Pizza", "Margarita"),
            new Dish(500, "Pizza", "4 Cheese"),
            new Dish(500, "Pizza", "Bacon and cheese"),
            new Dish(500, "Pizza", "Carbonara"),
            new Dish(500, "Pizza", "Pesto"),
            new Dish(500, "Pizza", "Meat"),
        };
    }
    MenuItem[] getAlcoMenu() {
        return new MenuItem[]{
            new Drink(60, "Ohota", "Krepkaya", 4, drinkTypeEnum.BEER),
            new Drink(80, "Black tea", "Ceylon black tea", 0, drinkTypeEnum.BLACK_TEA),
            new Drink(5000, "Brandy", "V.S.O.P Brandy", 37, drinkTypeEnum.BRANDY),
            new Drink(275000, "Shampagne", "Shipwrecked 1907 Heidsieck", 12, drinkTypeEnum.CHAMPAGNE),
            new Drink(160, "Coffee", "Coffee", 0, drinkTypeEnum.COFFEE),
            new Drink(80, "Green tea", "Chineese green tea", 0, drinkTypeEnum.GREEN_TEA),
            new Drink(1500, "Jagermeister", "German jagermeister", 35, drinkTypeEnum.JAGERMEISTER),
            new Drink(50, "Juice", "Apple Juice", 0, drinkTypeEnum.JUICE),
            new Drink(350, "Liquor", "One shot", 20, drinkTypeEnum.LIQUOR),
            new Drink(50, "Milk", "Milk 3.2%", 0, drinkTypeEnum.MILK),
            new Drink(1500, "Rum", "Black rum", 35, drinkTypeEnum.RUM),
            new Drink(70, "Soda", "Soda", 0, drinkTypeEnum.SODA),
            new Drink(350, "Tequila", "Tequila 0.3", 45, drinkTypeEnum.TEQUILA),
            new Drink(350, "Vermuth", "Vermuth 0.3",18, drinkTypeEnum.VERMUTH),
            new Drink(200, "Vodka", "Carskaya",40, drinkTypeEnum.VODKA),
            new Drink(50, "Water", "Water 0.7",0, drinkTypeEnum.WATER),
            new Drink(600, "Whiskey", "Irish Whiskey",50, drinkTypeEnum.WHISKEY),
            new Drink(500, "Wine", "Rad Wine",12, drinkTypeEnum.WINE),
            new Dish(500, "Pizza", "Pepperoni"),
            new Dish(500, "Pizza", "Margarita"),
            new Dish(500, "Pizza", "4 Cheese"),
            new Dish(500, "Pizza", "Bacon and cheese"),
            new Dish(500, "Pizza", "Carbonara"),
            new Dish(500, "Pizza", "Pesto"),
            new Dish(500, "Pizza", "Meat"),
        };
    }
}
