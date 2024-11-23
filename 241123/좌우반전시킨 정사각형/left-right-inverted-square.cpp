#include <iostream>

using namespace std;
int n;

int main() {
    cin >> n;
    for(int i=1; i<=n; i++){
        for(int j=n; j>=1; j--){
            cout << i*j <<" ";
        }
        cout << '\n';
    }
    return 0;
}