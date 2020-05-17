package entities;

public class Product {
    public String name;
    public double price;
    public int qtd;

    public double totalValueInStock(){
        return price * qtd;
    }

    public void addProduct(int qtd){
        this.qtd += qtd;
    }

    public void removeProducts(int qtd){
        this.qtd -= qtd;
    }
}
