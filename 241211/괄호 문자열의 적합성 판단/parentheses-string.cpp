#include <iostream>
#include <stack>
using namespace std;

stack<int> stk;
string s;
int main() {
    cin >> s;
    for(char c: s){
        if(c == '('){
            if(!stk.empty()){
                cout << "No" << '\n';
                break;
            }
            stk.push(1);
        } 
        else if(c == ')'){
            if(stk.empty()){
                cout << "No" <<'\n'; 
                break;
            }
            stk.pop();
        }

        if(!stk.empty()){
                cout << "No" << '\n';
                break;
            }
        cout << "Yes" <<'\n';
    }
    return 0;
}