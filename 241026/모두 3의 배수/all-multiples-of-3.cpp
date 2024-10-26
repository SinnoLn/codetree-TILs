#include <iostream>
using namespace std;
int num, ans=1;

int main() {
    for(int i=0; i<5; i++){
        cin >> num;
        if((num%3) != 0)
            ans = 0;
    }
    cout << ans <<'\n';
    return 0;
}