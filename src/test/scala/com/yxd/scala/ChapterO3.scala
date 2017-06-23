package com.yxd.scala

import scala.util.Random

/**
 * Created by 20160905 on 2017/5/23.
 */
object ChapterO3 {



  def domArr(num:Int):Unit = {
    var arr = new Array[Int](num)
    val random = new Random();
    for(i <- 0 until(arr.length)){
      arr(i) =random.nextInt(num)
    }
    for(i <- 0 until(arr.length)){
      println(arr(i))

    }

  }

  //def exchangePostion(a:Int , b)


  def main(args: Array[String]) {
     domArr(10)
  }

}
