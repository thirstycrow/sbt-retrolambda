organization := "org.scala-sbt"
name := "sbt-retrolambda"
description := "Sbt plugin for retrolambda"
licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

sbtPlugin := true

libraryDependencies += "net.orfjackal.retrolambda" % "retrolambda" % "2.5.3"

scriptedLaunchOpts := { scriptedLaunchOpts.value ++
  Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
}
scriptedBufferLog := false

publishMavenStyle := false
bintrayRepository := "sbt-plugins"
bintrayOrganization in bintray := None
bintrayReleaseOnPublish := false
