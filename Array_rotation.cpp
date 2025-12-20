# include<iostream>
# include<vector>

using namespace std;

void arrayRotation(vector<int>& nums, int k){

    int n = nums.size();

    vector<int> temp(n);

    for(int i =0;i<nums.size();i++){

        temp[(i+k)%nums.size()] = nums[i];



    }

    nums = temp;
}

int main(){

    vector<int> n = {1,2,3,4,5,6};

    int k =2;


    arrayRotation(n, k);

    for(int i =0;i<n.size();i++){

        cout<<n[i]<<" ";
    }    


        return 0;
    
}