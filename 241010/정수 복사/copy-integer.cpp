#include <iostream>
using namespace std;

int a,b;

int main() {
    a = 3;
    b = 4;
    b = a;

    cout << a << " " << b << '\n';
    cout << a*b << '\n';
    return 0;
}