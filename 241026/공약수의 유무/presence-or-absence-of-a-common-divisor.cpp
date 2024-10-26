#include <iostream>
using namespace std;
int a,b,ans;

int main() {
    cin >> a >> b;
    for(int i=a; i<=b; i++){
        if((1920%i == 0) && (2880%i == 0))
            ans = 1;
    }

    cout << ans <<'\n';

    return 0;
}