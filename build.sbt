ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.8.0"
lazy val root = (project in file("."))
  .settings(
    name := "scala-practice"
  )
