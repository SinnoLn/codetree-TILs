#include <iostream>
#include <cmath>
#include <queue>
#include <tuple>

using namespace std;

int n,m,x,y;
int a,b,c;
struct cmp {
    bool operator()(tuple<int, int, int> a, tuple<int, int, int> b) {
        int x1, y1, z1, x2, y2, z2;
        tie(x1, y1, z1) = a;
        tie(x2, y2, z2) = b;
        if (x1 != x2) return x1 > x2;  // 거리 기준: 작은 값이 우선
        if (y1 != y2) return y1 > y2;  // x값 기준: 작은 값이 우선
        return z1 > z2;                // y값 기준: 작은 값이 우선
    }
};
priority_queue<tuple<int, int, int>, vector<tuple<int, int, int>>, cmp> pq;
int main() {
    cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> x >> y;
        pq.push({(abs(x)+abs(y)),x,y});
        
        tuple<int,int,int> min_diff = pq.top();
        pq.pop();
        tie(a,b,c) = min_diff;
        pq.push({(abs(b+2)+abs(c+2)),b+2,c+2});
    }
    tuple<int,int,int> min_diff = pq.top();
    tie(a,b,c) = min_diff;
    cout << b << " " << c << '\n';
    return 0;
}
