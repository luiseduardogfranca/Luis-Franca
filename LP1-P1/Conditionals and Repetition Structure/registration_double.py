
# input of registration numbers 
programming2 = [int(number) for number in (input().split(" ")) if (number != "")]
programming3 = [int(number) for number in (input().split(" ")) if (number != "")]

equal_registrations = [] 

# check for equal registrations numbers in lists
for number in programming2:
    if (number in programming3):
        equal_registrations.append(number)
    
for number in equal_registrations:
    print(number, end=" ")

# break line
print()
