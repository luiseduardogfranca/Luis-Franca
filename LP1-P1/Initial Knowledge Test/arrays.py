def min_value(array):
    min = array[0]

    for value in array:
        if value < min:
            min = value
    return min


def max_value(array):
    max = array[0]

    for value in array:
        if value > max:
            max = value
    return max


# returns array with the "n" maximum values
def sort_array_max(array, m):
    new_array = []

    for index in range(m):

        max = max_value(array)
        new_array.append(max)
        array.remove(max)

    return new_array


# returns array with the "n" minimun values
def sort_array_min(array, k):
    new_array = []

    for index in range(k):

        min = min_value(array)
        new_array.append(min)
        array.remove(min)

    return new_array


# input
size_arrayA, size_arrayB = input("").split(" ")
size_arrayA, size_arrayB = int(size_arrayA), int(size_arrayB)

k, m = input("").split(" ")
k, m = int(k), int(m)

arrayA = input("").split(" ")
arrayA = [int(i) for i in arrayA]

arrayB = input("").split(" ")
arrayB = [int(i) for i in arrayB]

# set arrays with only values max and min
arrayA = sort_array_min(arrayA, k)
arrayB = sort_array_max(arrayB, m)

# verify
count = 0

for valueA in arrayA:
    count_valueB = 0

    for valueB in arrayB:
        if valueA < valueB:
            count_valueB += 1

    if count_valueB == m:
        count += 1

if count >= k:
    print("YES")

else:
    print("NO")
