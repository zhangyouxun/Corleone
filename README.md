# MyNote

```
int remove(int[] nums, int target) {
    int size = nums.lenght;
    for(int i = 0; i < size; i++) {
        if(nums[i] == target) {
            for(int j=i;j<(size-1);j++) {
                nums[j] = nums[j+1]
            }
            size--;
            i--;
        }
    }
    return size;
}
```
