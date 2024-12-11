#include <iostream>
#include <stack>
using namespace std;

stack<int> stk;
string s, ans;
int main() {
    cin >> s;
    for(char c: s){
        if(c == '('){
            if(!stk.empty()){
                ans = "No";
                break;
            }
            stk.push(1);
        } 
        else if(c == ')'){
            if(stk.empty()){
                ans = "No"; 
                break;
            }
            stk.pop();
        }

        if(!stk.empty()){
                ans = "No";
                break;
            }
        else ans = "Yes";
    }
    cout << ans <<'\n';

    return 0;
}