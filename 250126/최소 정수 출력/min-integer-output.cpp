#include <iostream>
#include <queue>
using namespace std;

priority_queue<int> pq;
int n,num;
int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> num;
        if(num > 0) pq.push(-num);
        else if(num == 0 && !pq.empty()){
            cout << -pq.top() <<'\n';
            pq.pop();
        }
        else if(num == 0 && pq.empty()){
            cout << 0 << '\n';
        }
    }
    return 0;
}