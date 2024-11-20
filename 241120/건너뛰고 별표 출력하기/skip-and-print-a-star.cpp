#include <iostream>
using namespace std;
int n,r;

int main() {
    r=1;
    cin >> n;    
    for(int i=0; i<n; i++){
        for(int j=0;j<r; j++){
            cout << "*";
        }
        r+=1;
        cout << '\n';
        cout <<'\n';
    }

    r-=2;

    for(int i=0; i<n-1; i++){
        for(int j=0;j<r; j++){
            cout << "*";
        }
        r-=1;
        cout << '\n';
        cout <<'\n';
    }

    return 0;
}