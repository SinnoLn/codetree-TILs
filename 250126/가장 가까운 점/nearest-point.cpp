#include <iostream>
#include <cmath>
#include <queue>
#include <tuple>

using namespace std;

int n,m,x,y;
int a,b,c;
priority_queue<tuple<int,int,int>> pq;
int main() {
    
    cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> x >> y;
        pq.push({-(abs(x)+abs(y)),x,y});
        
        tuple<int,int,int> min_diff = pq.top();
        pq.pop();
        tie(a,b,c) = min_diff;
        pq.push({-(abs(b+2)+abs(c+2)),b+2,c+2});
    }
    tuple<int,int,int> min_diff = pq.top();
    tie(a,b,c) = min_diff;
    cout << b << " " << c << '\n';
    return 0;
}