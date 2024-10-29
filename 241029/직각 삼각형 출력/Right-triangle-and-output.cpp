#include <iostream>
using namespace std;
int n, r;

int main() {
    cin >> n;
    r = 1;
    for(int i=0; i<n; i++){
        for(int j=0; j<r; j++){
            cout << "*";
        }
        r+=2;
        cout <<'\n';
    }
    return 0;
}