#include <iostream>
using namespace std;

float a,b,sum;

int main() {

    cin >> a >> b;
    cout << fixed;
    cout.precision(2);
    sum = (a+b)/(a-b);
    cout << sum << '\n';
    return 0;
}