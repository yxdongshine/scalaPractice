package com.yxd.scala.practice.chapter9

import java.io.{FileInputStream, ObjectInputStream, FileOutputStream, ObjectOutputStream}

/**
 * Created by 20160905 on 2017/8/11.
 */
object O9Test {
  def main(args: Array[String]) {

    val path = "D:\\\\BaiduNetdiskDownload\\\\debug.log";
   /* val rsFile = new ReverScanFile
    rsFile.readFileAndRever("D:\\BaiduNetdiskDownload\\debug.log")
*/
    val f12 = new ScanFileFilter12
    f12.displayLager12(path)

/*    val patten =
      """
        ^[1-9]\d*$
        """.r
    println(patten.findAllIn("222 ".trim).toArray.length)*/

/*    val sif = new SumInFile
    sif.readFileAndRever(path)*/
    //testSerPerdson
  }

  def testSerPerdson ={
    val sp = new SerPerson("yxzd",55)
    //写出
    val path = "D:\\\\BaiduNetdiskDownload\\\\scala_ser.obj"
    new ObjectOutputStream(new FileOutputStream(path)).writeObject(sp)
    val in = new ObjectInputStream(new FileInputStream(path))
    val inObject = in.readObject().asInstanceOf[SerPerson]
    println(inObject.getPerson(1))
  }
}
