name := "BasicScala"

version := "0.1"

scalaVersion := "2.13.2"

lazy val Versions = new {
  val cats      = "2.8.0"
  val json      = "2.9.3"
  val scalaTest = "3.2.12"
  val circe     = "0.14.3"
  val liftVersion = "3.5.0"
}

libraryDependencies ++=
  Seq(
    // https://mvnrepository.com/artifact/org.scalatest/scalatest
    "org.scalatest"     %% "scalatest"        % Versions.scalaTest % Test,
    // https://mvnrepository.com/artifact/com.typesafe.play/play-json
    "com.typesafe.play" %% "play-json"        % Versions.json,
    "org.typelevel"     %% "cats-core"        % Versions.cats,
    "io.circe"          %% "circe-core"       % Versions.circe,
    "io.circe"          %% "circe-generic"    % Versions.circe,
    "net.liftweb"       %% "lift-webkit"      % Versions.liftVersion,
    "net.liftweb"       %% "lift-json"      % Versions.liftVersion,
    "ch.qos.logback"    % "logback-classic"   % "1.4.1",
    "org.creativescala" %% "doodle"           % "0.11.2",
    "org.scalameta"     %% "munit"            % "0.7.29" % Test
  )
