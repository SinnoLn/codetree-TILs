#include <iostream>
using namespace std;
int p1, p2;
char s1, s2;
int main() {

    cin >> p1 >> s1;
    cin >> p2 >> s2;

    if((p1>=19 && s1 == 'M') || (p2>=19 && s2 == 'M'))
        cout << 1 << '\n';
    else
        cout << 0 << '\n';


    return 0;
}