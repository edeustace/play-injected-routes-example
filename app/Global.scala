import play.api._
import mvc.{Handler, RequestHeader}
import play.api.Play.current
import play.core.Router
import play.api._

object Global extends GlobalSettings {

  override def onRouteRequest(request: RequestHeader): Option[Handler] = {

    val WithParamRegex = """/injectedRouteWithParam/(\d)""".r

    request.path match {

      case "/injectedRoute" => Some(controllers.Application.customRoute)
      case WithParamRegex(number) => {
        Some(controllers.Application.customRoute2(number.toInt))
      }
      case _ => Play.maybeApplication.flatMap(_.routes.flatMap {
        router =>
          router.handlerFor(request)
      })
    }
  }

}

