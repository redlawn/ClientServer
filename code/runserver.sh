#!/bin/sh

#CLASSROOT=/homedir/ug03007/code/jars
CLASSROOT=/home/sadr/Dropbox/Documents/Stuff/Programming/ICP3029/code/jars

java -cp ${CLASSROOT}/xmlrpc-2.0/xmlrpc-2.0.jar:${CLASSROOT}/commons-codec-1.3.jar:${CLASSROOT}/commons-httpclient-2.0.2/commons-httpclient-2.0.2.jar:${CLASSROOT}/commons-logging-1.0.2/commons-logging.jar:${CLASSROOT}/junit3.8.1/junit.jar:${CLASSROOT}/servlet.jar:./classes MyXmlRpcServer 21112

exit
