name := "simple-transformer"

version := "0.1"

scalaVersion := "2.12.5"

mainClass in Compile := Some("org.example.Application")

// Lift JSON (https://github.com/lift/framework/tree/master/core/json)
val lift_json = "net.liftweb" %% "lift-json" % "3.2.0"

libraryDependencies += lift_json
