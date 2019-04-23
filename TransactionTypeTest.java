/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;
import com.banking.TransactionTypeTest.TransactionType;
import static java.lang.String.valueOf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
 


/**
 *
 * @author Agnes B
 */
public class TransactionTypeTest {
    public TransactionTypeTest() {
    }
      
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    
    public enum TransactionType {
        DEPOSIT, WITHDRAWAL, INTEREST, CHECK, FEE, PENALTY, ADJUSTMENT; 
    }
     
    
    @Test
    public void TransactionTypeEnum(){
      
       TransactionType transactionType;
       transactionType = TransactionType.DEPOSIT;
       System.out.println("Transaction Type enum is set a value: " + transactionType);
       assertEquals("DEPOSIT",transactionType);
    }
}