#include <iostream>
using namespace std;
int test;
int a, b;
int main() {
    cin >> test;
    for(int i=0; i<test; i++){
        cin >> a >> b;
        int sum = 0;
        for(int j=a; j<=b; j++){
            if(j%2==0)
                sum+=j;
        }
        cout << sum << '\n';
    }
    
    return 0;
}