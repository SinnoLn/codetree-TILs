#include <iostream>
using namespace std;

int main() {
    int a=0;
    cin >> a;
    if(a%2 == 1) //홀수라면
        a+=3;
    if(a%3==0) //3의 배수라면
        a/=3;
    
    cout << a <<'\n';

    return 0;
}