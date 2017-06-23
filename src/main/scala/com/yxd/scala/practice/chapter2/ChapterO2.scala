package com.yxd.scala.practice.chapter2

/**
 * Created by 20160905 on 2017/5/23.
 */
object ChapterO2 {

  def forPractice(int: Int):Unit ={
    for (i <- 1 to int ){
      println(i)
    }

    var num = int
    while (num > 0){
      num = num - 1
      print(num)
    }
  }

  def  producee(num:Int){

    for(i <- 1 until(10))println(i+"process")
  }

  def forStr(string: String):Int={
    var  sum = 1
    val arr = string.toArray
    for (i <- 0 until arr.length){
      sum *= ( arr(i).hashCode())
    }
    sum
  }

  def dStr(string: String):Int = {

    var  sum = 1

    val arr = string.toArray
    var num = arr.length
    sum *= arr(num).hashCode()
    if(num > 0 ){
      dStr(string)
    }
    num -= 1
    sum
  }
  def main (args: Array[String]) {
    //forPractice(9)
    //producee(10)
    println(forStr("nihao"))
  }

}
