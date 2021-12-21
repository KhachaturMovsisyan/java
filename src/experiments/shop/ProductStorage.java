package experiments.shop;

public class ProductStorage {
    private Product[] array = new Product[10];
    private int size = 0;

    public void add(Product product) {

        if (size == array.length) {
            extend();
        }
        array[size++] = product;
    }

    private void extend() {
        Product[] newArray = new Product[array.length + 10];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public Product getByIndex(int index) {
        if (index < array.length) {

            return array[index];
        } else {
            System.out.println("Product not found");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }

    public Product getProductByName(String buy) {
        for (int i = 0; i < size; i++) {
            if (array[i].getName().equals(buy))
                return array[i];
        }
        return null;
    }


}
