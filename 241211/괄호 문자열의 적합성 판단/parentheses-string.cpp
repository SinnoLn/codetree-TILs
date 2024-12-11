#include <iostream>
#include <stack>
using namespace std;

stack<int> stk;
string s, ans;
int main() {
    cin >> s;
    for(char c: s){
        if(c == '('){
            stk.push(1);
        } 
        else if(c == ')'){
            if(stk.empty()){
                cout << "No" <<'\n'; 
                return 0;
            }
            stk.pop();
        }
    }

    if(!stk.empty()){
         cout << "No" <<'\n';
         return 0;
    }
    else cout << "Yes" <<'\n';

    return 0;
}