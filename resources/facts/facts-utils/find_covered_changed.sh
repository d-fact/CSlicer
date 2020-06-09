#!/usr/bin/env bash

# USAGE: ./find_covered_changed.sh 60-cov.ta 40-diff_attr.ta
# find which commits changed covered entites

COV_TA=$1
DIFF_ATTR_TA=$2

awk '{print $3}' "$COV_TA"  | xargs -I = rg "Update =" -- "$DIFF_ATTR_TA" | awk -F = '{print $4}'  | sort -u | awk -F \" '{print $2}'
