package org.xpdojo.bank;

public class Account {
 double balance;

 double deposit(double amount){
     balance+=amount;
     return balance;
 }
}
