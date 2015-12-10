name := "play-drools"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

resolvers += "public-jboss" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"

libraryDependencies ++= Seq(
  "org.drools" % "drools-core" % "6.3.0.Final",
  "org.drools" % "drools-compiler" % "6.3.0.Final"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
