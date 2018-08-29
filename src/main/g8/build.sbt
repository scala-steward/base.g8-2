/// variables

val groupId = "$group_id$"
val projectName = "$project_name$"

/// projects

lazy val root = project
  .in(file("."))
  .aggregate(readme)
  .settings(commonSettings)
  .settings(noPublishSettings)

lazy val readme = project
  .in(file("modules/readme"))
  .enablePlugins(TutPlugin)
  .settings(commonSettings)
  .settings(noPublishSettings)
  .settings(
    fork in Tut := true,
    scalacOptions -= "-Ywarn-unused:imports",
    tutSourceDirectory := baseDirectory.value,
    tutTargetDirectory := (LocalRootProject / baseDirectory).value
  )

/// settings

lazy val commonSettings = Def.settings(
  compileSettings,
  metadataSettings,
  scaladocSettings
)

lazy val compileSettings = Def.settings()

lazy val metadataSettings = Def.settings()

lazy val noPublishSettings = Def.settings(
  skip in publish := true
)

lazy val scaladocSettings = Def.settings()
