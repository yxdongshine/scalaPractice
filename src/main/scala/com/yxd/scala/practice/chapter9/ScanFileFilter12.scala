package com.yxd.scala.practice.chapter9

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

/**
 * Created by 20160905 on 2017/8/11.
 */
class ScanFileFilter12 {

  val patten =
    """^[1-9]\d*$""".stripMargin
  def displayLager12(path:String) = {

   Source.fromFile(path,"GBK")
     .getLines()
     .toArray
     .foreach(_.split(" ")
     .foreach(value => { if (value.matches(patten)) println(value) }))
  }
}
