#!/bin/sh
# query host for currently installed RPM packages

echo "NAME;VERSION;RELEASE" > rpm.report
rpm -qa --queryformat "%{NAME};%{VERSION};%{RELEASE}\n" | sort -t\; -k 1 >> rpm.report
