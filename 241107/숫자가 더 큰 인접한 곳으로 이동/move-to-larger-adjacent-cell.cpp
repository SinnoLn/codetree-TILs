#include <iostream>
using namespace std;
//상하좌우
int dy[4] = {-1, 1, 0, 0};
int dx[4] = {0, 0, -1, 1};

int arr[100][100];
int n, r, c;

void move(int y, int x);

int main() {
    cin >> n >> r >> c;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            cin >> arr[i][j];
        }
    }
    //첫 시작 출력
    cout << arr[r-1][c-1] <<" ";
    move(r-1,c-1);
    return 0;
}

void move(int y, int x){
    for(int i=0; i<4; i++){
        int ny = y+ dy[i];
        int nx = x+ dx[i];

        //우선순위 상하좌우
        if(ny >= 0 && nx >= 0 && ny <n && nx < n){
            if(arr[ny][nx] > arr[y][x]){
                cout << arr[ny][nx] <<" ";
                y = ny;
                x = nx;
                move(ny, nx);
                return; //재귀호출 되고 있으므로 완전히 종료 
            }
        }
    }
}