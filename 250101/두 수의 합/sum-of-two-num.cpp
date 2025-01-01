#include <iostream>
#include <unordered_map>
using namespace std;

int n, k, num, answer;
int main() {
    unordered_map<int,int> hmap;
    cin >> n >> k;
    for(int i=0; i<n; i++){
        cin >> num;
        //k가 합이되는 숫자가 있다면
        if(hmap.find(k-num) != hmap.end()){
            answer++;
        }
        else hmap[num] = 1;
    }
    cout << answer <<'\n';
    return 0;
}