lazy val root = (project in file(".")).
  settings(
    name := "project_name",
    version := "1.0",
    scalaVersion := "2.11.7",
    libraryDependencies ++= dervy
  )

lazy val dervy = {
  Seq(
  )
}
