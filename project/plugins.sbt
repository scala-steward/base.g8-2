ThisBuild / evictionErrorLevel := Level.Info

addSbtPlugin("org.foundweekends.giter8" %% "sbt-giter8" % "0.14.0")

// plugins that are also used in the template
addSbtPlugin("com.codecommit" % "sbt-github-actions" % "0.14.2")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.6")

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.7.0")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.4.1")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.2.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.2")
