package ru.itpark;

public class Main {

    public static void main(String[] args) {
        Product legoShip = new Product(
                "https://ozon.ru",
                32,
                "Бестселлер",
                2290,
                1563,
                "LEGO Hidden Side",
                70419,
                "Старый рыбацкий корабль",
                "Конструктор",
                5
        );

        Product legoRiddle = new Product(
                "https://ozon.ru",
                33,
                "Бестселлер",
                2290,
                1540,
                "LEGO Hidden Side",
                70420,
                "Загадка старого кладбища",
                "Конструктор",
                5
        );

        Product legoLorry = new Product(
                "https://ozon.ru",
                32,
                "Бестселлер",
                2990,
                2039,
                "LEGO Hidden Side",
                70421,
                "Трюковой грузовик Эль-Фуэго",
                "Конструктор",
                0
        );
        Cart cart = new Cart();
        cart.add(legoRiddle);
        cart.add(legoLorry);
        cart.add(legoLorry);
        cart.remove(legoLorry);
        System.out.println("Количество товара: " + cart.getitemCount());
        System.out.println("Общая стоимость без учета скидки: " + cart.getPrice());
        System.out.println("Стоимость с учетом скидки: " + cart.getDiscount());
    }
}