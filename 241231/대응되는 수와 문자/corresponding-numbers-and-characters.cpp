#include <iostream>
#include <unordered_map>
using namespace std;

unordered_map<char, int> char_to_int;
unordered_map<int, char> int_to_char;
int n,m;
char c;
int main() {
cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> c;
        char_to_int[c] = i+1;
        int_to_char[i+1] = c;
    }

    for(int i=0; i<m; i++){
        cin >> c;
        if(0<=(c-'0') && 9>=(c-'0')) cout << int_to_char[c-'0'] << '\n';
        else cout << char_to_int[c] <<'\n';
    }

    return 0;
}