#include <iostream>
#include <queue>
#include <string>
using namespace std;

int n,num;
queue<int> qu;
int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        string s;
        cin >> s;
        if(s == "push"){
            cin >> num;
            qu.push(num);
        } 
        else if(s == "front") cout << qu.front() <<'\n';
        else if(s == "size") cout << qu.size() <<'\n';
        else if(s == "pop"){
            cout << qu.front()<<'\n';
            qu.pop();
        } 
        else if(s == "empty") cout << qu.empty() <<'\n';
    }
    return 0;
}