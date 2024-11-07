#include <iostream>
#include <vector>
using namespace std;

int n, k; //0과 1중에 선택할 숫자 000 001 011 ....
vector<int> answer;

void choose(int curr_num);
void print();

int main() {
    cin >> k >> n; //1이상 k이하 숫자 고름, n번 반복
    choose(1); //첫번째 자리부터 시작
    return 0;
}

void choose(int curr_num){
    if(curr_num == n+1){
        print();
        return;
    } //n번째 자리까지만 하면 되니까

    for(int i=1; i<=k; i++){
        answer.push_back(i);
        choose(curr_num+1);
        answer.pop_back();
    }
}

void print(){
    for(int i=0; i<answer.size(); i++){
        cout << answer[i] << " ";
    }
    cout << '\n';
}