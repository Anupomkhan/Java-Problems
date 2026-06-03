public class Discussion_04 {
    // Practice Problem 04
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println();

        filterProducts("electronics");
        filterProducts(100, 500);
        filterProducts("Apple", true);
        filterProducts("electronics", 100, 500);
        filterProducts("electronics", 100, 500, "Apple");
    }

    // Practice Problem 04(contd.)
    public static void filterProducts(String category) {
        System.out.println("Searching for products in category: " + category);
    }

    public static void filterProducts(int minimumPrice, int maximumPrice) {
        System.out.println("Searching for products between $" + minimumPrice + " and $" + maximumPrice);
    }

    public static void filterProducts(String brand, boolean searchByBrand) {
        System.out.println("Searching for products by brand: " + brand);
    }

    public static void filterProducts(String category, int minimumPrice, int maximumPrice) {
        System.out.println("Searching for " + category + " products between $" + minimumPrice + " and $" + maximumPrice);
    }

    public static void filterProducts(String category, int minimumPrice, int maximumPrice, String brand) {
        System.out.println("Searching for " + brand + " " + category + " products between $" + minimumPrice + " and $" + maximumPrice);
    }
}
