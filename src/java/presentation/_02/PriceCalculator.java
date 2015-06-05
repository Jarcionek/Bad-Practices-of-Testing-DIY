package presentation._02;

import static presentation._02.Product.priceOf;

public class PriceCalculator {

    public int calculateTotal(Iterable<Product> products) {
        int total = 0;
        int numberOfApples = 0;
        int numberOfOranges = 0;

        for (Product product : products) {
            total += priceOf(product);
            if (product.getName().equals("Apple")) {
                numberOfApples++;
            } else if (product.getName().equals("Orange")) {
                numberOfOranges++;
            }
        }

        total -= numberOfApples / 3 * Product.priceOf("Apple");
        total -= numberOfOranges / 5 * 2 * Product.priceOf("Orange");

        return total;
    }

}
