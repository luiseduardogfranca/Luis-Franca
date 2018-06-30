# function to the factorization of the number
def factorization(number):
    factors = [] 
    
    #factor initialize with value two
    factor = 2 

    while (number != 1):
        if (number % factor == 0):
            factors.append(factor)
            number = number / factor

        else:
            factor += 1
    return factors

# function to the return if number is prime
def return_number_prime(list_number):
    number_prime = [] 
    for number in list_number:
        if(number >= 2):
            check = True 

            for prime in range(1, int(number / 2)):
                if ((prime != 1) and (number % prime == 0)):
                    check = False
        
            if (check):
                number_prime.append(number)
        
    return number_prime

# function to check if number is prime
def is_prime(number):
    check = True

    for prime in range(1, int(number / 2)):
        if ((prime != 1) and (number % prime == 0)):
            check = False

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
    if(value % 2 != 0):
        if (is_prime(value)):
            print(value)

        else:
            # get all numbers prime in factorization
            number_prime = return_number_prime(factorization(value))
            print(number_prime)
            # print(return_number_prime([i for i in range(1000)]))
            print(sum_array(number_prime))
    else:
        # get all numbers prime in factorization
        number_prime = return_number_prime(factorization(value))

        # print(return_number_prime([i for i in range(1000)]))
        print(sum_array(number_prime))