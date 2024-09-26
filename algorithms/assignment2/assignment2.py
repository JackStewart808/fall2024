nums = [1, 2, 3, 4, 5]
target = 6
for i in range(len(nums)):
    for j in range(i):
        if nums[i] + nums[j] == target:
            print(f"The Answer You Are Looking For Is {i}, and {j}")
            