#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
vector<int> nums;
int a,b,c;

int main() {
    cin >> a >> b >> c;
    nums.push_back(a);
    nums.push_back(b);
    nums.push_back(c);

    sort(nums.begin(), nums.end());
    cout << nums[1] << '\n';
    return 0;
}