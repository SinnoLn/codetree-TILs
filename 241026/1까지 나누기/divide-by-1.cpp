#include <iostream>
using namespace std;

int n, sum;

int main() {
    cin >> n;
    for(int i=1; i<=n; i++){
        if((n/=i) < 1) break;
        sum++;
    }
    sum++;

    cout << sum <<'\n';
    return 0;
}