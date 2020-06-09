#!/usr/bin/env bash

CSLICER_OUT="$1"
RESULT_FILE="$2"

if [[ $# -ne 2 ]]; then
    echo "Need 2 arguments: CSLICER_LOG and OUTPUT_FILE";
    exit 2;
fi

Hunk=$(rg "^HUNK" "$CSLICER_OUT" | awk '{print $2}')
Test=$(rg "^TEST" "$CSLICER_OUT" | awk '{print $2}')
Comp=$(rg "^COMP" "$CSLICER_OUT" | awk '{print $2}')

Needed=$(rg "^(HUNK|TEST|COMP)" "$CSLICER_OUT" | awk '{print $2}')
# Drop=$(rg "^DROP" "$CSLICER_OUT" | awk '{print $2}')
echo "$Needed" | sort -u > "$RESULT_FILE"
#echo "$Test"
#echo "$Comp"
