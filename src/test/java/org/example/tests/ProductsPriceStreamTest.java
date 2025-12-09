package org.example.tests;

import org.example.core.BaseTest;
import org.example.dto.Product;
import org.example.pages.LoginPage;
import org.example.pages.ProductsPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




public class ProductsPriceStreamTest extends BaseTest {

    @Test
    @DisplayName("Проверка наличия товаров дешевле 15$")
    void shouldFindProductsCheaperThan15Dollars() {
        LoginPage loginPage = LoginPage.getInstance();
        ProductsPage productsPage = loginPage.loginAs("standard_user", "secret_sauce");

        // 1. Собрать цены всех товаров в List, реализовать метод getProducts()
        //List<Product> products = productsPage.getProducts();

        // 2. С использованием Stream API найдем товары дешевле 15 долларов


        // 3. Проверим, что товары были найдены

    }
}
