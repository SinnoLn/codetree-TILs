#include <iostream>
using namespace std;
int a,b,c,d,e;

int main() {
    cin >> a >> b >> c >> d >> e;

    if(a>b)
        cout << 1 << '\n';
    else
        cout << 0 << '\n';
    
    if(a>c)
        cout << 1 << '\n';
    else
        cout << 0 << '\n';

    if(a>d)
        cout << 1 << '\n';
    else
        cout << 0 << '\n';
    
    if(a>e)
        cout << 1 << '\n';
    else
        cout << 0 << '\n';

    return 0;
}