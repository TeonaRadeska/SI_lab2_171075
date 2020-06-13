package test.java;


import jdk.nashorn.internal.ir.annotations.Reference;
import main.java.SILab2;
import main.java.SILab2.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class SILab2Test {

    @Reference
    SILab2 siLab2 = new SILab2();

    private List<String> createAllUsers(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEveryBranch() {
        User user = null;
        assertFalse(siLab2.function(user, createAllUsers()));

        user = new User("Tea","test","tea@asd.com");

        assertTrue(siLab2.function(user, createAllUsers("Maja","Borce")));

        user = new User(null,"test","tea@sdg.com");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));

        user = new User("Tea","test","teaasdcom");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));

    }
    @Test
    void testEveryPath() {
        User user = null;
        assertFalse(siLab2.function(user, createAllUsers()));

        user = new User("Tea","test","tea@asd.com");

        assertTrue(siLab2.function(user, createAllUsers("Maja","Borce")));

        user = new User(null,"test","tea@sdg.com");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));

        user = new User("Tea","test","teaasdcom");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));

        user = new User("Tea","test","tea@asdcom");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));

        user = new User("Tea","test","teaasd.com");

        assertFalse(siLab2.function(user,createAllUsers("Maja","Borce")));


    }
}