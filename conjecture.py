# function to the factorization of the number
def factorization(number):
    factors = [] 

    if (is_prime(number)):
        factors.append(number)
        return factors


    else:
        #factor initialize with value two
        factor = 2 
        while (number != 1):
            if (number % factor == 0):
                if ( ((factor % 2 != 0) and is_prime(factor)) or (factor == 2) ):
                    factors.append(factor)

                number = number / factor

            else:
                factor += 1
        return factors

# function to check if number is prime
def is_prime(number):
    check = True

    # only the number 2 is prime 
    if (number != 2 and number % 2 == 0):
        check = False
        return check

    for prime in range(1, int(number / 2), 2):
        if ((prime != 1) and (number % prime == 0)):
            check = False
            return check

    return check

# function to the operation em array of numbers prime 
def sum_array(array):
    list = [] 

    if (len(array) > 0):
        aux = array[0]
        count = 0

        # find repeated numbers 
        for index in range(len(array)):

            # check if find a number different of the value in variable 'aux'
            if ((array[index] != aux) ):    
                # save value in list 
                list.append((count * aux))
                count = 1
                aux = array[index]

            else: 
                count += 1

            # finish if index is equals to the length of array 
            if ((index + 1) == len(array)):
                list.append((count * array[index]))

    # sum values in list
    sum = 0 
    for number in list:
        sum += number
    
    return sum

# input number 
numbers = []
number = None
while (number != 0):
    number = int(input(""))
    if (number != 0):
        numbers.append(number)

for value in numbers:
    # get all numbers prime in factorization
    number_prime = factorization(value)

    # print(return_number_prime([i for i in range(1000)]))
    print(sum(number_prime))

