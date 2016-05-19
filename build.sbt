name := "pio-engine-heroku"

parallelExecution in Test := false

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

libraryDependencies ++= Seq(
  "io.prediction"    %% "core"          % "0.9.6",
  "org.apache.spark" %% "spark-core"    % "2.0.0",
  "org.apache.spark" %% "spark-mllib"   % "2.0.0",
  "org.scalatest"    %% "scalatest"     % "2.2.1" % "test",
  "com.typesafe.akka" %% "akka-slf4j" % "2.3.15"
  //"com.typesafe.akka" %% "akka-slf4j_2.11" % "2.4.1"
)

cancelable in Global := true

mainClass in Compile := Some("ServerApp")

enablePlugins(JavaAppPackaging)
