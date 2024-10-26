#include <iostream>
using namespace std;

int a, b;

int main() {
    cin >> a >> b;
    if(a>0){
        while(b--)
            cout << a;
    }
    else 
        cout << 0;
    return 0;
}