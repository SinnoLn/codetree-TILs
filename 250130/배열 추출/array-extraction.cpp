#include <iostream>
#include <queue>

using namespace std;

int n,num;
priority_queue<int> pq;
int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> num;
        if(num == 0 ) {
            if(!pq.empty()){
                int max_num = pq.top();
                pq.pop();
                cout << max_num << '\n';
            }
            else cout << "0" << '\n';
        }
        else{
            pq.push(num);
        }
    }
    return 0;
}