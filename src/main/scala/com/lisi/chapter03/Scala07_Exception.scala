package com.lisi.chapter03

object Scala07_Exception {
  //classOf[NumberFormatException] 相当于
  // java中的NumberFormatException.class

  @throws(classOf[NumberFormatException])
  def f11={
    "abc".toInt;
  }

  def main(args: Array[String]): Unit = {

    try {
      var i=10/0;
    }catch {
      case ex: Exception => println("捕获了异常")
      case ex: ArithmeticException=> println("捕获了除数为零的算数异常")

    }finally {
      println("执行完毕")
    }

  }

}
