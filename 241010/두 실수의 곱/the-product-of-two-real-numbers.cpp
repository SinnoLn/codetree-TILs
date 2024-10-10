#include <iostream>
using namespace std;

float a,b;

int main() {
    a=5.26;
    b=8.27;

    cout << fixed;
    cout.precision(3); //소수점과 일의자리 모두 포함
    cout << a*b << '\n';

    return 0;
}