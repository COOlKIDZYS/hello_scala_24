object HelloWord {
  /**
   */
case class CheckHeartBeat(name:String,time:Int)
  def main(args: Array[String]): Unit = {
    println("------------------匹配类型----------------")
    matchType(1)
    matchType(10L)
    matchType("123")
    matchType(true)
    println("------------------匹配数组----------------")
    arrayMatch(Array(0))
    arrayMatch(Array(0, "1"))
    arrayMatch(Array(1, true, 3))
    arrayMatch(Array(8, 9, 10))
  }

  def matchType(line: Any) = line match {
    case line: Int => println(s"$line 类型是Int")
    case line: Long => println(s"$line 类型是Long")
    case line: String => println(s"$line 类型是String")
    case _ => println(s"$line 类型未知")
  }

  def arrayMatch(arr: Any) = arr match {
    case Array(0) => println("只有0元素的数组")
    case Array(0, _) => println("0开头并且有两个元素的数组")
    case Array(1, _, 3) => println("3个元素的数组")
    case Array(8, _*) => println("8开头的数组")
  }

  def listMatch(list: Any) = list match {
    case 0 :: Nil => println("只有0")
    case 7 :: 9 :: Nil => println("7,9的list")
    case x :: y :: z :: Nil => println("有3个元素的list")
    case m :: n => println("-------------") //拥有head和tail的list
  }

  def tupleMatch(tuple: Any) = tuple match {
    case (0, _) => println("元祖第一个为0，第二个元素为任意类型，并且只有两个元素")
    case (x, m, k) => println("有3个元素的元祖")
    case (_, "AK47") => println("AK47")//元祖最多22
    case (a,b,c,d)=>print("形式大好")
  }
}
