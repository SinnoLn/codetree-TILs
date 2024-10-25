#include <iostream>
using namespace std;
int n, t, totalLength, currentTime, tmp;
//면이 3개, 최대 컨베이너 길이 600;
int conv[600];
int main() {
    cin >> n >> t;
    totalLength = 3 * n;

    for(int i=0; i<totalLength; i++){
        cin >> conv[i];
    }

    while(currentTime != t){
        tmp = conv[totalLength-1];
        for(int i=totalLength-1; i>=1; i--){
            conv[i] = conv[i-1];
        }
        conv[0] = tmp;
        currentTime++;
    }

    for(int i=0; i<n; i++){
        cout << conv[i]<< " ";
    }
    cout << '\n';
    for(int i=n; i<n*2; i++){
        cout << conv[i]<< " ";
    }
    cout << '\n';
    for(int i=2*n; i<totalLength; i++){
        cout << conv[i]<< " ";
    }

    return 0;
}