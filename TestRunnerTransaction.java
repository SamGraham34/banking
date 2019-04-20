/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Agnes B
 */
public class TestRunnerTransaction {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TransactionLogicTest.class);
		
      result.getFailures().forEach((failure) -> {
          System.out.println(failure.toString());
       });
		
      System.out.println(result.wasSuccessful());
   }
 
    
    
    
}
