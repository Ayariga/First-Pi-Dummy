/**
 *
 */
package akka.tutorials.first.scala

import akka.actor.Actor

import akka.tutorials.first.scala.PiMessage.Work
import akka.tutorials.first.scala.PiMessage.Result


/**
 * @author FAISAL
 *
 */
class Worker extends Actor {
  
  def receive = {
case Work(start, nrOfElements) =>
sender ! Result(calculatePiFor(start, nrOfElements)) // perform the work

} 
  
def calculatePiFor(start: Int, nrOfElements: Int): Double = {
var acc = 0.0
for (i <- start until (start + nrOfElements))
acc += 4.0 * (1 - (i % 2) * 2) / (2 * i + 1)
acc
}

}