#include <iostream>
using namespace std;
int conv[400]; //최대 컨베이너 벨트 길이 400
int n, t, totalLength, tmp, currTime;


int main() {
    cin >> n >> t;
    totalLength = 2*n;
    for(int i=0; i<totalLength; i++){
        cin >> conv[i];
    }

    while(currTime != t){
        tmp = conv[totalLength-1];
        for(int i=totalLength-1; i>=1; i--){
            conv[i] = conv[i-1];
        }
        conv[0] = tmp;
        currTime++;
    }

    for(int i=0; i<n; i++){
        cout << conv[i] << " ";
    }

    cout << '\n';

    for(int i=n; i<totalLength; i++){
        cout << conv[i] << " ";
    }

    return 0;
}