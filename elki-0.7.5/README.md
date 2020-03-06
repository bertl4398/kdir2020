ELKI Data Mining Toolkit
========================

You can find additional information on ELKI at:
[https://elki-project.github.io/](https://elki-project.github.io/)

Citing ELKI
-----------

ELKI is an academic project. We appreciate citations using the latest
ELKI publication. This is release 0.7.5, which should be cited as

```
@article{DBLP:journals/corr/abs-1902-03616,
  author    = {Erich Schubert and
               Arthur Zimek},
  title     = {ELKI: A large open-source library for data analysis},
  subtitle  = {ELKI Release 0.7.5 "Heidelberg"},
  journal   = {{CoRR}},
  volume    = {abs/1902.03616},
  year      = {2019},
  url       = {https://arxiv.org/abs/1902.03616},
  archivePrefix = {arXiv},
  eprint    = {1902.03616}
}
```

Launching ELKI
--------------

To launch ELKI, make sure you have at least Java 7 installed.

* On Windows, run `elki.bat`
* On Linux, run `elki.sh`
* On OSX, run `elki.sh`

If these scripts do not work for you (it is hard to predict how your
computer is configured), please set up your class path manually.
It may be necessary to launch from command line to see error messages.

You need to have the `.jar` files in both the `elki` and the `dependency`
folder on your class path, or you can try the `elki-bundle` single-jar
downloadable on the home page.

Developing ELKI
---------------

ELKI is an open-source project, which welcomes contributions and add-ons.

The folders `javadoc` and `sources` can be used with IDEs such as Eclipse
to have easy access to the documentation and source code. Because the
`pom.xml` files are not included in these jars, they cannot be automatically
recompiled (please get the source package instead).

You can find more information on the homepage:
[https://elki-project.github.io/](https://elki-project.github.io/)

You can also find the project on GitHub:
[http://github.com/elki-project/elki](http://github.com/elki-project/elki)


Add-ons for ELKI
----------------

Add-ons for ELKI such as the ph-tree add-on can (usually) be installed by
putting the `.jar` files in the `elki` or `dependency` folders.

ELKI will find new implementations if the `.jar` contains a file named
`META-INF/elki/<interfacename>` for the implemented interfaces, listing
the new classes and aliases. Additionally, folders (but not `.jar`s) on
the class path will be scanned for new implementations.
