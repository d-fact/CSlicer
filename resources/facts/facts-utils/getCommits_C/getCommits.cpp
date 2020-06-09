#include <fstream>
#include <set>
#include <algorithm>
#include <map>
#include <string>
#include <iostream>

std::string findHash(const std::string &line) {
    std::size_t pos_b = line.find(':');
    std::size_t pos_e = line.find(':', pos_b+1);
    return line.substr(pos_b+2, pos_e-pos_b-3);
}


int main(int argc, char** argv) {
    if (argc != 3){
        std::cerr << "Need 2 params:\n\toutput from cslicer and\n\tdest file of this program\n";
        return 2;
    }
    std::ifstream infile(argv[1]);
    if (!infile.good()){
        std::cerr << argv[1] << " does not exist.\n" ;
        return 3;
    }
    std::string line;
    std::set<std::string> HunkTestComp;
    std::set<std::string> Drop;
    while (std::getline(infile, line)) {
        if (line.compare(0, 5, "HUNK:") == 0 || line.compare(0, 5, "TEST:") == 0 || line.compare(0, 5, "COMP:") == 0) {
            if (line.compare(0, 5, "TEST:") ==0 ){
                std::cout<< findHash(line) << "\n";
            }
            // std::cout << line << "\n" << findHash(line) << "*" << "\n";
            HunkTestComp.insert(findHash(line));
        }
        else if (line.compare(0, 5, "DROP:") == 0) {
            // std::cout << line << "\n" << findHash(line) << "\n";
            Drop.insert(findHash(line));
        }
    }
    std::cout << "Number of Hunk, Test, Comp commits is " << HunkTestComp.size() << "\n";
    std::cout << "Number of Drop commits is " << Drop.size() << "\n";

    std::set<std::string> Results;
    std::set_difference(HunkTestComp.begin(), HunkTestComp.end(), Drop.begin(), Drop.end(), std::inserter(Results, Results.end()));

    std::string outFilename = argv[2];
    std::ofstream outFile;
    outFile.open (argv[2]);
    std::cout << "Writing results to file "<< outFilename << "\n";
    for (auto r: Results)
        outFile << r << "\n";
    outFile.close();
    return 0;
}
