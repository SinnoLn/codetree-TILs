#include <iostream>
#include <cmath>
#include <queue>
#include <tuple>

using namespace std;

int n,m,x,y;
int a,b,dis;

priority_queue<tuple<int, int, int>> pq;
int main() {
    cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> x >> y;
        pq.push({-(abs(x)+abs(y)),x,y});
    }
    for(int i=0; i<m; i++){
        tuple<int,int,int> min_diff = pq.top();
        tie(dis,a,b) = min_diff;
        pq.pop();
        pq.push({-(abs(a+2)+abs(b+2)),a+2,b+2});
    }
    tuple<int,int,int> min_diff = pq.top();
    tie(dis,a,b) = min_diff;
    cout << a << " " << b <<'\n';
    return 0;
}
