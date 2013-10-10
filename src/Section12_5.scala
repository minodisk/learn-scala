import scala.collection.mutable.ArrayBuffer

object Section12_5 {
  def main(args:Array[String]) = {
    val queue1 = new BasicIntQueue
    queue1.put(10)
    queue1.put(20)
    println(queue1.get())
    println(queue1.get())

    val queue2 = new MyQueue
    queue2.put(10)
    println(queue2.get())

    val queue3 = new BasicIntQueue with Doubling
    queue3.put(10)
    println(queue3.get())

    val queue4 = new BasicIntQueue with Incrementing with Filtering
    queue4.put(-1)
    queue4.put(0)
    queue4.put(1)
    println(queue4.get())
    println(queue4.get())
  }
}

abstract class IntQueue {
  def get:Int
  def put(x:Int)
}

class BasicIntQueue extends IntQueue {
  private val buffer = new ArrayBuffer[Int]
  def get() = buffer.remove(0)
  def put(x:Int) = buffer += x
}

trait Doubling extends IntQueue {
  abstract override def put(x:Int) = super.put(2 * x)
}

class MyQueue extends BasicIntQueue with Doubling

trait Incrementing extends IntQueue {
  abstract override def put(x:Int) = super.put(x + 1)
}

trait Filtering extends IntQueue {
  abstract override def put(x:Int) = if (x >= 0) super.put(x)
}