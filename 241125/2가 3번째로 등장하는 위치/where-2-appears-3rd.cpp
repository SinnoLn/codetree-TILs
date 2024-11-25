#include <iostream>
using namespace std;
int n,num,cnt,ans;
bool check = false;
int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> num;
        if(num == 2)
            cnt++;
        //3이 한번만 나오는게 아님 2가 안나올 경우 계속 3임 
        if(!check && cnt == 3){
            ans = i+1;
            check = true;
        }
    }
    cout << ans <<'\n';
    return 0;
}