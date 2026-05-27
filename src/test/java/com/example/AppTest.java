package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testAddition() {
        App app = new App();
        assertEquals(2, app.add(1, 1));
    }
}
