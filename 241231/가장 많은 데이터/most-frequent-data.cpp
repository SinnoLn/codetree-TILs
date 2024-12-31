#include <iostream>
#include <string>
#include <algorithm>
#include <unordered_map>
using namespace std;

int n, max_num;
string color;
unordered_map<string,int> data; 
int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> color;
        data[color]++;
        max_num = max(max_num, data[color]);
    }
    cout << max_num <<'\n';
    return 0;
}