package ru.itpark;

public class Cart {
    private int price;
    private int discount;
    private int itemCount;
    private int sizeMassive = 15;
    private Product[] addCart = new Product[sizeMassive];


    public void add(Product product) {
        int index = product.getIndex();
        if (addCart[index] == null) {
            addCart[index] = product;
            price += addCart[index].getPrice();
            discount += addCart[index].getPriceWithDiscount();
            addCart[index] = null;
            itemCount++;
        }
    }


    public void remove(Product product) {
        int index = product.getIndex();
        if (addCart[index] != null) {
            price -= addCart[index].getPrice();
            discount -= addCart[index].getPriceWithDiscount();
            addCart[index] = null;
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

