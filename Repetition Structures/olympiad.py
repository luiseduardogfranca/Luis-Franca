
register_modality = lambda gold, silver, bronze: {"gold": gold, "silver": silver, "bronze": bronze}

def create_table(arr1, arr2, arr3, arr4=None):
    array = []

    if (arr4 == None):
        for index in range(len(arr1)):
            array.append([arr1[index], arr2[index], arr3[index]])

    return array 

def create_scoreboard(database, total):
    arr_gold = [0] * total
    arr_silver = [0] * total
    arr_bronze = [0] * total
    
    for key, row in database.items():
        arr_gold[row['gold'] - 1] += 1 
        arr_silver[row['silver'] - 1] += 1 
        arr_bronze[row['bronze'] - 1] += 1

    return create_table(arr_gold, arr_silver, arr_bronze)

database = {} 
amount_contry, amount_modality = input("").split(" ")

for index in range(int(amount_modality)):
    gold, silver, bronze = input("").split(" ")

    database[index] = register_modality(int(gold), int(silver), int(bronze))

table = create_scoreboard(database, int(amount_contry))

for index in range(len(table)):
    index = table.index(max(table))
    table[index] = []
    print(index + 1)
