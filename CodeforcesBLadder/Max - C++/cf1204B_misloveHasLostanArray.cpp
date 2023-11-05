// https://codeforces.com/problemset/problem/1204/B
// solved 11/4/23
// comments: why did that take so long and literally unintelligible lol

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
    ll n, a,b;

    cin >> n >> a >> b;
    //zero index
    a--;
    b--;

    ll retMn = 0;
    ll retMx = 0;
    ll curMn = 1;
    ll curMx = 1;
    for (int i=0; i<n; i++){
       retMn += curMn;
//       Out(curMn);
       retMx += curMx;
       if (i < a){
           curMn *=2;
           curMx *=2;
       } else if (i+1 > b){
            curMn = 1;
       } else {
           curMx *= 2;
           curMn=1;
       }
    }
//    retMn += curMn;
//    retMx += curMx;
    Out("" + to_string(retMn) + " " + to_string(retMx));

}

int main(){
    ios::sync_with_stdio(0);cin.tie(0); cout.tie(0);

//    ll T = 1; cin >> T;
//    while(T --){
        solve();
//    }

    return 0;
}
