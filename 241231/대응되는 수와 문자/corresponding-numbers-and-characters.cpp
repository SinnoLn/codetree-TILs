#include <iostream>
#include <unordered_map>
#include <string>
#include <cmath>
using namespace std;

unordered_map<string, int> char_to_int;
unordered_map<int, string> int_to_char;
int n,m;
string s;
int main() {
cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> s;
        char_to_int[s] = i+1;
        int_to_char[i+1] = s;
    }

    for(int i=0; i<m; i++){
        cin >> s;
        if(0<=stoi(s) && 9>=stoi(s)) cout << int_to_char[stoi(s)] << '\n';
        else cout << char_to_int[s] <<'\n';
    }

    return 0;
}