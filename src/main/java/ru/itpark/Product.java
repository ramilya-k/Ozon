package ru.itpark;

public class Product {
    private String imageUrl;
    private int discount;
    private String popularity;
    private int price;
    private int priceWithDiscount;
    private String series;
    private int id;
    private String name;
    private String type;
    private int rating;
    private int index;

    public Product(String imageUrl, int discount, String popularity, int price, int priceWithDiscount, String series, int id, String name, String type, int rating) {
        this.imageUrl = imageUrl;
        this.discount = discount;
        this.popularity = popularity;
        this.price = price;
        this.series = series;
        this.id = id;
        this.name = name;
        this.type = type;
        this.rating = rating;
        this.index = index;
        this.priceWithDiscount = priceWithDiscount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getdiscount() {
        return discount;
    }

    public void setdiscount(int discount) {
        this.discount = discount;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPriceWithDiscount() {
        return priceWithDiscount;
    }

    public void setPriceWithDiscount(int priceWithDiscount) {
        this.priceWithDiscount = priceWithDiscount;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}