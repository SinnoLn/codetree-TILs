#include <iostream>
#include <cmath>
#include <queue>
#include <tuple>

using namespace std;

int n,m,x,y;
int a,b,dis;
struct cmp{
    bool operator()(tuple<int,int,int>&a, tuple<int,int,int>&b){
        int dis_a = get<0>(a), dis_b = get<0>(b);
        int x_a = get<1>(a), x_b = get<1>(b);
        int y_a = get<2>(a), y_b = get<2>(b);

        // 거리 기준 오름차순
        if (dis_a != dis_b) return dis_a > dis_b;
        // 거리 같으면 x값 오름차순
        if (x_a != x_b) return x_a > x_b;
        // x값 같으면 y값 오름차순
        return y_a > y_b;
    }
};
priority_queue<tuple<int, int, int>, vector<tuple<int,int,int>>,cmp> pq;
int main() {
    cin >> n >> m;
    for(int i=0; i<n; i++){
        cin >> x >> y;
        pq.push({(abs(x)+abs(y)),x,y});
    }
    for(int i=0; i<m; i++){
        tuple<int,int,int> min_diff = pq.top();
        tie(dis,a,b) = min_diff;
        pq.pop();
        pq.push({(abs(a+2)+abs(b+2)),a+2,b+2});
    }
    tuple<int,int,int> min_diff = pq.top();
    tie(dis,a,b) = min_diff;
    cout << a << " " << b <<'\n';
    return 0;
}
