package com.lisi.chapter06

import scala.collection.mutable

class TupleTest {

}

object TupleTest{
  def main(args: Array[String]): Unit = {
    val tuple1=(1,2,3,"heiheihei");
    println(tuple1)
    println("*****")
    println(tuple1._4)
    println("***");
    for(elem<-tuple1.productIterator){
      println(elem);
    }
    println("***");
    for(elem<-tuple1.productIterator){
      println(elem);
    }

    println("******list*****")
    val list1=List(1,2);
    println(list1);
    println("******list null*****")
    val list02=Nil;
    println(list02);
    println("******访问List元素*****")
    val value01=list1(1);
    println(value01)
    println("*****List元素的追加*****")
    val list03 = list1 :+ 99;
    println("list03="+list03);
    val list04=100+:list1;
    println("list04="+list04)

    println("list03="+list03);

    val  list05=1::2::3::list1::Nil
    println("list05="+list1)


  }
}