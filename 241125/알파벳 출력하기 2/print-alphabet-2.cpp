#include <iostream>
using namespace std;
//Z 다음에는 A가 나와야 합니다
int n, up;
int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        for(int j=0; j<i; j++){
            cout <<"  ";
        }

        for(int j=n-i; j>0; j--){
            char c = 65 + up;
            cout << c <<" ";
            up++;
            if(up == 26)
                up=0;
        }
        cout << '\n';
    }
    return 0;
}