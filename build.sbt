name := "akka-http-hw"
version := "1.0"
scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Yno-adapted-args",
  // "-Ywarn-dead-code", // N.B. doesn't work well with the ??? hole
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Xfatal-warnings")

libraryDependencies ++= Seq(
  "akka-actor",
  "akka-stream",
  "akka-http-experimental",
  "akka-http-testkit")
  .map("com.typesafe.akka" %% _ % "2.4.8")

