package concurrency
import akka.actor._


class MyActor extends Actor {
  def receive = {
    case message: String => println(s"Recieved message: $message")
    case _               => println("Invalid message")
  }
}

object Main extends App{
  val system = ActorSystem("MyActorSystem")
  val myActor = system.actorOf(Props[MyActor], "MyActor")
  myActor ! "Hello world!"
  myActor ! 42
}
