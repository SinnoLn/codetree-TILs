#include <iostream>
using namespace std;

int main() {
    int a=0, b=0;
    cin >> a >> b;
    if(a>b)
        cout << a*b <<'\n';
    else   
        cout << b/a << '\n';
    return 0;
}