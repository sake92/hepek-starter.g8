package $package$.site

import scalatags.Text.all._
import $package$.utils.Imports._
import $package$.templates._

object About extends MyStaticPage {

  override def pageSettings =
    super.pageSettings.withTitle("About")

  override def pageContent = frag(
    div(cls := "page-header text-center")(
      h1("About $name$")
    ),
    div(cls := "well well-lg")(
      s"""
        Welcome to Hepek!

        This is a custom page, using a different template (also called layout in other SSGs).
        
        Here's a typesafe link to [second section](\${Index.secondSection.ref}) (almost impossible to make a mistake! :D)
      """.md,
      div(
        span("Eager to learn? Check out Hepek Documentation "),
        a(href := "https://sake92.github.io/hepek/quick-start.html")("here!")
      )
    )
  )

}
