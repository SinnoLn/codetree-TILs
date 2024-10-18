#include <iostream>
#include <algorithm>
#include <cmath>
using namespace std;

int arr[20][20]; // 최대 20*20 크기의 2차원 배열
int n, m; // n은 영역 크기, m은 금 1개 가격
int max_gold = 0; // 최대 채굴 가능한 금의 개수

void gold_mining(int K, int x, int y);

int main() {
    cin >> n >> m;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> arr[i][j];
        }
    }

    // 모든 좌표 (i, j)를 중심으로 마름모 모양 탐색
    for (int K = 0; K < n + (n - 1); K++) { 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 각 (i, j)를 중심으로 마름모 모양으로 금을 채굴
                gold_mining(K, i, j);
            }
        }
    }
    
    cout << max_gold << endl;
    
    return 0;
}

// 마름모 모양의 범위 내 금 개수 세기
void gold_mining(int K, int x, int y) {
    int gold_count = 0;
    
    // 마름모 범위 탐색
    for (int dx = -K; dx <= K; dx++) {
        for (int dy = -K; dy <= K; dy++) {
            // 맨해튼 거리 조건 확인 (|dx| + |dy| <= K)
            if (abs(dx) + abs(dy) <= K) {
                int newX = x + dx;
                int newY = y + dy;
                
                // 유효한 좌표인지 확인 (격자 범위를 벗어나지 않는지)
                if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                    // 금이 있으면 카운트 증가
                    if (arr[newX][newY] == 1) {
                        gold_count++;
                    }
                }
            }
        }
    }
    
    // 채굴 비용 계산
    int cost = K * K + (K + 1) * (K + 1);
    int total_value = gold_count * m; // 금의 가격 * 금의 개수

    // 손해를 보지 않으면서 최대 금 개수를 갱신
    if (total_value >= cost) {
        max_gold = max(max_gold, gold_count);
    }
}