/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;




/**
 *
 * @author Agnes B
 */
public class TestRunnerTransactionType {
    public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TransactionTypeTest.class);
		
      result.getFailures().forEach((failure) -> {
          System.out.println(failure.toString());
      });
		
      System.out.println(result.wasSuccessful());
      System.out.println("Transaction Test Run Successful");
   }   
}
