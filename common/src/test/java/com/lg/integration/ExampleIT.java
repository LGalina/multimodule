package com.lg.integration;

import static junit.framework.Assert.*;

public class ExampleIT {

    public ExampleIT() {
    }

    @org.junit.jupiter.api.BeforeAll
    static void beforeAll() {
        System.out.println(" Before all test");
    }

    @org.junit.jupiter.api.Test
    public  void testName() {
        assertTrue(true);
    }
}
