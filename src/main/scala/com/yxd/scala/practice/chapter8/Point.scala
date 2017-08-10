package com.yxd.scala.practice.chapter8

/**
 * Created by Administrator on 2017/8/10 0010.
 */
class Point {
  var x = 0.0
  var y = 0.0
  def Point(x:Double,y:Double): Unit ={
    this.x= x
    this.y = y

  }

  def getPoint():String={
    val str = "x "+x +": y "+y
    println("super："+str)
    str
  }
}
