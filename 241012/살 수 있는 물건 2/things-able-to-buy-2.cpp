#include <iostream>
using namespace std;

int main() {
    int a;
    cin >> a;
    if(a>=3000)
        cout<<"book"<<'\n';
    else if(a>=1000)
        cout<<"mask"<<'\n';
    else if(a>=500)
        cout<<"pen"<<'\n';
    else 
        cout<<"no"<<'\n';
    return 0;
}