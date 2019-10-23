package com.lisi.chapter06

import scala.collection.mutable.ArrayBuffer

class ArrayTest01 {

}

object test01{
  def main(args: Array[String]): Unit = {
    var arr1=new Array[Int](10);
    arr1(1)=10;
    println(arr1(1));
    var arr2=Array(1,2,3);
    print("arr2="+arr2(0));
    print("****")
    //定义
    var ab=new ArrayBuffer[Int]();
    //追加值
    ab.append(7);
    //重新赋值
    println("ab="+ab);
    println("ab2="+ab(0));
    println("ab3="+ab.toBuffer)
    println("ab3="+ab.toArray)
    //多维数组
    var arr=Array.ofDim[Double](3,4);
    //赋值
    arr(1)(1)=11.11;
    println(arr(1)(1))




  }


}
