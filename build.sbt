

import CommonSetting._
import Dependencies.{actorModuleDependencies, commonModuleDependencies}


name := "Sbt"

version := "0.1"

scalaVersion := "2.12.12"


lazy val root = project.in(file("."))
  .aggregate(Common, Actor)

lazy val  Common= (
  baseProject("Common")
    settings(libraryDependencies ++= commonModuleDependencies)
  )

lazy val Actor = (
  baseProject("Actor")

    settings(libraryDependencies ++= actorModuleDependencies)


  )