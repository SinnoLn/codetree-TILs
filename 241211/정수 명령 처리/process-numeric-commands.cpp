#include <iostream>
#include <stack>
#include <string>

using namespace std;

int n, num;
stack<int> st;
int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        string s;
        cin >> s;
        if(s == "push"){
            cin >> num;
            st.push(num);
        }
        else if(s == "size"){
            cout << st.size() <<'\n';
        }
        else if(s == "empty"){
            cout << st.empty() <<'\n';
        }
        else if(s == "pop"){
            cout << st.top() <<'\n';
            st.pop();
        }
        else if(s == "top"){
            cout << st.top() <<'\n';
        }
    }
    return 0;
}