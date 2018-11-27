# array of cars
cars = [] 

#input 
character = input("")
if (character != "N" and  character != "n"):
        year = int(input(""))
        velocity = float(input(""))

# input of data while character is different of "n" or "N"
while (character != "N" and character != "n"):

    #add on list cars
    cars.append([year, velocity])

    character = input("")
    
    if (character != "N" and  character != "n"):
        year = int(input(""))
        velocity = float(input(""))

# verify the greater speed, the greater year and average speed 
if (len(cars) > 0):

    greater_speed = cars[0][1] 
    greater_year = cars[0][0]
    average_speed = 0

    for car in cars:
        
        # verify speed 
        if (car[1] > greater_speed):
            greater_speed = car[1]

        # verify year 
        if(car[0] > greater_year):
            greater_year = car[0]
        
        # calculates average 
        average_speed += car[1]

    average_speed /= len(cars)

    # output 
    print("%.2f\n%d\n%.2f" %(greater_speed, greater_year, average_speed))

elif (len(cars) == 0):
    print("zero")