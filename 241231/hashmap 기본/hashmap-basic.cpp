#include <iostream>
#include <string>
#include <unordered_map>
using namespace std;

int n, k, v;
string order;
int main() {
    unordered_map<int,int> m;
    cin >> n;
    for(int i=0 ;i<n; i++){
        cin >> order;
        if(order == "add"){
            cin >> k >> v;
            m[k] = v;
        }
        else if(order == "remove"){
            cin >> k;
            m.erase(k);
        }
        else if(order == "find"){
            cin >> k;
            if(m.find(k) == m.end()) cout << "None" <<'\n';
            else cout << m[k] <<'\n';
        }
    }
    return 0;
}