package com.lisi.chapter06
import scala.collection.mutable.Set
class ScalaSet {

}

object mainTest5{
  def main(args: Array[String]): Unit = {
    //不重复无序
    // Set不可变集合的创建
    val set=Set(1,2,3);
    print("set="+set);
    // Set可变集合的创建，如果import了可变集合，那么后续使用默认也是可变集合
    println("set add4")
    set.add(4);
    println("set add="+set)


  }
}
