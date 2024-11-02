#include <iostream>
#include <vector>
using namespace std;

int n, num;
string op;
vector<int> v;

int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> op;
        if(op == "push_back"){
            cin >> num;
            v.push_back(num);
        }
        else if(op == "get"){
            cin >> num;
            cout << v[num-1] <<'\n';
        }
        else if(op == "size"){
            cout << v.size() <<'\n';
        }
        else if(op == "pop_back"){
            if(!v.empty()){
                v.pop_back();
            }
        }
    }
    return 0;
}