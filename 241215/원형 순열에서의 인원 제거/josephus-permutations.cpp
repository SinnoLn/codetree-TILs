#include <iostream>
#include <vector>
#include <queue>
using namespace std;

vector<int> v;
queue<int> q;
int n, k;
int main() {
    cin >> n >> k;
    for(int i=1; i<=n; i++) q.push(i);

    while(!q.empty()){
        for(int i=0; i<k-1; i++){
            // cout << q.front() <<'\n';
            q.push(q.front());
            q.pop();
        }
        // cout << q.front() <<'\n';
        v.push_back(q.front());
        q.pop(); //k번째 사람을 제거
    }
    for(int i : v) cout << i <<" ";
    return 0;
}