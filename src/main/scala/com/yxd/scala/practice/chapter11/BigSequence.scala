package com.yxd.scala.practice.chapter11

/**
 * Created by Administrator on 2017/8/12 0012.
 *
 * BigSequence() 为主构造函数
 * 自定义函数必须 def this +变化参数、函数里面必须调用主构造函数 this
 * 参考:http://www.cnblogs.com/shihuc/p/5073753.html
 */
class BigSequence() {

  var tamp = 0

  def this(stuctsPara:Int)={
    this
    tamp = stuctsPara
  }

}

object BigSequence{

  def apply(initPara:Int): BigSequence ={

    new BigSequence(initPara)
  }


  def unapply(para:Int): Int ={
    10
  }

}
