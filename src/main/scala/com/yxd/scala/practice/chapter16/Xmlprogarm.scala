package com.yxd.scala.practice.chapter16

import scala.xml.parsing.XhtmlParser
import scala.xml.parsing.ConstructingParser
import scala.xml._
import scala.xml.transform._

/**
 * Created by 20160905 on 2017/8/24.
 */
class Xmlprogarm {

  def easyTest(): Unit ={
    println(<fred/>(0)(0))
    println("===============")
    val xml =
      <ul>
        <li>opening backed:[</li>
        <li>closing backed:]</li>
        <li>opening other:</li>
        <li>closing other:</li>
      </ul>
    println(xml)
    println("===============")

      <li>fred</li>
      match {
        case <li>{Text(t)}</li> => println("==1==="+t)
      }


      <li>{"fred"}</li>
      match {
        case <li>{Text(t)}</li> => println(t)
      }
    }


  def parseXml(): Unit ={
    val path = "D:\\meb_report.xml"
    val xmlRoot = XML.loadFile(path)
    println(xmlRoot.label)
    val childList = xmlRoot.child
    childList.foreach(
      child => {
         println(child.label)
         for(attr <- child.attributes){
           println(attr.key+"  "+attr.value.text)
         }
        println(child.text)
        println("===================")
      }
    )

  }


  def makeXmlAndSave(): Unit ={

    val root = <ul>{
    for (i <- 0 to(5))
      yield <li>{i}</li>}
      </ul>
    println(root)

    val path ="D:\\make_x.xml"
    XML.save(path,root)
  }

}
