
name := """testing_less"""
organization := "com.test"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean, SbtWeb)

scalaVersion := "2.12.2"

includeFilter in (Assets, LessKeys.less) := "*.less"
excludeFilter in (Assets, LessKeys.less) := "_*.less"

LessKeys.compress in Assets := true

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += javaJdbc
libraryDependencies += "org.postgresql" % "postgresql" % "9.4-1200-jdbc41"

playEbeanModels in Compile := Seq("models.*")
