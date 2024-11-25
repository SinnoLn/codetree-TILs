#include <iostream>
using namespace std;

int n;
int main() {
    cin >> n;

    for(int i=0; i<n; i++){
        char c = 65 - i;
        cout << c <<" ";
    }
    cout << '\n';
    return 0;
}