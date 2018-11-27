def inverse_order(array):
    return [array[index] for index in range(len(array) - 1, -1, -1)]

def left_shift(array):
    new_array = [None] * len(array)

    for index in range(len(array)):
        new_array[index-1] = array[index]
    
    return new_array

# i did it this way to learn a new way 
def sort_by_decreasing(array):
    is_ordered = True 

    while(not array_is_ordered(array)):

        index = 0

        while(index < len(array) - 1):
            difference = array[index] - array[index + 1]

            # exchange smaller value for larger 
            if( difference < 0):
                array[index] += abs(difference)
                array[index + 1] -= abs(difference)

            index += 1 

    return array

def array_is_ordered(array):
    
    is_ordered = True 
    
    index = 0 

    while(index < len(array) - 1):
        if(array[index] - array[index + 1] < 0):
            is_ordered = False 
            return is_ordered
        index += 1 
    
    return is_ordered

amount_number = int(input())
numbers = [int(number) for number in (input().split(" "))]

print(*inverse_order(numbers))
print(*left_shift(numbers))
print(*sort_by_decreasing(numbers))
