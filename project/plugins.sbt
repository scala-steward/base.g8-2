ThisBuild / evictionErrorLevel := Level.Info

addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.16.2")

// plugins that are also used in the template
addSbtPlugin("com.github.sbt" % "sbt-github-actions" % "0.16.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.10.0")

addSbtPlugin("org.typelevel" % "sbt-tpolecat" % "0.5.0")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.3.2")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.9")
