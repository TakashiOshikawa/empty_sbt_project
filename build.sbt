organization  := "com.curation"

lazy val root = (project in file(".")).
  settings(
    name := "project_name",
    version := "1.0",
    scalaVersion := "2.11.7",
    libraryDependencies ++= dervy
  )

lazy val dervy = {
  val akkaV = "2.3.9"
  val sprayV = "1.3.3"
  Seq(
    "io.spray"            %%  "spray-can"     % sprayV,
    "io.spray"            %%  "spray-routing" % sprayV,
    "com.typesafe.akka"   %%  "akka-actor"    % akkaV
  )
}

Revolver.settings