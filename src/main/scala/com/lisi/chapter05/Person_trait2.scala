package com.lisi.chapter05

trait Person_trait3 {
  def insert(id :Int );
}

class teacher3 extends  Person_trait3  with Serializable {
  override def insert(id:Int): Unit ={
    println("wo de id = "+id)
  }
}


class  teacher22{
}

object maintest2{
  def main(args: Array[String]): Unit = {
    var teac=new teacher3();
    teac.insert(2);
    var teac2=new teacher22() with Person_trait3 {
      override def insert(id:Int): Unit ={
        println("wo de2 id = "+id)
      }
    };
    
    teac2.insert(3);
  }
}
