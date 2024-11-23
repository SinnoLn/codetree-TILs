#include <iostream>
using namespace std;

int n, cnt = 0;

int main() {
    cin >> n;
    for(int i=1; i<=n; i++){
        if(i%2){ //홀수 행이면
            for(int j=0; j<n; j++){
                cnt++;
                cout << cnt <<" ";
            }
            cout << '\n';
        }
        else if(!(i%2)){ //짝수행이면
            for(int j=0; j<n; j++){
                cnt+=2;
                cout << cnt <<" ";
            }
            cout << '\n';
        }
    }
    return 0;
}