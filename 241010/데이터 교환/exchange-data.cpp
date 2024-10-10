#include <iostream>
using namespace std;

int a,b,c , temp,temp2;
int main() {
    a= 5, b= 6, c = 7; 
    temp = b;
    temp2 =c;
    b = a;
    c = temp;
    //a에는 c값을
    a = temp2;
    
    cout << a <<'\n';
    cout << b << '\n';
    cout << c << '\n'; 
    return 0;
}