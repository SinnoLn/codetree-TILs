#include <iostream>
using namespace std;
int arr[21][21];

int n, max_gold, num_of_gold;
int num_gold(int row_s, int row_e, int col_s, int col_e);

int main() {
    
    //입출력
    cin >> n;
    for(int row=0 ;row<n; row++){
        for(int col=0; col<n; col++){
            cin >> arr[row][col];
        }
    }

    for(int row=0; row<n; row++){
        for(int col=0; col<n; col++){
            //경계선은 0부터 시작하므로 19이여야 한다. (경계선 넘으면 체크 안함)
            if((row+2) >= 3 || (col+2) >= 3) continue;

            int num_of_gold = num_gold(row, row+2, col, col+2);
            max_gold = max(max_gold, num_of_gold);
        }
    }

    cout << max_gold << '\n';
    return 0;
}

int num_gold(int row_s, int row_e, int col_s, int col_e){
    int gold = 0;

    for(int i=row_s ;i<=row_e ; i++){
        for(int j=col_s; j<=col_e; j++){
            gold+=arr[i][j];
        }
    }
    return gold;
}