#include <iostream>
using namespace std;

int n, sum;
int tem;
int main() {
    cin >> n;
    tem = n;
    for(int i=1; i<=n; i++){
        if(tem <= 1) break;
        sum++;
        tem/=i;
    }

    cout << sum <<'\n';
    return 0;
}