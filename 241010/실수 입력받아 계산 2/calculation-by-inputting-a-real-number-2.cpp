#include <iostream>
using namespace std;

float a;

int main() {
    cin >> a;
    cout << fixed;
    cout.precision(2);
    cout << (a+1.5) << '\n';
    return 0;
}