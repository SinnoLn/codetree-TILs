#include <iostream>
using namespace std;

int a,b, sum=1;

int main() {
    cin >> a >> b;
    for(int i=1; i<=b; i++){
        if(i%a == 0)
            sum*=i;
    }
    cout << sum <<'\n';
    return 0;
}