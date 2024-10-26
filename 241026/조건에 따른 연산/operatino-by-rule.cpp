#include <iostream>
using namespace std;
int n,cnt;
int main() {
    cin >> n;
    while(n<1000){
        if(n%2 == 0){ //n이 짝수
            n*=3;
            n++;
        }
        else if(n%2==1){ //n이 홀수
            n*=2;
            n+=2;
        }
        cnt++;
    }
    cout << cnt <<'\n';
    return 0;
}