#include <iostream>
using namespace std;
int a,b,c;

int main() {
    cin >> a >> b >> c;
     
    if(b>a && c>b)
        cout << 1 << '\n';
    else
        cout << 0 << '\n';
    return 0;
}