package com.yxd.scala.practice.chapter6
import scala.beans.BeanProperty
/**
 * Created by 20160905 on 2017/8/9.
 */
class Point {
  @BeanProperty var x = 0.0
  @BeanProperty var y = 0.0

  def getPoint : String = {

    "坐标："+ x +" "+ y
  }

}


object Point{

  def apply( x:Double, y:Double)= {
    val  p = new Point
    p.setX(x)
    p.setY(y)
    println(p.getPoint)
  }

  def pout={
    val  p = new Point
    println(p.getPoint)
  }

  def main (args: Array[String] ): Unit = {
    Point(1.0,2.0)
  }
}

