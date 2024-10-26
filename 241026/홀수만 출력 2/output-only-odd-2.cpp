#include <iostream>
using namespace std;
int a, b;

int main() {
    cin >> b >> a;
    
    for(int i=b; i>=a; i--){
        if(i%2==1)
            cout << i << " ";
    }
    return 0;
}