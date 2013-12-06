import ScalaxbKeys._

name := "digikey-wsdl"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "net.databinder.dispatch" %% "dispatch-core"     % "0.11.0"
)

scalaxbSettings
 
sourceGenerators in Compile <+= scalaxb in Compile

packageName in scalaxb in Compile := "com.digikey"