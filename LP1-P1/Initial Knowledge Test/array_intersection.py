def min_value(array):
    min = array[0]

    for value in array:
        if value < min:
            min = value
    return min


# function to sort in ascending order
def sort_array(array):
    new_array = []

    for index in range(len(array)):

        min = min_value(array)
        new_array.append(min)
        array.remove(min)

    return new_array


# array for the numbers storage
first_array = [None] * 20
second_array = [None] * 20
array_intersection = []

# input numbers
for index in range(len(first_array) + len(second_array)):

    if index < len(first_array):
        first_array[index] = int(input(""))

    else:
        second_array[len(second_array) - index] = int(input(""))

# verify intersection
for value in first_array:
    value_okay = False

    for second_value in second_array:
        if value == second_value:
            value_okay = True

    # verify if value already exists in intersection array
    if value_okay:
        for intersection in array_intersection:
            if value == intersection:
                value_okay = False

    if value_okay:
        array_intersection.append(value)

if len(array_intersection) > 0:
    # sort the array
    array_intersection = sort_array(array_intersection)

    # output
    for value in array_intersection:
        print(value)
elif len(array_intersection) == 0:
    print("VAZIO")
