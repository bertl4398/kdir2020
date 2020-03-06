#!/bin/sh
exec java -cp "elki/elki-0.7.5.jar:elki/*:dependency/*" de.lmu.ifi.dbs.elki.application.ELKILauncher "$@"
