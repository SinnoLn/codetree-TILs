#include <iostream>
using namespace std;

//격자 크기는 1 이상 100 이하
//행복한 수열: 연속해서 m개 이상의 동일한 원소가 나오는 순간이 존재하는 수열
//그냥 1부터 n배열의 행과 열을 각각 체크해서 행복한 수열이 존재하는지 확인하면 되는거 아닌가?
void happy_arr();
int m, n, ans, arr[101][101];
//그러면 그냥 

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n >> m;
    
    //수열을 입력받음
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            cin >>arr[i][j];
        }
    }

    happy_arr();

    cout << ans <<'\n';

    return 0;
}

void happy_arr(){

    //어떤 숫자든m개만 있으면 됨 (ex)m = 2 , 22, 11, 44, 55....)
    //그럼 숫자를 하나하나 체크해서 for문 돌려서 같은 숫자면 세는걸로 하자
    for(int row = 0; row<n; row++){ 
        int cnt = 0;
        int pre = 0;
        for(int col=1; col<n; col++){
            pre = arr[row][col]; //이전 값 저장
            //이전값과 현재 값이 같다면
            if(pre == arr[row][col-1]){
                cnt++;
            }
        }
        if(cnt >= (m-1))
            ans++;

    }
    for(int col = 0; col <n; col++){
        int cnt = 0;
        int pre = 0;
        for(int row =1; row<n; row++){
            pre = arr[col][row];
            //이전값과 현재값이 같다면
            if(pre == arr[col][row-1]){
                cnt++;
            }
        }
        if(cnt >= (m-1))
            ans++;
    }
}