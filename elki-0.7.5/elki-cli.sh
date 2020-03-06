#!/bin/sh

MINPTS=$1
MAXLEVEL=$2
JITTER=$3

java -cp "elki/elki-0.7.5.jar:elki/*:dependency/*" de.lmu.ifi.dbs.elki.application.KDDCLIApplication \
    -dbc.in /home/dev/KIT/coexdbscan/test_data \
    -algorithm clustering.correlation.CASH \
    -cash.minpts ${MINPTS} -cash.maxlevel ${MAXLEVEL} -cash.jitter ${JITTER} \
    -resulthandler ClusteringVectorDumper
