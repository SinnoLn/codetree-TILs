#include <iostream>
using namespace std;

int main() {
    //정사각형 넓이
    //5보다 작으면 tiny  추가로 출력
    int a = 0;
    cin >> a;
    cout << a*a <<'\n';
    if(a<5)
        cout<<"tiny"<<'\n';
    return 0;
}