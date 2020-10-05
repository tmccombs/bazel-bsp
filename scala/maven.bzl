scala_version = "2.12.12"

_lib_names = ["scala-compiler", "scala-library", "scala-reflect"]

scala_lang_libs = ["org.scala-lang:{}:{}".format(name, scala_version) for name in _lib_names]
