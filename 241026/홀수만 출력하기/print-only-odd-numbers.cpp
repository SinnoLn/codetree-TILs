#include <iostream>
using namespace std;

int n, num; 

int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> num;
        if((num%2==1)&&(num%3==0))
            cout << num << '\n';
    }
    return 0;
}