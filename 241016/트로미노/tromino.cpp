#include <iostream>
using namespace std;

int n,m, maxCost;
int arr[200][200];

int all_cost1(int row_s, int row_e, int col_s, int col_e);
int all_cost2(int row_s, int row_e, int col_s, int col_e);
int all_cost3(int row_s, int row_e, int col_s, int col_e);
int all_cost4(int row_s, int row_e, int col_s, int col_e);
int all_cost5(int row_s, int row_e, int col_s, int col_e);
int all_cost6(int row_s, int row_e, int col_s, int col_e);


int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    //배열 입력 받음 (m은 column, n은 row)
    cin >> n >> m;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            cin >> arr[i][j];
        }
    }

    //세워진 블럭
    for(int col=0; col<n; col++){
        for(int row=0; row<m; row++){
            if((row+2)>=m) continue;
            int num_of_gold = all_cost1(row, row+2, col, col);
            maxCost = max(maxCost, num_of_gold);
        }
    }

    //누운 블럭
    for(int row=0; row<n; row++){
        for(int col=0; col<m; col++){
            if((col+2)>=n) continue;
            int num_of_gold = all_cost2(row, row, col, col+2);
            maxCost = max(maxCost, num_of_gold);
        }
    }

    //니은 블럭
    for(int col=0; col<m; col++){
        for(int row=0; row<n; row++){
            if((col+1)>=m) continue;
            if((row+1)>=n) continue; 
            int num_of_gold = all_cost3(row, row+1, col, col+1);
            maxCost = max(maxCost, num_of_gold);
        }
    }

    //니은 반대 블럭
    for(int col=0; col<m; col++){
        for(int row=0; row<n; row++){
            if((col+1)>=m) continue;
            if((row+1)>=n) continue;
            int num_of_gold = all_cost4(row, row+1, col, col+1);
            maxCost = max(maxCost, num_of_gold);
        }
    }

    //기역 블럭
    for(int col=0; col<m; col++){
        for(int row=0; row<n; row++){
            if((col+1)>=m) continue;
            if((row+1)>=n) continue;
            int num_of_gold = all_cost5(row, row+1, col, col+1);
            maxCost = max(maxCost, num_of_gold);
        }
    }

    //기역 반대 블럭
    for(int col=0; col<m; col++){
        for(int row=0; row<n; row++){
            if((col+1)>=m) continue;
            if((row+1)>=n) continue;
            int num_of_gold = all_cost6(row, row+1, col, col+1);
            maxCost = max(maxCost, num_of_gold);
        }
    }

    //최종 값 출력
    cout << maxCost << '\n';

    return 0;
}

//세운블럭
int all_cost1(int row_s, int row_e, int col_s, int col_e){
    int cost = 0;
    for(int j=row_s; j<=row_e; j++){
        cost+=arr[j][col_s];
    }
    return cost;
}

//누운블럭
int all_cost2(int row_s, int row_e, int col_s, int col_e){
    int cost = 0;
    for(int j=col_s; j<=col_e; j++){
        cost+=arr[row_s][j];
    }
    return cost;
}

//니은블럭
int all_cost3(int row_s, int row_e, int col_s, int col_e){
    int cost = 0;
    for(int i=row_s; i<=row_e; i++){
        for(int j=col_s; j<=col_e; j++){
            if(i == row_s && j == col_e) continue;
            cost+=arr[i][j];
        }
    }
    return cost;
}

//니은블럭
int all_cost4(int row_s, int row_e, int col_s, int col_e){
    int cost = 0;
    for(int i=row_s; i<=row_e; i++){
        for(int j=col_s; j<=col_e; j++){
            if(i == row_s && j == col_s) continue;
            cost+=arr[i][j];
        }
    }
    return cost;
}

//기역블럭
int all_cost5(int row_s, int row_e, int col_s, int col_e){
    int cost = 0;
    for(int i=row_s; i<=row_e; i++){
        for(int j=col_s; j<=col_e; j++){
            if(i == row_e && j == col_s) continue;
            cost+=arr[i][j];
        }
    }
    return cost;
}

//기역반대블럭
int all_cost6(int row_s, int row_e, int col_s, int col_e){
    int cost = 0;
    for(int i=row_s; i<=row_e; i++){
        for(int j=col_s; j<=col_e; j++){
            if(i == row_e && j == col_e) continue;
            cost+=arr[i][j];
        }
    }
    return cost;
}