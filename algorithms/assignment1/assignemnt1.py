
def findAddends(nums, target): 
    for i in range(len(nums) - 1):
        for j in range(i + 1, len(nums)):
            if nums[i] + nums[j] == target:
                return(i, j)
            
    return -1                   
                    
def main():
    print(findAddends([2, 7, 11, 15], 9))
    print(findAddends([3, 2, 4], 6))
    print(findAddends([3, 3], 6))    
    
if __name__ == '__main__':
    main()