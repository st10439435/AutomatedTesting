/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unit_testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tasve
 */
public class Unit_TestingTest {
    
    public Unit_TestingTest() {
    }

    @org.junit.jupiter.api.Test
    public void testAddition() {
        
        Unit_Testing ut = new Unit_Testing();
            
            
        int expected = 4;
        int actual = ut.addition(2, 2);
        
        assertEquals(expected, actual);
        
    }
    
    @org.junit.jupiter.api.Test
    public void testSubtracyion() {
        
        Unit_Testing ut = new Unit_Testing();
            
            
        int expected = 6;
        int actual = ut.subtraction(10, 4);
        
        assertEquals(expected, actual);
 }
    @org.junit.jupiter.api.Test
    public void testMessage() {
        
        Unit_Testing ut = new Unit_Testing();
            
            
        String expected = "Hello world!";
        String actual = ut.message();
        
        assertEquals(expected, actual); 
    }
}