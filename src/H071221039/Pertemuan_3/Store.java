import java.util.*;

public class Store {
    private String name;
    private ArrayList<Product> product; 

    public Store(){
    }

    public Store (String name, ArrayList<Product> product){
        this.name = name;
        this.product = product;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Product> getProduct() {
        return product;
    }

    public void listProduct(){
        int i = 1;
        System.out.printf("Selamat Datang di %s%nDaftar Produk : %n", this.getName());
        for (Product produk : this.product){
            System.out.printf("%d. %s - $%d | Stok %d%n", i, produk.getName(), produk.getPrice(), produk.getStock());
            i++;
        }
        System.out.println("0. Keluar");
    }

    public void addProduct(Product product){
        this.product.add(product);
    }

}

