
def incrementArray(digits):
    for i in range(len(digits) - 1, -1, -1):
        #handle digits other than 9
        if digits[i] != 9:
            digits[i] += 1
            break
        #handle 9's in positions other than index 0
        elif i != 0:
            digits[i] = 0
        #handle if a 9 is in index 0
        else:
            digits[0]= 0
            digits.insert(0, 1)

def main():
    digits = [9, 9, 9]
    incrementArray(digits)
    print(digits)

if __name__ == '__main__':
    main()