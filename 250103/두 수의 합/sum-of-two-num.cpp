#include <iostream>
#include <unordered_map>

using namespace std;

int n, k, num, answer;
unordered_map<int,int> hashmap;

int main() {
    cin >> n >> k;
    for(int i=0; i<n; i++){
        cin >> num;

        if(hashmap.find(k-num) != hashmap.end()){
            answer+=hashmap[k-num];
        }
        hashmap[num]++;
    }
    cout << answer <<'\n';
    return 0;
}
