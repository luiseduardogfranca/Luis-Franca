# function for remove zero on left  
def remove_zero(number):
    index = 0 
    new_number = ""

    # check how far equals zero
    while (index < len(number) and number[index] == "0" ):
        index += 1
    
    # if the index value is equals to the length of the number, all numbers will be zeros
    if(index == len(number)):
        new_number = "0"
        
    elif ((index == 0 and number[index] == "0") or (number[index - 1] == "0")):
        for i in range(index, len(number)):
            new_number += number[i]
    
    else:
        new_number = number

    return new_number

# storage data
numbers = [] 
number = None 


#input 
while (number != "0"):
    number = input("")

    if (number != "0"):
        number = remove_zero(number)
        numbers.append(number)

#output 
for number in numbers:
    aux = ""

    for index in range(len(number) - 1 , -1 , -1):
        aux += "[" + number[index] + "]"
    
    print(aux)
        