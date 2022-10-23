name         := "learning-akka-streams"
version      := "0.1"
scalaVersion := "2.13.10"

lazy val akkaVersion = "2.7.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream"         % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit"        % akkaVersion,
)
