package com.yxd.scala.practice.chapter5
import scala.beans.BeanProperty
/**
 * Created by 20160905 on 2017/8/8.
 */
class Counter {
  @BeanProperty var counter:Int = _

  def add(addValue:Int):Int = {

    if( counter + addValue > Int.MaxValue ){
      counter = Int.MaxValue
    }else{
      counter += addValue
    }
    counter
  }


}
