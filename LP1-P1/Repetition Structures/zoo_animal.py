register_animal = lambda type_animal, weight, country: {'type_animal': type_animal, 'weight': weight, 'country': country}

def animal_amount(dictionary, type_animal, country="ALL"):
    amount = 0 
    for key, row in dictionary.items():

        if (row["type_animal"].upper() == type_animal.upper() and country == "ALL"):
            amount += 1

        elif (row["type_animal"].upper() == type_animal.upper() and row["country"].upper() == country.upper()):
            amount += 1

    return amount

def average_weight(dictionary, type_animal, country="ALL"):
    average = 0 
    amount = 0 

    for key, row in dictionary.items():
        if (row['type_animal'].upper() == type_animal.upper() and country.upper() == "ALL"):
            average += row["weight"]
            amount += 1 

        elif (row['type_animal'].upper() == type_animal.upper() and row["country"].upper() == country.upper()):
            average += row["weight"]
            amount += 1
    
    return average / amount if average !=  0 and amount != 0 else 0 

database = {}
continue_input = "continue"
index = 0 

while (continue_input.upper() != "PARAR"):
    type_animal = input("")
    weight = float(input(""))
    country = input("")

    database[index] = register_animal(type_animal, weight, country)

    continue_input = input("")
    index += 1

print(animal_amount(database, "MACACO"))
print("%.2f" % (average_weight(database, "TIGRE")))
print(animal_amount(database, "COBRA", "VENEZUELA"))
