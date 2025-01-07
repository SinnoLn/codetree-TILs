#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

unordered_map<int,int> map;
vector<int> v;
int n, k, num, answer;
int main() {
    cin >> n >> k;
    for(int i=0; i<n; i++){
        cin >> num;
        v.push_back(num);
        map[num]++;
    }

    for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            int target = k - v[i] + v[j];
            if(map.find(target) != map.end()){
                if(target == v[i] && map[target]<2) continue;
                if(target == v[j] && map[target]<2) continue;
                if(v[i] == v[j] && map[target]<3) continue;

                answer++;
            }
        }
    }

    cout << answer << '\n';

    return 0;
}