package com.yxd.scala.practice.chapter8

/**
 * Created by Administrator on 2017/8/10 0010.
 */
class LabeledPoint extends Point{

  private var label:String = null
  def this(label:String,x:Double,y:Double)={
    this
    super.Point(x,y)
    this.label = label
  }

  override def getPoint():String={
    val str = "label: "+label +" x "+x +": y "+y
    println("zilei："+str)
    str
  }
}
