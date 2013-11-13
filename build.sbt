import GrowlKeys._

//###################
//# General settings
//###################

name := "scala-sbt-kickstarter"

version := "1.0.0"

scalaVersion := "2.10.3"

//###################
//# Plugin settings
//###################

classpathTypes ~= (_ + "orbit")

seq(webSettings :_*)

seq(ScctPlugin.instrumentSettings : _*)

// ScalaStyle
org.scalastyle.sbt.ScalastylePlugin.Settings

// Jetty
port in container.Configuration := 8081

// Growl notifications
defaultImagePath in Growl := file("./project/growl/images/")

//###################
//# Dependencies
//###################

libraryDependencies ++= Seq(
    "javax.servlet"             % "javax.servlet-api"             % "3.0.1"               % "provided" withSources() withJavadoc(),
    "org.eclipse.jetty.orbit"   % "javax.servlet"                 % "3.0.0.v201112011016" % "provided"    artifacts Artifact("javax.servlet", "jar", "jar") withSources() withJavadoc(),
    "org.eclipse.jetty"         % "jetty-webapp"                  % "8.1.5.v20120716"     % "container" withSources() withJavadoc(),
    "org.scalatest"             % "scalatest_2.10"                % "2.0.RC2"             % "test" withSources() withJavadoc(),
     "org.mockito"              % "mockito-core"                  % "1.9.0"               % "test" withSources() withJavadoc()
)

