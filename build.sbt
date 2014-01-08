import android.Keys._

android.Plugin.androidBuild

name := "android_starter"

scalaVersion := "2.10.3"

scalacOptions in Compile += "-feature"

platformTarget in Android := "android-19"

run <<= run in Android

install <<= install in Android
