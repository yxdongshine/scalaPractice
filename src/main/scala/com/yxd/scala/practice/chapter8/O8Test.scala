package com.yxd.scala.practice.chapter8

/**
 * Created by Administrator on 2017/8/10 0010.
 */
object O8Test {
  def main(args: Array[String]) {
    val ca = new CheckAccount
    println(ca.deposit(10))

    val lp = new LabeledPoint("testlabel",102.0,111.4)
    println(lp.getPoint)
  }

}
