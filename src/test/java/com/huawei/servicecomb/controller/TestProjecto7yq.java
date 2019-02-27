package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecto7yq {

        Projecto7yqDelegate projecto7yqDelegate = new Projecto7yqDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecto7yqDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}