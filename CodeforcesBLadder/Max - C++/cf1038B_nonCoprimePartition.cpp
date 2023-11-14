// https://codeforces.com/problemset/problem/1038/B
// solved 11/13/23
// comments: a whole lot of yapping for a whole lot of nothing

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
    cin >> n;
    str ret1 = "";
    str ret2 = "";
    ll c1 = 0;
    ll c2 = 0;

    if (n==1 || n==2){OutRet("No");}
    if (n%2 == 0){
        for (ll i=0; i<n; i++){
            if (i%2==0){
                ret1+= to_string(i + 1) + " ";
                c1++;
            } else {
                ret2+= to_string(i + 1) + " ";
                c2++;
            }
        }
    } else {
        for (ll i=0; i<n; i++){
            if (i==n/2){
                ret1 = to_string(i + 1) + " ";
                c1++;
            } else {
                ret2 += to_string(i + 1) + " ";
                c2++;
            }
        }
    }

    Out("Yes");
    Out(to_string(c1)+ " " + ret1.substr(0,ret1.size()-1));
    OutRet(to_string(c2)+ " " + ret2.substr(0,ret2.size()-1));

}

int main(){
    ios::sync_with_stdio(0);cin.tie(0); cout.tie(0);

//    ll T = 1; cin >> T;
//    while(T --){
        solve();
//    }

    return 0;
}
