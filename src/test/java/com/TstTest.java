package com;

import org.junit.Test;


public class TstTest {
    @Test
    public void a() {
        System.out.println("a");
    }

    @Test
    public void b() {
        assert 1 == 2;
        System.out.println("b");
        throw new RuntimeException();
    }

}
