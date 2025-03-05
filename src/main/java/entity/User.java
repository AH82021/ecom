package entity;

import java.util.Arrays;

public class User {
 private static final int MAX_CART_SIZE = 10;
    private int id;
    private String username;
    private String password;
    private boolean isAdmin;
    private Product[] cart = new Product[MAX_CART_SIZE];
    private int cartSize = 0;

    public User(int id, String username, String password, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Product[] getCart() {
        return cart;
    }

    public void setCart(Product[] cart) {
        this.cart = cart;
    }

    public int getCartSize() {
        return cartSize;
    }

    public void setCartSize(int cartSize) {
        this.cartSize = cartSize;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", cart=" + Arrays.toString(cart) +
                ", cartSize=" + cartSize +
                '}';
    }
}
