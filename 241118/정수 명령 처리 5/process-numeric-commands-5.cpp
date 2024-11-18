#include <iostream>
#include <vector>

using namespace std;
string op;
vector<int> arr;
int test,num;

int main() {
    cin >> test;
    for(int i=0; i<test; i++){
        cin >> op;
        if(op == "push_back"){
            cin >> num;
            arr.push_back(num);
        }
        else if(op == "get"){
            cin >> num;
            cout << arr[num] <<'\n';
        }
        else if(op == "size"){
            cout << arr.size() <<'\n';
        }
        else if(op == "pop_back"){
            arr.pop_back();
        }
        else
            cout << "잘못된 접근입니다" <<'\n';
    }

    return 0;
}