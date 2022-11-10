<img src="https://www.yegor256.com/images/books/elegant-objects/cactus.svg" height="100px" />

[![EO principles respected here](https://www.elegantobjects.org/badge.svg)](https://www.elegantobjects.org)
[![DevOps By Rultor.com](http://www.rultor.com/b/objectionary/eo-math)](http://www.rultor.com/p/objectionary/eo-math)
[![We recommend IntelliJ IDEA](https://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)

[![mvn](https://github.com/objectionary/eo-math/actions/workflows/mvn.yml/badge.svg?branch=master)](https://github.com/objectionary/eo-math/actions/workflows/mvn.yml)
[![PDD status](http://www.0pdd.com/svg?name=objectionary/eo-math)](http://www.0pdd.com/p?name=objectionary/eo-math)
[![codecov](https://codecov.io/gh/objectionary/eo-math/branch/master/graph/badge.svg)](https://codecov.io/gh/objectionary/eo-math)
[![Maven Central](https://img.shields.io/maven-central/v/org.eolang/eo-math.svg)](https://maven-badges.herokuapp.com/maven-central/org.eolang/eo-math)
[![Hits-of-Code](https://hitsofcode.com/github/objectionary/eo-math)](https://hitsofcode.com/view/github/objectionary/eo-math)
![Lines of code](https://img.shields.io/tokei/lines/github/objectionary/eo-math)
[![License](https://img.shields.io/badge/license-MIT-green.svg)](https://github.com/objectionary/eo-math/blob/master/LICENSE.txt)

[EOLANG](https://www.eolang.org) objects for trigonometry and floating point opeartions.

This is how you can manipulate with `sin`, `cos`, `tan` and `ctan` via `angle`:

```
+alias org.eolang.math.pi
+alias org.eolang.math.angle

(angle pi).cos > cos-pi
(angle (angle 30).as-radians).sin > thirty-degrees-sin
(angle (pi.div 3.0)).tan > pi-div-three-tan
```

You are welcome to add more primitives to this lib. You can see what we need in the lib in [the paper](https://arxiv.org/abs/2206.02585).

## How to Contribute

Fork repository, make changes, send us a pull request.
We will review your changes and apply them to the `master` branch shortly,
provided they don't violate our quality standards. To avoid frustration,
before sending us your pull request please run full Maven build:

```bash
$ mvn clean install -Pqulice
```

You will need Maven 3.3+ and Java 8+.
