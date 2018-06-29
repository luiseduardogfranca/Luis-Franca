# input 
n = int(input(""))
is_triangular = False 

# verify if the value 'n' is a triangular number 
number1 = 1 
number2 = 2 
number3 = 3

while(is_triangular == False and (number1 * number2 * number3) < n):
    
    if((number1 * number2 * number3) < n):
        number1 = number2
        number2 = number3 
        number3 += 1

    if((number1 * number2 * number3) == n):
        is_triangular = True

if(is_triangular):
    print("%d * %d * %d = %d" %(number1, number2, number3, n))
    print("Verdadeiro")

else:
    print("Falso")