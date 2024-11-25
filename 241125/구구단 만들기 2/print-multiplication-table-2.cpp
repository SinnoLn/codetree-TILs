#include <iostream>
using namespace std;

int a, b;

int main() {
    cin >> a >> b;
    for(int i=2; i<=8; i+=2){
        for(int j=b; j>=a; j--){
            cout<< j <<" * " << i << " = " << j*i;
            if(j == a) continue;
            cout << " / ";
        }
        cout <<'\n';
    }
    return 0;
}