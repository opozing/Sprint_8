package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class StartsEndsSpaceTest {

    private final String name;
    private final boolean expected;

    public StartsEndsSpaceTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"UstinovSergey", false},
                {"Ustinov Sergey", true},
                {" Ustinov Sergey", false},
                {"Ustinov Sergey ", false}
        };
    }

    @Test
    public void isStartsEndsWithoutSpace() {
        Account account = new Account(name);
        boolean actual = account.isStartsAndEndsWithoutSpaces();
        Assert.assertEquals(expected, actual);
    }
}
