package com.arnab.junit.Script;

import org.junit.*;

public class FirstTest {

    private static int seqNo;

    @Test       /* first test */
    public void print() {
        System.out.println(seqNo+":"+"Testing first");
        seqNo++;
    }

    @Test       /* second test */
    public void secondCase() {
        System.out.println(seqNo+":"+"launching the app");
        seqNo++;
    }

    @Before
    public void beforeEveryTestCase() {
        System.out.println(seqNo+":"+"before every case");
        seqNo++;
    }


    @After
    public void afterEveryTestCase() {
        System.out.println(seqNo+":"+"after every case");
        seqNo++;
    }


    @BeforeClass
    public static void beforeClass() {
        System.out.println("seqNo"+":"+"setting the drivers");
        seqNo++;
    }

    @AfterClass
    public static void afterClass() {
        System.out.println(seqNo+":"+"tearing down drivers");
        seqNo++;
    }

}
