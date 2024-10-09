#include <iostream>
using namespace std;

void happy_arr();
int m, n, ans, arr[101][101];

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    cin >> n >> m;
    
    // 격자 값을 입력받음
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            cin >> arr[i][j];
        }
    }

    // m이 1인 경우는 모든 수열이 '행복한 수열'이므로 바로 2 * n 출력
    if(m == 1) {
        ans = 2 * n;
    } else {
        happy_arr();  // 행복한 수열을 찾는 함수 호출
    }

    // 결과 출력
    cout << ans << '\n';

    return 0;
}

void happy_arr() {
    // 각 행에서 행복한 수열을 찾음
    for(int row = 0; row < n; row++) {
        int cnt = 1;  // 현재 연속된 숫자 개수를 1로 초기화
        int pre = arr[row][0];  // 첫 번째 값을 이전 값으로 설정
        
        for(int col = 1; col < n; col++) {
            if(pre == arr[row][col]) {  // 이전 값과 현재 값이 같으면
                cnt++;  // 연속된 숫자 개수 증가
            } else {  
                cnt = 1;  // 연속이 끊기면 다시 1로 초기화
                pre = arr[row][col];  // 이전 값을 현재 값으로 갱신
            }
            
            if(cnt >= m) {  // 연속된 숫자가 m개 이상이면 행복한 수열로 인정
                ans++;  // 행복한 수열 개수 증가
                break;  // 이 행에서는 더 이상 확인할 필요 없으므로 중단
            }
        }
    }

    // 각 열에서 행복한 수열을 찾음
    for(int col = 0; col < n; col++) {
        int cnt = 1;  // 현재 연속된 숫자 개수를 1로 초기화
        int pre = arr[0][col];  // 첫 번째 값을 이전 값으로 설정
        
        for(int row = 1; row < n; row++) {
            if(pre == arr[row][col]) {  // 이전 값과 현재 값이 같으면
                cnt++;  // 연속된 숫자 개수 증가
            } else {
                cnt = 1;  // 연속이 끊기면 다시 1로 초기화
                pre = arr[row][col];  // 이전 값을 현재 값으로 갱신
            }
            
            if(cnt >= m) {  // 연속된 숫자가 m개 이상이면 행복한 수열로 인정
                ans++;  // 행복한 수열 개수 증가
                break;  // 이 열에서는 더 이상 확인할 필요 없으므로 중단
            }
        }
    }
}