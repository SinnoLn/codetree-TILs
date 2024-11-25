#include <iostream>
using namespace std;

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
        }
        cout << '\n';
    }
    return 0;
}