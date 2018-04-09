package com.service.juantest49.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestJuantest49 {

        Juantest49Delegate juantest49Delegate = new Juantest49Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = juantest49Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}