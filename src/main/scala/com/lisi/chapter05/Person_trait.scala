package com.lisi.chapter05

trait Person_trait {
  def insert(id :Int ): Unit ={
    println("id="+id)
  }

}

class teacher extends  Person_trait  with Serializable {

}

class  teacher2{

}
object maintest{
  def main(args: Array[String]): Unit = {
    var teac=new teacher();
    teac.insert(2);
    var teac2=new teacher2() with Person_trait;

    teac2.insert(3);
  }
}
