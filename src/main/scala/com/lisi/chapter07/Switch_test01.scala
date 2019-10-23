package com.lisi.chapter07

object Switch_test01 {
  def main(args: Array[String]): Unit = {
    var result=0;
    val op:Char ='3';
    op match {
      case '+'=>result=1;
      case '-'=>result= -1;
      case _ if op.toString.equals("3")=>result=3;
      case _ =>result=2;
    }
    println("result="+result)
  }

}
