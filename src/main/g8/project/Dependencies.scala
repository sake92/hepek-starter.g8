
import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "$scala_test_version$" % "test"
  lazy val hepekLib = "ba.sake" %% "hepek" % "8da9e928-SNAPSHOT"
}