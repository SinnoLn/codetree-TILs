#include <iostream>
using namespace std;

int main() {
    int cost = 0;
    cin >> cost;

    if(cost>=3000)
        cout<<"book"<<'\n';
    else if(cost>=1000)
        cout<<"mask"<<'\n';
    else   
        cout<<"no"<<'\n';
    return 0;
}