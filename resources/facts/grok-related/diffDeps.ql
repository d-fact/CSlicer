// get transitive dependency of all covered entities
//#+INSERTION

outputFile = "query-results.dat";

// explicitly clean output file 
print "" >> outputFile;

change = dom Update + (dom Delete);

all_deps = call + contain + reference
all = change . (inv all_deps)+;
print all >>> outputFile;
