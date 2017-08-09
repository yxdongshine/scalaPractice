package com.yxd.scala.practice.chapter5

import scala.beans.BeanProperty

/**
 * Created by 20160905 on 2017/8/8.
 */
class Person(private val fristName:String,val lastName:String) {

  this//调用主构造函数
  def Person(fristName:String, lastName:String) = {
    this

  }

  def getName:String = {
    fristName+"  "+lastName
  }

  getName
}
