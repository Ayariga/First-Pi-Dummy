package akka.tutorials.first.scala

import akka.actor.{Actor, PoisonPill}
import akka.routing.RoundRobinRouter
import akka.dispatch.Dispatchers
import java.util.concurrent.CountDownLatch
import akka.actor.ActorRef


class Master(nrOfWorkers: Int, 
    nrOfMessages: Int, 
    nrOfElements: Int, 
    listener: ActorRef) extends Actor {
  
  

}