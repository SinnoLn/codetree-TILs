#include <iostream>
using namespace std;

int age,t=0;
float sum;

int main() {
    while(1){
        cin >> age;
        if(age >= 30 || age < 20) break;
        sum+=age;
        t++;
    }
    cout << fixed;
    cout.precision(2);
    cout << sum/t <<'\n';
    return 0;
}