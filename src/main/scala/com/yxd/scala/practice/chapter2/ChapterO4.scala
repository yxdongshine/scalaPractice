package com.yxd.scala.practice.chapter2

import java.io.File
import java.util.Scanner

import scala.collection.mutable

/**
 * Created by 20160905 on 2017/8/4.
 */
object ChapterO4 {

  /**
   * 读取文件 并统计单词
   */
  def countWordInFile(): Unit ={
    val path = "D:\\BaiduNetdiskDownload/debug.log"
    val in =new Scanner(new File(path))
    val mMap = new mutable.HashMap[String,Int]()
    while (in.hasNext){
      val lineArr = in.nextLine().split(" ")
      for(i <- 0 until(lineArr.size)){
        var temp = lineArr(i)
        var tempCount = mMap.getOrElse(temp,0)
        if(tempCount > 0){
          //已经存在情况下
          mMap.+=(temp->tempCount.+(1))
        }else{
          //没有 新增
          mMap.+=(temp->1)
        }
      }
    }

    //输出查看
    for( (key,value)<- mMap){
      println(key+"->"+value)
    }
  }

  /**
   * 拉链操作
   */
  def zipMinMax(): Unit ={
    val na = Array(1, 2.0,-5,6,-3)
    val minna = Array(na.min)
    val maxna = Array(na.max)
    minna.zip(maxna).foreach(println(_))
    "hello".zip("world").foreach(println(_))
  }

  def main(args: Array[String]) {
    //countWordInFile
    zipMinMax
  }

}
