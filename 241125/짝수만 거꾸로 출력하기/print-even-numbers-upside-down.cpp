#include <iostream>
using namespace std;
int arr[100];
int n;

int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }    

    for(int i = n-1; i>=0; i--){
        if(arr[i]%2 == 0)
            cout << arr[i] <<" ";
    }
    return 0;
}