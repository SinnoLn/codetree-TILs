#include <iostream>
using namespace std;

int a, b, sum, tmp;
int remainder[10];
int main() {
    cin >> a >> b;
    tmp = a;
    while(tmp > 1){
        remainder[tmp%b]++;
        tmp = tmp/b;
    }

    for(int i=0; i<10; i++){
        //cout << i << " : " << remainder[i] << '\n'; 
        sum += remainder[i]*remainder[i];
    }

    cout << sum <<'\n';
    
    return 0;
}