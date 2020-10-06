workspace(name = "bazel_bsp")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

rules_jvm_external_tag = "3.3"
http_archive(
    name  ="rules_jvm_external",
    strip_prefix = "rules_jvm_external-{}".format(rules_jvm_external_tag),
    type = "zip",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/{}.zip".format(rules_jvm_external_tag),
    sha256 = "d85951a92c0908c80bd8551002d66cb23c3434409c814179c0ff026b53544dab"
)
load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    fetch_sources = True,
    artifacts = [
        "ch.epfl.scala:bsp4j:2.0.0-M13",
    ],
    repositories = [
      "https://repo.maven.apache.org/maven2",
      "https://jcenter.bintray.com",
    ],
    maven_install_json = "//:maven_install.json"
)

load("@maven//:defs.bzl", "pinned_maven_install")
pinned_maven_install()

