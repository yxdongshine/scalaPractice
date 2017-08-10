package com.yxd.scala.practice.chapter8

/**
 * Created by Administrator on 2017/8/10 0010.
 */
class CheckAccount extends BankAccount(initBalance = 100){

  private final  val fee = 2.0

  def CheckAccount(moneoy:Double)={

  }

  override def deposit(amount:Double):Double={
    super.deposit(amount) - fee
  }

  override def withdraw(amount:Double):Double={
    super.withdraw(amount) - fee
  }
}
