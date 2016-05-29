package com.kata.bowling;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    private App _app;

    @Before
    public void setUp() {
        _app = new App();
    }

    @Test
    public void testOnes() throws Exception {
        Assert.assertEquals(20, _app.game("11111111111111111111"));
    }

    @Test
    public void testVariousSimpleThrows() throws Exception {
        Assert.assertEquals(40, _app.game("22222222222222222222"));
    }

    @Test
    public void testOneSpare() throws Exception {
        Assert.assertEquals(29, _app.game("1/111111111111111111"));
    }
}
