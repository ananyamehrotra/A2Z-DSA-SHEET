class Solution {
public:
    vector<int> numberGame(vector<int>& nums) {
        vector<int> ans;
        while (!nums.empty()) {
            int alice = INT_MAX;
            int aliceIndex = -1;
            for (int i = 0; i < nums.size(); i++) {
                if (nums[i] < alice) {
                    alice = nums[i];
                    aliceIndex = i;
                }
            }
            nums.erase(nums.begin() + aliceIndex);
            int bob = INT_MAX;
            int bobIndex = -1;
            for (int i = 0; i < nums.size(); i++) {
                if (nums[i] < bob) {
                    bob = nums[i];
                    bobIndex = i;
                }
            }
            nums.erase(nums.begin() + bobIndex);
            ans.push_back(bob);
            ans.push_back(alice);
        }
        return ans;
    }
};