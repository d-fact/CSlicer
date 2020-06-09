#!/usr/bin/env bash

COV_TA=$1
PLAIN_MD5_MAP=$2

function usage() {
    echo "./find_which_missing 60-cov.ta plain-md5-map.txt"
}
if [[ $# -ne  2 ]]; then
    usage;
    exit 2;
fi

AllHash=$(awk '{print $3}' "$COV_TA"  | tail -n +2)
for x in $AllHash; do
    if  grep -q "$x" "$PLAIN_MD5_MAP"  ; then
        : # no-op
    else
        printf "NOT FOUND: %s\n" "$x";
    fi;
done;

