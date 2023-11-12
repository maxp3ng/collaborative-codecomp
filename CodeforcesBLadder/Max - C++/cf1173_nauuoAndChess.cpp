// https://codeforces.com/problemset/problem/1173/B
// solved 11/12/23
// comments: there is a pattern! go around the top and right edge always

#include <bits/stdc++.h>

using namespace std;
using ll = long long;
const ll MXN = 2e5 + 10;
using str = string;
using db = long double;
using vll = vector<ll>;
using vi = vector<int>;
using pii = pair<int, int>;

#define endl "\n";t
#define F first
#define S second
#define pb push_back
#define mp make_pair

#define Rep(i, x, y)   for (__typeof(x) i=x; i < y; i++)
#define Repi(i, x, y)  for (__typeof(x) i=x; i > y; i--)
#define vOut(v) Rep(i,0,v.size()){cout << v[i] << " ";} cout << endl
#define Out(s)  cout << (s) << '\n'
#define OutRet(s)  cout << (s) << '\n'; return
#define ts(n) to_string(n)

void solve(){
    ll n;
    cin >> n;

    if (n==1){
        Out(1);
        OutRet("1 1");
    }
    ll m = 2;
    while(!(m*2 > n)){
        m++;
    }

    Out(m);
    for (int i=1;i<=m; i++){
        Out("1 " + to_string(i));
        n--;
        if (n==0){return;}
    }
    for (int i=2; i<=m; i++){
        Out(to_string(i) + " " + to_string(m));
        n--;
        if (n==0){return;}
    }
    return;

}

int main(){
    ios::sync_with_stdio(0);cin.tie(0); cout.tie(0);

//    ll T = 1; cin >> T;
//    while(T --){
        solve();
//    }

    return 0;
}
