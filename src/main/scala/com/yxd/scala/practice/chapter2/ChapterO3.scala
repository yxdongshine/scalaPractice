package com.yxd.scala.practice.chapter2

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

/**
 * Created by 20160905 on 2017/5/23.
 */
object ChapterO3 {


  /**
   *
   * 产生随机数组部分
   * @param num
   */
  def domArr(num:Int):Array[Int] = {
    var arr = new Array[Int](num)
    val random = new Random();
    for(i <- 0 until(arr.length)){
      arr(i) =random.nextInt(num)
    }
    for(i <- 0 until(arr.length)){
      println(arr(i))
    }
    return arr
  }


  /**
   * 数组交换部分
   * @param a
   * @param b
   * @return
   */
  def exchangePostion(a:Int , b:Int):Array[Int] = {
    val  arr = new Array[Int](2)
    if(a > b){
      arr(0) = b
      arr(1) = a
    }else{
      arr(0) = a
      arr(1) = b
    }

    return arr
  }

  def exchangePostionArray():Unit = {
    var da = domArr(5)
    for(i <- 0 until(da.length - 1)){
      var exchangeArr = exchangePostion(da(i),da(i+1))
      if(exchangeArr.nonEmpty && 2 == exchangeArr.size ){
        da(i) = exchangeArr(0)
        da(i+1) = exchangeArr(1)
      }
    }
    da.foreach(print(_))
  }

  def exchangePostionArrayYield():Unit = {
    var da = domArr(5)
    for(i <- 0 until(da.length - 1) if da(i) > da(i+1) )
      yield {
        var temp = da(i)
        da(i) = da(i + 1)
        da(i+1) = temp
      }
    da.foreach(print(_))
  }

  def splitArrayPN():Unit = {
    val na = Array(1, 2.0,-5,6,-3)
    val pna = new ArrayBuffer[Double]
    val nan = new ArrayBuffer[Double]
    for (i <- 0 until(na.length)){
      val temp = na(i)
      if( temp > 0 ){
        pna.append(temp)
      }else{
        nan.append(temp)
      }
    }
    pna.++=(nan)
    pna.foreach(print(_))
  }

  /**
   * 计算平均值
   */
  def couDoubleArrayAvg():Unit = {
    val na = Array(1, 2.0,-5,6,-3)
    print(na.sum/na.size)
  }

  /**
   * 翻转排序
   */
  def sortAndRe():Unit = {
    val na = Array(1, 2.0,-5,6,-3)
    val pna = new ArrayBuffer[Int]
    val random = new Random();
    for(i <- 0 until(na.length)){
      pna.append(random.nextInt())
    }
    pna.foreach(println(_))
    na.reverse.distinct.foreach(println(_))
    pna.reverse.foreach(println(_))

  }
  /**
   * 测试类
   * @param args
   */
  def main(args: Array[String]) {
    //domArr(10)
    //exchangePostionArray()
    //exchangePostionArrayYield()
    //splitArrayPN()
    //couDoubleArrayAvg()
    sortAndRe
  }

}
