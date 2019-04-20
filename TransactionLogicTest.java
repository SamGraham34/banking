/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Agnes B
 */
public class TransactionLogicTest {
    TransactionLogic transactionLogic;
    Transaction transaction;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    public TransactionLogicTest() {
        this.transactionLogic = new TransactionLogic();
    }

    //public TransactionLogicTest() {
   //     this.transaction = new Transaction();
   // }

    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    // test to check depositAmount

    /**
     *
     */
    @Test
    public void testDeposit(){
       transaction.setid(01);  
       transaction.setAmount(100.00);
       double depositAmount = transactionLogic.calculateDeposit(transaction);
       assertEquals(100.00,depositAmount,250.00);
       
    }

    
             
    
    
}
