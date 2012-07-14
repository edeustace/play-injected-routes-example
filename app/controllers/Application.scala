package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def customRoute = Action{
    Ok("i'm a custom route not defined in 'routes'")
  }


  def customRoute2(number:Int) = Action{
    Ok("the number is: " + number)
  }

  
}