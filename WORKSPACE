workspace(name = "bazel_bsp")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

skylib_version = "1.0.3"
http_archive(
    name = "bazel_skylib",
    type = "tar.gz",
    url = "https://github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib-{}.tar.gz".format (skylib_version, skylib_version),
    sha256 = "1c531376ac7e5a180e0237938a2536de0c54d93f5c278634818e0efc952dd56c",
)

rules_jvm_external_tag = "3.3"
http_archive(
    name  ="rules_jvm_external",
    strip_prefix = "rules_jvm_external-{}".format(rules_jvm_external_tag),
    type = "zip",
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/{}.zip".format(rules_jvm_external_tag),
    sha256 = "d85951a92c0908c80bd8551002d66cb23c3434409c814179c0ff026b53544dab"
)
load("@rules_jvm_external//:defs.bzl", "maven_install")

rules_scala_version = "ff423d8bdd0e5383f8f2c048ffd7704bb51a91bf"
http_archive(
    name = "rules_scala_annex",
    strip_prefix = "rules_scala-{}".format(rules_scala_version),
    type = "zip",
    url = "https://github.com/higherkindness/rules_scala/archive/{}.zip".format(rules_scala_version),
    sha256 = "ae53e9ed5fecadc7baf4637b88109471602be73dda4e5ff6b4bf1767932703c0"
)

load("@rules_scala_annex//rules/scala:workspace.bzl", "scala_register_toolchains", "scala_repositories")
scala_repositories()
scala_register_toolchains()

load("@rules_scala_annex//rules/scalafmt:workspace.bzl", "scalafmt_default_config", "scalafmt_repositories")
scalafmt_default_config()

load("@rules_scala_annex//rules/scala_proto:workspace.bzl", "scala_proto_repositories")
scala_proto_repositories()

protobuf_tag = "3.13.0"
protobuf_sha256 = "1c744a6a1f2c901e68c5521bc275e22bdc66256eeb605c2781923365b7087e5f"
http_archive(
    name = "com_google_protobuf",
    sha256 = protobuf_sha256,
    strip_prefix = "protobuf-{}".format(protobuf_tag),
    type = "zip",
    url = "https://github.com/protocolbuffers/protobuf/archive/v{}.zip".format(protobuf_tag),
)

load("@com_google_protobuf//:protobuf_deps.bzl", "protobuf_deps")
protobuf_deps()

bind(
    name = "default_scala",
    actual = "//scala:default_scala",
)

load("//scala:maven.bzl", "scala_lang_libs")

maven_install(
    artifacts = scala_lang_libs,
    repositories = [
      "https://repo.maven.apache.org/maven2",
      "https://jcenter.bintray.com",
    ],
    maven_install_json = "//:maven_install.json"
)

load("@maven//:defs.bzl", "pinned_maven_install")
pinned_maven_install()

