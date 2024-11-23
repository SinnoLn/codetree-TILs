#include <iostream>

using namespace std;
int n,cnt;

int main() {
    cin >> n;
    cnt = 9;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            cout << cnt;
            cnt --;
            if(cnt == 0)
                cnt = 9;
        }
        cout << '\n';
    }
    return 0;
}