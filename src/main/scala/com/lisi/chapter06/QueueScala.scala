package com.lisi.chapter06

import scala.collection.mutable

class QueueScala {

}

object mainTest02{
  def main(args: Array[String]): Unit = {
    val q1=new mutable.Queue[Int]();
    println(q1)
    q1+=1;  //队列元素的追加
    println(q1)
     //向队列中追加List
    q1++=List(2,3,4);
    println(q1);
    // 按照进入队列的顺序删除元素
    q1.dequeue();
    println(q1)
    //塞入元素
    q1.enqueue(9, 8, 7)
    //返回队列的第一个元素
    println(q1)
    println("head="+q1.head)
    // 返回队列最后一个元素
    println("last="+q1.last)
    // 返回除了第一个以外剩余的元素（尾部）
    println("tail="+q1.tail)

  }
}
