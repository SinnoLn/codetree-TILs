#include <iostream>
using namespace std;
int n,finish;

int main() {
    cin >> n;
    finish = n;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
            cout << i <<" * "<<j<< " = " <<i*j;
            if(j == finish) break;
            cout << " / ";
        }
        cout << '\n';
        finish--;
    }
    return 0;
}