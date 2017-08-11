package com.yxd.scala.practice.chapter9

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

/**
 * Created by 20160905 on 2017/8/11.
 */
class SumInFile {


  def readFileAndRever(path:String) = {
    val ab =  ArrayBuffer[Integer]()
    val lineIter = Source.fromFile(path,"GBK").getLines()
    while (lineIter.hasNext){
      lineIter.next().split(" ").foreach(
      value => {
        value match {
        //  case Integer => ab.+=(Integer.parseInt(value))
          case AnyRef =>
        }
      }

      )
    }

    //翻转排序 输出
   // println(ab.sum)
  }

}
