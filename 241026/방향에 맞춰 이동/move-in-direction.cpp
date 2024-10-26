#include <iostream>
using namespace std;

int n, len, x, y;
char c;
//동남서북 //그래프 방향 주의
int dx[4] = {1,0,-1,0};
int dy[4] = {0,1,0,-1};
int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> c >> len;
        if(c =='N'){
            y = y + dy[1]*len;
        }
        else if(c == 'E'){
            x = x + dx[0]*len;
        }
        else if(c == 'S'){
            y = y + dy[3]*len;
        }
        else if(c == 'W'){
            x = x + dx[2]*len;
        }
    }

    cout << x << " " << y <<'\n';
    return 0;
}