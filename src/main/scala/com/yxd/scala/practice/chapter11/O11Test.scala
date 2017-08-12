package com.yxd.scala.practice.chapter11

/**
 * Created by Administrator on 2017/8/12 0012.
 */
object O11Test {
  def main(args: Array[String]) {
    //println(3->(4+5))
    val  bs = BigSequence.apply(10)
    println(bs.tamp)
    println(BigSequence.unapply(0))
  }

}
