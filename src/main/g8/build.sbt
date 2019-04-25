import com.typesafe.sbt.web.Import.WebKeys
import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / scalafmtOnCompile := true

lazy val root = (project in file("."))
  .settings(
    organization := "$organization$",
    name := "$name;format="normalize"$",
    version := "$version$",
    libraryDependencies ++= Seq(scalaTest, hepekLib),
    resolvers += Resolver.sonatypeRepo("snapshots"),
    (hepek in Compile) := {
      WebKeys.assets.value // run 'assets' after compiling...
      (hepek in Compile).value
    },
    WebKeys.webModulesLib := "$package;format="packaged"$/site/lib"
  )
  .enablePlugins(HepekPlugin, SbtWeb)

