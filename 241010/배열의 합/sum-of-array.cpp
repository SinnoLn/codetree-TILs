#include <iostream>
using namespace std;

int arr[4], num;
int main() {

    for(int i=0; i<4; i++){
        for(int j=0; j<4; j++){
            cin >> num;
            arr[i]+=num;
        }
    }

    for(int i=0; i<4; i++)
        cout << arr[i] << '\n';
    return 0;
}