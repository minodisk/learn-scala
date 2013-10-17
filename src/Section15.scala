import math.{E,Pi}

object Section15 {

  def main(args:Array[String]) {
    val v = Var("x")
    println(v)
    val op = BinOp("+", Number(1), v)
    println(op)
    println(v.name)
    println(op.left)
    println(op.right == Var("x"))
    println(op.copy(operator = "-"))
    println(simplifyTop(UnOp("-", UnOp("-", Var("x")))))

    println(describe(5))
    println(describe(true))
    println(describe("hello"))
    println(describe(Nil))
    println(describe(List(1,2,3)))

    println(E match {
      case Pi => "strange math? Pi = " + Pi
      case _ => "OK"
    })
    val pi = Pi
    println(E match {
      case pi => "strange math? Pi = " + pi
      case _ => "OK"
    })
    println(E match {
      case `pi` => "strange math? Pi = " + pi
      case _ => "OK"
    })

    List(0,1,2) match {
      case List(0,_,_) => println("found it")
      case _ =>
    }
    List(0,1,2,3,4,5) match {
      case List(0,_*) => println("found it")
      case _ =>
    }

    tupleDemo("a ", 3, "-tuple")
    tupleDemo("a", " ", 4, "-tuple")

    println(generalSize("abc"))
    println(generalSize(List('a', 'b', 'c', 'd')))
    println(generalSize(Map(1 -> 'a', 2 -> 'b')))
    println(generalSize(math.Pi))

    println("z".isInstanceOf[String])
    println("z".isInstanceOf[Int])
    println(5.isInstanceOf[Int])

    println(isIntIntMap(Map(1 -> 1, 2 -> 2)))
    println(isIntIntMap(Map(1 -> 'a', 2 -> 'b')))

    println(isStringList(List(1,2,3)))
    println(isStringList(List("abc", "def")))
    val l:List[Int] = List(1,2,3)
    println(isStringList(l))

    println(isStringArray(Array("abc", "def")))
    println(isStringArray(Array(1, 2, 3)))
  }

  def simplifyTop(expr:Expr):Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case _ => expr
  }

  def describe(x:Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  }

  def tupleDemo(expr:Any) =
    expr match {
      case (a, b, c) => println("matched " + a + b + c)
      case _ =>
    }

  def generalSize(x:Any) =
    x match {
      case s:String => s.length
      case l:List[_] => l.length
      case m:Map[_, _] => m.size
      case _ => -1
    }

  def isIntIntMap(x:Any) =
    x match {
      case m:Map[Int, Int] => true
      case _ => false
    }

  def isStringList(x:Any) =
    x match {
      case l:List[String] => true
      case _ => false
    }

  def isStringArray(x:Any) =
    x match {
      case a:Array[String] => true
      case _ => false
    }

}

abstract class Expr
case class Var(name:String) extends Expr
case class Number(num:Double) extends Expr
case class UnOp(operator:String, arg:Expr) extends Expr
case class BinOp(operator:String, left:Expr, right:Expr) extends Expr