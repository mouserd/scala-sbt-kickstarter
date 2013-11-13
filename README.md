## Scala SBT Kickstarter

This is a Scala SBT project that includes common dependancies and plugins to help you get
your Scala project up and running quicker.  Out of the box it provides:

### Dependencies:

* Java Servlet API libraries
* Jetty
* [ScalaTest](http://www.scalatest.org/)
* [Mockito](https://code.google.com/p/mockito/)

### SBT Plugins:

* [Web Plugin](https://github.com/JamesEarlDouglas/xsbt-web-plugin) - Jetty Webserver (runs or port 8081 by default)
* [IntelliJ Project Generation](https://github.com/mpeltonen/sbt-idea)
* [Scala Code Coverage Tool](http://mtkopone.github.io/scct/)
* [ScalaStyle](https://github.com/scalastyle/scalastyle-sbt-plugin)
* [CodeStats](https://github.com/orrsella/sbt-stats)
* [Growl Notifications](https://github.com/softprops/sbt-growl-plugin): Including custom pass/fail/error icons
* Integration Test support: run any integration tests placed below <code>${PROJECT_ROOT}/src/it/</code> using the SBT <code>it:test</code> goal

### Other:
* [Travis CI](http://travis-ci.org/) support - simply connect your
  github repo to Travis CI and after your next push Travis CI will automatically build.
