#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> answer;
void print();
void choose(int curr_num);
bool IsBeautiful();
int n, sum;

//n자리 아름다운 수의 개수 출력
int main() {
    cin >> n; //몇자리 수인지 체크
    choose(1); //1부터 시작

    cout << sum << '\n';
    return 0;
}

void choose(int curr_num){
    if(curr_num == n+1){ //여기서 +1하면 될 것 같은데
        if(IsBeautiful())
            sum++;
        return;
    }

    for(int i=1; i<=4; i++){ //숫자는 총 1이상 4 이하
        answer.push_back(i);
        choose(curr_num+1);
        answer.pop_back();
    }
}

bool IsBeautiful(){
    //각 숫자만큼 연속적으로 있는지 확인
    for(int i=0; i<n; i+=answer[i]){
        if(i+answer[i]-1 >=n)
            return false;
        for(int j=i; j<i+answer[i]; j++)
            if(answer[j] != answer[i])
                return false;
    }
    return true;
}