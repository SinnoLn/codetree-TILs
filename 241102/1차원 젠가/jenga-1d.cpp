#include <iostream>
using namespace std;
int n,x1,x2;
int end_block, end_tmp_block;
int genga[100];
int temp[100]; //중력으로 내려온걸 임시 저장하기 위한 배열

void delete_block(int x1, int x2);
int main() {
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> genga[i];
    }

    end_block = n;

    for(int i=0; i<2; i++){
        cin >> x1 >> x2;
        delete_block(x1, x2);
    }

    cout << end_block <<'\n';
    for(int i=0; i<end_block; i++){
        cout << genga[i] << '\n';
    }
    return 0;
}

void delete_block(int x1, int x2){
    end_tmp_block = 0; //임시 블록의 크기 초기화
    for(int i=0; i<end_block; i++){
        if(i >= (x1-1) && i <= (x2-1)) continue;
        temp[end_tmp_block] = genga[i];
        end_tmp_block++;
    }

    end_block = end_tmp_block;

    for(int i=0; i<end_block; i++){
        genga[i] = temp[i];
    }
}