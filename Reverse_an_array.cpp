#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;

void  reverseArray(vector<int>& arr){


int left =0;
int right = arr.size() -1;

while(left<right){
    int temp = arr[left];

    arr[left] = arr[right];

    arr[right] = temp;

    left++;

    right --;

}

}
void usingSTL(vector<int>& ar){

    reverse(ar.begin(),ar.end());
}

int main(){

    vector<int> arr = {1, 2, 3, 4, 5};

    vector<int> a = { 8,10,15,20,30};

    reverseArray(arr);
    usingSTL(a);

    for(int i=0;i<arr.size();i++)

    cout<<arr[i]<<",";

    cout<<endl;

     for(int i=0;i<a.size();i++)

    cout<<a[i]<<",";



    return 0;
    
}



