lazy val acyclic = (project in file("./acyclic"))
  .settings(
    name := "acyclic",
    organization  := "com.lihaoyi",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      "com.lihaoyi" %% "utest" % "0.6.9" % "test",
      "org.scala-lang" % "scala-compiler" % scalaVersion.value % Provided,
    ),
    Compile / unmanagedSourceDirectories += baseDirectory.value / "src",
    Compile / unmanagedSourceDirectories += baseDirectory.value / "src-2.13",
    Test / unmanagedSourceDirectories += baseDirectory.value / "test" / "src",
    Test / unmanagedResourceDirectories += baseDirectory.value / "test" / "resources",
    testFrameworks += new TestFramework("utest.runner.Framework"),
  )
