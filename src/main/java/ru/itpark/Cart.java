package ru.itpark;

public class Cart {
    private int price;
    private int discount;
    private int itemCount;
    private int length = 15;
    private Product[] items = new Product[length];


    public void add(Product product) {
        int index = product.getIndex();
        if (items[index] == null) {
            items[index] = product;
            price += items[index].getPrice();
            discount += items[index].getPriceWithDiscount();
            itemCount++;
        }
    }


    public void remove(Product product) {
        int index = product.getIndex();
        if (items[index] != null) {
            price -= items[index].getPrice();
            discount -= items[index].getPriceWithDiscount();
            items[index] = null;
            itemCount--;
        }
    }

    public int getDiscount() {
        return discount;
    }

    public int getitemCount() {
        return itemCount;
    }

    public int getPrice() {
        return price;
    }
}

