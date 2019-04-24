package $package$.site

import scalatags.Text.all._
import ba.sake.hepek.implicits._
import $package$.utils.Imports._
import $package$.utils.Imports.grid._
import $package$.templates._

object Index extends MyBlogPage {

  override def pageSettings =
    super.pageSettings.withTitle("$name$")

  override def blogSettings =
    super.blogSettings.withSections(firstSection, secondSection)

  /* CONSTS */
  val markdownURL =
    "https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet"

  /* CONTENT */
  val firstSection = Section("First section", s"""
      This **is** some *Markdown* (read more about it [here](\$markdownURL)):
        - yep
        - it works
    """.md)

  val secondSection = Section(
    "Second section",
    div(
      row(
        third1("Need help from a real programming language?"),
        third2("Have it check you can properly nest these rows, columns etc?"),
        third3(
          ul(
            List("How", "awesome", "is", "that?").map(s => li(s))
          )
        )
      ),
      row(
        s"""
          Sections, Table of Contents, PDFs? Trivial.  
          Relative links with no hassle? You got it!
        """.md,
        hyperlink(About.ref)("Click here!")
      )
    )
  )
}
