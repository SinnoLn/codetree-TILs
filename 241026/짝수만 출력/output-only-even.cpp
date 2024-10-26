#include <iostream>
using namespace std;

int a, b;

int main() {
    cin >> a >> b;
    while(a <= b){
        if(a%2 == 0)
            cout<<a<< " ";
        a+=1;
    }    
    return 0;
}