#include <iostream>
using namespace std;
int dp[10];

int main() {
    cin >> dp[0];
    cin >> dp[1];

    for(int i = 2; i<10; i++){
        dp[i] = dp[i-1] + 2*dp[i-2];
    }

    for(int i=0; i<10; i++){
        cout << dp[i] <<" ";
    }
    return 0;
}