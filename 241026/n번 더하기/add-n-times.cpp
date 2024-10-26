#include <iostream>
using namespace std;
int a, b;

int main() {
    cin >> a >> b;
    for(int i=0; i<b; i++){
        a+=b;
        cout << a << '\n'; 
    }
    return 0;
}