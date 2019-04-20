/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;

import com.banking.TransactionType;
import java.time.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author AgnesB
 *
 */
public class Transaction implements Comparable<Transaction> {
    private static final int nextID = 1;

    //private final int id;                  //remove final to test
    private int id;
    private LocalDateTime timestamp;        //remove final to test
    private TransactionType type;           //remove final to test 
    private double amount;                  //remove final to test
    private String description;       //remove final to test  
    /**
     * @param type The type of this transaction
     * @param amount The amount of the transaction
     * @param description The description of the transaction.
     *        This may include check numbers, memo, payee, etc.
     */
    public Transaction (TransactionType type, double amount,
            String description) {
        this.id = 0;
        this.type = null;
        this.amount = 0.00;
        this.description = "";
        this.timestamp = LocalDateTime.now();
        // Stub
    }

    Transaction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

         
    /**
     * @return the id
     */
    public int getId () {
        System.out.println("getId");
        //return 0;  // Stub
        return id;
    }
    /**
     *  @param id the id to set 
    */ 
    
    public void setid(int id){
     this.id = id;   
    }
    
    /**
     * @return the timestamp for this transaction
     */
    public LocalDateTime getTimestamp () {
        //return null;  // Stub
        return timestamp;
    }

    /**
     *  @param timestamp the timestamp to set 
    */ 
    
    public void setTimestamp(int timestamp){
     this.timestamp = LocalDateTime.now();  
    }
        
    /**
     * @return the transaction type
     */
    public TransactionType getType () {
        //return null;  // Stub
        return type;
    }

    /**
     * @param type
     * @param TransactionType
    */ 
    
    public void setTransactionType(TransactionType type, TransactionType TransactionType){
     this.type = TransactionType;  
    }
    
    
    /**
     * @return the amount of this transaction.
     * Transaction amounts are always positive.
     */
    public double getAmount () {
        // return 0.00;  // Stub
        return amount;
    }

    /**
     * @param amount
    */ 
    
    public void setAmount(double amount){
     this.amount = amount;  
    }
           
    /**
     * @return the description
     */
    public String getDescription () {
        // return null;  // Stub
        return description;
    }

    /**
     *  @param description the description to set 
    */ 
    
    public void setDescription(String description){
     this.description = description;   
    }
    
    @Override
    public String toString () {
        return "";  // Stub
    }

    @Override
    public int hashCode () {
        return 1;  // Stub
    }

    @Override
    public boolean equals (Object obj) {
        return false;  // Stub
    }

    @Override
    public int compareTo (Transaction other) {
        return 0;  // Stub
    }

       
    
}
