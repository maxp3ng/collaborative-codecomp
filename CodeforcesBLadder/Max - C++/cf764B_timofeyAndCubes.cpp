// https://codeforces.com/problemset/problem/764/B
// solved 11/9/23
// comments: think it through in layers, and store -> a bit of a messy solution but it works

#include <bits/stdc++.h>

using namespace std;
using ll = long long;
const ll MXN = 2e5 + 10;
using str = string;
using db = long double;
using vll = vector<ll>;
using vi = vector<int>;
using pii = pair<int, int>;

#define endl "\n";
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
    ll n, m;
    cin >> n;
    vll v(n,0);

    if (n%2==1) {
        for (int i = 0; i < n / 2; i++) {
            ll in;
            cin >> in;
            if (i % 2 == 0) {
                v[n - i - 1] = in;
            } else {
                v[i] = in;
            }
        }
        for (int i = n / 2; i < n; i++) {
            ll in;
            cin >> in;
            if (i % 2 == 0) {
                v[n - i - 1] = in;
            } else {
                v[i] = in;
            }
        }
    } else {
        for (int i = 0; i < n/2; i++) {
            ll in;
            cin >> in;
            if (i % 2 == 0) {
                v[n - i - 1] = in;
            } else {
                v[i] = in;
            }
        }
        for (int i = n/2; i < n; i++) {
            ll in;
            cin >> in;
            if (i % 2 == 1) {
                v[n - i - 1] = in;
            } else {
                v[i] = in;
            }
        }

    }
    vOut(v);
}

int main(){
    ios::sync_with_stdio(0);cin.tie(0); cout.tie(0);

//    ll T = 1; cin >> T;
//    while(T --){
        solve();
//    }

    return 0;
}
