package com.yxd.scala.practice.chapter8

/**
 * Created by Administrator on 2017/8/10 0010.
 */
class BankAccount (initBalance:Double){

  private  var balance = initBalance

  def deposit(amount:Double):Double={
    balance = balance + amount
    balance
  }

  def withdraw(amount:Double):Double={
    balance -= amount
    balance
  }
}
