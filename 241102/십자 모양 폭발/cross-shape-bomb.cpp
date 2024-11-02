#include <iostream>
using namespace std;
int n, end_of_arr, end_of_temp, x, y;
int arr[200][200];
int temp[200][200];

void bomb(int y, int x);
void apply_gravity();

//이 문제는 하나만 터짐
int main() {
    cin >> n;
    end_of_arr = n;
    for(int i=0; i<end_of_arr; i++){
        for(int j=0; j<end_of_arr; j++){
            cin >> arr[i][j]; 
        }
    }
    cin >> y >> x;
    bomb(y, x);
    apply_gravity();

    for(int i=0; i<end_of_arr; i++){
        for(int j=0; j<end_of_arr; j++){
            cout << arr[i][j]<<" "; 
        }
        cout << '\n';
    }

    return 0;
}

void bomb(int y, int x){
    int power = arr[y-1][x-1];

    //세로로 터지기
    for(int i=0; i<end_of_arr; i++){
        if(i >= (y-1-power+1) && i<=(y-1+power-1)){
            arr[i][x-1] = 0;
        }
    }
    
    //가로로 터지기
    for(int i=0; i<end_of_arr; i++){
        if(i >= (x-1-power+1) && i<=(x-1+power-1)){
            arr[y-1][i] = 0;
        }
    }
}

void apply_gravity() {
    for (int x = 0; x < n; x++) { //1행 2행 3행... 순으로 진행
        end_of_temp = 0;

        // 아래서부터 위로 올라가며 비어 있지 않은 값들을 temp에 저장
        for (int y = n - 1; y >= 0; y--) {
            if (arr[y][x] != 0) { // 비어있지 않다면 저장
                temp[end_of_temp++][x] = arr[y][x];
            }
        }

        for (int y = 0; y < n; y++) { //그리고 다시 복사
                arr[n - 1 - y][x] = temp[y][x];
        }
    }
}