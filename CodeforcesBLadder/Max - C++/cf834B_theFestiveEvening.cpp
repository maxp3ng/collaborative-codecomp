// https://codeforces.com/problemset/problem/834/B
// solved 11/12/23
// comments: i wrote this in 13 minutes no debugging one go and literally went hysterical when it got accepted this is what  codecomp is  this is why everything is worth it this is

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
    ll n, m;
    cin >> n >> m;
    str s;
    cin >> s;


    vll v(n,0);

    for (char c = 'A'; c <= 'Z'; c++){
        ll startIndex = -1;
        for (int i=0; i<n; i++){
            if(s[i] == c){
                startIndex = i;
                break;
            }
        }
        if (startIndex == -1) continue;
        bool passedEnd = false;
        for (int i = n-1; i >= startIndex; i--){
            if (s[i] == c){
                passedEnd = true;
            }
            if (passedEnd){
                v[i]++;
            }
        }
    }
    for (int i=0; i<n; i++){
        if (v[i] > m){
            OutRet("YES");
        }
    }
    OutRet("NO");

}

int main(){
    ios::sync_with_stdio(0);cin.tie(0); cout.tie(0);

//    ll T = 1; cin >> T;
//    while(T --){
        solve();
//    }

    return 0;
}
