package com.lisi.chapter03

import com.lisi.chapter03

class Scala08_outclass {
  class  innerClass{

  }

}

object Scala08_outclass {
  class  staticClass{

  }
}

object mainTest{
  def main(args: Array[String]): Unit = {
    val outer=new Scala08_outclass();
    var inner=new outer.innerClass();
    println("*****")
    var staticInner=new chapter03.Scala08_outclass.staticClass();
  }
}