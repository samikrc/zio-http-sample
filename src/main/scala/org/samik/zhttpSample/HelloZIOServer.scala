package org.samik.zhttpSample

import zio._
import zio.http._
import zio.http.model.Method

object HelloZIOServer extends ZIOAppDefault {

  val app: HttpApp[Any, Nothing] = Http.collect[Request] {
    case Method.GET -> !! / "text" => Response.text("Hello ZIO HTTP World!")
  }

  override val run =
  {
    println("Starting server at http://localhost:8080/")
    Server.serve(app).provide(Server.default)
  }
}