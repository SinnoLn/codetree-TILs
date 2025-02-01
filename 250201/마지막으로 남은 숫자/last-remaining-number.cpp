#include <iostream>
#include <queue>
#include <cmath>
using namespace std;

priority_queue<int> pq;
int n,num;
int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> num;
        pq.push(num);
    }
    while(pq.size() >= 2){
        int a = pq.top();
        pq.pop();
        int b = pq.top();
        pq.pop();

        if(a==b) continue;
        else{
            pq.push(abs(a-b));
        }
    }
    if(pq.size()==1) cout << pq.top() << '\n';
    else if(pq.empty()) cout << -1 << '\n';
        
    return 0;
}