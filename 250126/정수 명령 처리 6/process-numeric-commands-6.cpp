#include <iostream>
#include <queue>
using namespace std;

int n,num;
string op;
priority_queue<int> pq;
int main() {
    
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> op;
        if(op == "push"){
            cin >> num;
            pq.push(num);
        }  
        else if(op == "size") cout << pq.size() << '\n';
        else if(op == "empty") cout << pq.empty() << '\n';
        else if(op == "pop") {
            cout << pq.top() << '\n';
            pq.pop();
        }
        else cout << pq.top() << '\n';
    }
    return 0;
}