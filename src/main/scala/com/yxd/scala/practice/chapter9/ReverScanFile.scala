package com.yxd.scala.practice.chapter9

import scala.collection.mutable.ArrayBuffer
import scala.io.Source

/**
 * Created by 20160905 on 2017/8/11.
 */
class ReverScanFile {

  def readFileAndRever(path:String) = {
    val ab =  ArrayBuffer[String]()
    val lineIter = Source.fromFile(path,"GBK").getLines()
    while (lineIter.hasNext){
      ab.+=(lineIter.next())
    }

    //翻转排序 输出
    ab.reverse.foreach(println(_))
  }

}
