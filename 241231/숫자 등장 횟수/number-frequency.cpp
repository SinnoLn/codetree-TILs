#include <iostream>
#include <unordered_map>
using namespace std;

int answer[2];
int n,m,num;
int main() {
    unordered_map<int,int> index_num;
    cin >> n >> m;

    for(int i=0; i<n; i++){
        cin >> num;
        index_num[num]++;
    }

    for(int i=0; i<m; i++){
        cin >> num;
        cout << index_num[num] <<" ";
    }

    return 0;
}