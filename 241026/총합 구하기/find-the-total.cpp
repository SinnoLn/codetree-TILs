#include <iostream>
using namespace std;
int a,b,sum;
int main() {
    
    cin >> a >> b;
    for(int i=a; i<=b; i++){
        if((i%6==0) && (i%8 != 0))
            sum+=i;
    }
    cout << sum;
    return 0;
}