package com.mlabs.junit;
import org.junit.jupiter.api.extension.*;

public class CustomExtension implements BeforeEachCallback, AfterEachCallback {

    @Override
    public void beforeEach(ExtensionContext context) {
        System.out.println("Before each test with Custom Extension");
    }

    @Override
    public void afterEach(ExtensionContext context) {
        System.out.println("After each test with Custom Extension");
    }
}
