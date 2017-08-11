package com.yxd.scala.practice.chapter9

/**
 * Created by 20160905 on 2017/8/11.
 */
class SerPerson(name:String,age:Int) extends  java.io.Serializable{


  def getPerson(age:Int) = {
    println("name: "+name + " age: "+age)

  }


}
