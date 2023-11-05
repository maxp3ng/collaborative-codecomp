// https://codeforces.com/problemset/problem/967/B
// solved 11/4/23
// comments: edge cases :sob:

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
    ll n,a,b;
    cin >> n >> a >> b;

    ll sum =0;
    vll v(n,0);
    for(int i=0; i<n; i++) {
       ll temp;
       cin >> temp;
        sum += temp;
       v[i] = temp;
    }
    if (a==b){
        Out(n-1);
    }

    ll first = v[0];
    ll c =  sum - floor((first*a*1.0)/(b*1.0));
    sort(v.begin()+1, v.end());
    reverse(v.begin()+1, v.end());
    ll s = 0;
    ll ret = 0;
    if (c < 0){
        OutRet("0");
    }
    for (int i=1; i<n; i++){
       if (s >= c){
           OutRet(ret);
       }
        s += v[i];
        ret++;
    }
}

int main(){
    ios::sync_with_stdio(0);cin.tie(0); cout.tie(0);

//    ll T = 1; cin >> T;
//    while(T --){
        solve();
//    }

    return 0;
}
