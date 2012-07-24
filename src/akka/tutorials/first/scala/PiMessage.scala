package akka.tutorials.first.scala
import akka.util.Duration
import akka.util.duration._



class PiMessage {

 
sealed trait PiMessage
case object Calculate extends PiMessage
case class Work(start: Int, nrOfElements: Int) extends PiMessage
case class Result(value: Double) extends PiMessage

}