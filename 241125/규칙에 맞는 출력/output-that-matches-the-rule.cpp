#include <iostream>
using namespace std;

int n;
int main() {
    cin >> n;
    for(int i=n; i>0; i--){
        int tmp = i;
        while(tmp<=n){
            cout << tmp << " ";
            tmp++;
        }
        cout << '\n';
    }
    return 0;
}