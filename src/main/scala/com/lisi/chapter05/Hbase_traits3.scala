package com.lisi.chapter05

class Hbase_traits3 extends Exception{
  def log(): Unit ={
    print(getMessage) // 方法来自于Exception类
  }
}

class Hbase_traits4 extends Exception{
  override def getMessage: String = "错误消息"
  def log(): Unit ={
    print(getMessage) // 方法来自于Exception类
  }
}


class Hbase_traits5 extends Exception{
 this:Exception=>
  def log(): Unit ={
    println(getMessage);
  }
}

object  maintest222{
  def main(args: Array[String]): Unit = {
    new Hbase_traits3().log()
    println()
    new Hbase_traits4().log()
  }
}
