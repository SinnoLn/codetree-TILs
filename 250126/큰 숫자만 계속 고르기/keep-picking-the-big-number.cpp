#include <iostream>
#include <queue>
using namespace std;

priority_queue<int> pq;
int n,m,num;
int main() {
    
    cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> num;
        pq.push(num);
    }
    for(int i=0; i<m; i++){
        int max_num = pq.top()-1;
        pq.pop();
        pq.push(max_num);
    }
    cout << pq.top()<<'\n';
    return 0;
}