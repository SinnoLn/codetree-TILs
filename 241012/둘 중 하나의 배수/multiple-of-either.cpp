#include <iostream>
using namespace std;

int main() {
    int a =0;
    cin >> a;
    if((a%3==0)||(a%5==0))
        cout << 1 << '\n';
    else 
        cout << 0 << '\n';
    return 0;
}