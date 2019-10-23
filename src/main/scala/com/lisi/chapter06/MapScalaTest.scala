package com.lisi.chapter06

import scala.collection.mutable

class MapScalaTest {

}

object  mainTest{
  def main(args: Array[String]): Unit = {
    //构造不可变映射
    val map=Map("lisi"->10,"jiangjiang"->20,"xiang"->30);;
    //构造可变映射
    val map2=scala.collection.mutable.Map("alice"->10,"Bob"->20);
    //空的映射
    val map3=new mutable.HashMap[String,Int]();
    //对偶元祖
    val map4=mutable.Map(("alice",10),("Bob",20),("cc",30));
    println("map4="+map4("alice"));
    map4("alici")=55;
    print("map4="+map4("alice"));

    for ((k,v)<-map4){
      println("k="+k+",v="+v);
    }
    println("****kv****")
    for ((k,v)<-map4){
      println("k="+k+",v="+v);
    }

    println("****k****")
    for (k<-map4.keys){
      println("k="+k)
    }

    for (v<-map4.values){
      println("v="+v)
    }
  }
}
