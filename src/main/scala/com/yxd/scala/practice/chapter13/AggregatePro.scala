package com.yxd.scala.practice.chapter13

import scala.collection.mutable

/**
 * Created by 20160905 on 2017/8/16.
 */
class AggregatePro {

  def getIndexMap(str:String)={
    val map = new mutable.HashMap[Char,String]()
    val hs = new mutable.HashSet[Char]()
    var index = 0
    str
      .toCharArray
      .foreach(char => {
       val value = map.get(char)
      if (value != null){
        map.put(char,value.getOrElse("") + " "+index)
      }else{
        map.put(char,index+" ")
      }
      index += 1
    })
    map.foreach(println(_))
  }

  def getIndexHashSet(str:String)={
    val hs = new mutable.HashSet[MapCompare]()
    var index = 0
    str
      .toCharArray
      .foreach(char => {
      val value = hs.find(_.getChar().equals(char))
      if (value != null){
        hs.update(new MapCompare(char,value.toString+ " "+index),true)
      }else{
        hs.add(new MapCompare(char,index+" "))
      }
      index += 1
    })
    hs.foreach( mc =>{ println(mc.getExpress()) } )
  }



  def removeLinkListEle(): Unit ={
    val ll =  mutable.LinkedList(1, 2, 0, 0, 5)
    val lln = ll.filter(llv => llv > 0)

    lln.foreach(println(_))
  }


  def eqMkstring(): Unit ={
    val lv = List(1, 2, 0, 0, 5)
    println(lv.mkString)
    println("============")
    lv.reduceLeft((x,y) => Integer.parseInt( x+"".+(y+"")))
  }

  def takeGroup(col:Int): Unit ={
    val lv = List(1, 2, 0, 0, 5)
    val array = mutable.ArrayBuilder
    val gcol = lv.grouped(col)
    gcol.foreach(
    array.make().+=(_)
    )

  }

}
