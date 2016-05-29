package com.katas.bowling;

import org.junit.*;

public class AppTest {

    private App _app;
	
    @Before
    public void setUp(){
       _app = new App();
    }	

    @Test
    public void testOnes() {
       Assert.assertEquals(20, _app.game("11111111111111111111"));
    }
   
    @Test
    public void testTwos() {
       Assert.assertEquals(40, _app.game("22222222222222222222"));
    }

    @Test
    public void testOneSpare() {
       Assert.assertEquals(48, _app.game("2/222222222222222222"));
    }

    @Test
    public void testOneStrike() {
       Assert.assertEquals(50, _app.game("X222222222222222222"));
    }
}


