#include <iostream>
using namespace std;

int main() {
    int a = 1, b=2, c=3, sum=0;

    sum+= a+b+c;
    a=sum;
    b=sum;
    c=sum;

    cout << a << " " << b << " " << c<<'\n';
    return 0;
}