package org.example.pages;

import org.example.core.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {
    private static final By PRODUCT_ITEMS =
    private static final By PRODUCT_PRICE =
    private static final ProductsPage INSTANCE = new ProductsPage();

    private ProductsPage() {
    }

    public static ProductsPage getInstance() {
        return INSTANCE;
    }

//    public List<Product> getProducts() {
//      //  return list;
//    }
}
