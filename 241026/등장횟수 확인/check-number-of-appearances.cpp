#include <iostream>
using namespace std;
int num,sum;
int main() {
    for(int i=0; i<5; i++){
        cin >> num;
        if(num%2 ==0)
            sum++;
    }
    cout << sum <<'\n';
    return 0;
}