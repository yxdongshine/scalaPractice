package com.yxd.scala.practice.chapter10

/**
 * Created by Administrator on 2017/8/11 0011.
 */
class ImplClass extends ImplSuperClass with ImplTrait with SuperTrait{



  val tamp = 10

  override def getTamp: Unit = {
    println(tamp)

  }
}
