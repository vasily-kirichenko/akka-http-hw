import akka.http.scaladsl.model._
import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import akka.http.scaladsl.server.Directives._

object WebServer {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("web-server-system")
    implicit val materializer = ActorMaterializer()

    val route =
      get {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "Hello World!"))
      }

    val port = 29001
    Http().bindAndHandle(route, "0.0.0.0", port)
    println(s"Server is online at http://localhost:$port")
  }
}