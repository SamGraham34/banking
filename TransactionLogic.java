/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;

import com.banking.Transaction;

/**
 *
 * @author Agnes B
 */
//public void deposit(double depositAmount) {
//   balance = balance + depositAmount;   } 
//public void withdraw(double withdrawalAmount) {
//   balance = balance - withdrawalAmount;
 

public class TransactionLogic {
    // Calculate the Deposit

    /**
     *
     * @param transaction
     * @return
     */
    public double calculateDeposit(Transaction transaction){
      double depositAmount = 150.00;
      depositAmount = depositAmount + transaction.getAmount();
      return depositAmount;
    }
    
    //public double withdrawal(Transaction transaction){
   //   double withdrawalAmount;
   //   withdrawalAmount = 0;
   //   withdrawalAmount = withdrawalAmount + transaction.getAmount();
   //   return withdrawalAmount;   
   // }
    
}
