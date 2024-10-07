#include <iostream>
#define MAX_NUM 1000000
using namespace std;

long long ans;
int shop, customer[MAX_NUM], check[2];
//최대 전부 100만 
//최대 100만 * 100만 
//최악은 팀원은 없고 검사팀장만 가게수만큼 있을때, 그리고 검사인원이 1명일때
//브루트포스로 풀면 안됌. 1조임
//근데 생각해보니 노가다로 1조로 안하고 자료형만 long long해서 계산하면 되잖아

int main(){
    cin >> shop;

    for(int i=0; i<shop; i++){
        cin >> customer[i];
    }

    cin >> check[0] >> check[1];

    for(int i=0; i<shop; i++){
        //손님은 1명인데 팀장이 다 검사해서 -일수도 있으니까
        customer[i] -= check[0];
        if(customer[i] < 0)
            customer[0];
        ans += customer[i] / check[1];
        if((customer[i] % check[1]) != 0)
            ans += 1;
    }

    cout << ans << '\n';

    return 0;
}