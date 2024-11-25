#include <iostream>
using namespace std;
int arr[10],pos;
bool done = false;

int main() {
    for(int i=0; i<10; i++){
        cin >> arr[i];
        if(!done && arr[i]%3 == 0){
            pos = i-1;
            done = true;
        }
    }   

    cout << arr[pos] << '\n';
 
    return 0;
}