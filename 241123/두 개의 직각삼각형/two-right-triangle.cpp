#include <iostream>
using namespace std;

int n,re,b;
int main() {
    cin >> n;
    re = n;
    for(int i=0; i<n; i++){
        for(int j=0; j<re; j++){
            cout <<"*";
        }
        for(int k=0; k<b; k++){
            cout <<" ";
        }
        for(int j=0; j<re; j++){
            cout <<"*";
        }
        cout <<'\n';
        re--;
        b+=2;
    }
    return 0;
}