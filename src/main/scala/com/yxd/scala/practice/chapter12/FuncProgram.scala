package com.yxd.scala.practice.chapter12

import com.sun.org.apache.bcel.internal.generic.NEW


/**
 * Created by Administrator on 2017/8/13 0013.
 */
class FuncProgram {

  def getTureList(low:Int,high:Int):Array[(Int,Int)]={
    val at = new Array[(Int,Int)](high-low)

    for (i <- low until high){
      at(i) = (i,i*i)
    }
    at
  }

  def getSqure(num:Int):Int={
    num*num
  }


  def values(fun:(Int)=>Int,low:Int,high:Int)={
    val indexNum = high-low+1
    val at = new Array[(Int,Int)](indexNum)
    var index = 0
    for (i <- low to high){
      at(index) = (i,fun(i))
      index+=1
    }
    at.foreach(tuple2 => println(tuple2._2))
    at
  }


  def getManInArray():Int={
    val array = Array(15,54,4,545,55)
    array.reduceLeft(_.max(_))
  }

  def getNumJ(num:Int):Int={
    val array = 1.to(num)
    array.reduceLeft(_*_)
  }


}
